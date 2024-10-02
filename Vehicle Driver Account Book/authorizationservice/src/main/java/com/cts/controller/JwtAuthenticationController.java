package com.cts.controller;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.config.JwtTokenUtil;
import com.cts.model.DAOUser;
import com.cts.model.JwtRequest;
import com.cts.model.JwtResponse;
import com.cts.model.JwtValidationResponseDTO;
import com.cts.model.UserDTO;
import com.cts.service.JwtUserDetailsService;

@RestController
@CrossOrigin

public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?>  createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);

		return   ResponseEntity.ok(new JwtResponse(token));
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
	
	
	
	
	@GetMapping(path = "/validate")
	
	public ResponseEntity<JwtValidationResponseDTO> validatingAuthorizationToken(
			 @RequestHeader(name = "Authorization") String tokenDup) {
		JwtValidationResponseDTO vaildatingDTO = new JwtValidationResponseDTO();
		
		String token = tokenDup.substring(7);
		try {
			UserDetails user = userDetailsService.loadUserByUsername(jwtTokenUtil.getUsernameFromToken(token));
			System.out.println(user);
			if (jwtTokenUtil.validateToken(token, user)) {
				
				vaildatingDTO.setStatus(true);
				return new ResponseEntity<>(vaildatingDTO, HttpStatus.OK);
			} else {
				throw new LoginException("Invalid Token");
			}
		} catch (Exception e) {
			
			vaildatingDTO.setStatus(false);
			return new ResponseEntity<>(vaildatingDTO, HttpStatus.BAD_REQUEST);
		}
		
	}
	@PostMapping("/signout")
	public DAOUser username(@RequestParam("username") String username) {
		
		return userDetailsService.username(username);
		
	}
	
	@PostMapping("/getuser")
    public DAOUser getUser(@RequestParam("username") String username) {
        return userDetailsService.getUser(username);
    }
	
	@GetMapping("/get")
    public List<DAOUser> get(){
        return userDetailsService.get();
    }
	
	@DeleteMapping("/delete")
    public void delete() {
        userDetailsService.delete();
    }
    
}