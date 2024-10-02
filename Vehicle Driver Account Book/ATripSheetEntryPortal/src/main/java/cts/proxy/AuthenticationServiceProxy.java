package cts.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cts.models.DAOUser;
import cts.models.JwtRequest;
import cts.models.JwtValidationResponseDTO;
import cts.models.UserDTO;

//import com.cts.booking.model.JwtValidationResponseDTO;
@FeignClient(name="authorization-service", url="http://localhost:8085")
public interface AuthenticationServiceProxy {
    @GetMapping(path = "/validate")
	
	public ResponseEntity<JwtValidationResponseDTO> validatingAuthorizationToken(
			 @RequestHeader(name = "Authorization") String tokenDup);

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) ;
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserDTO user);
    
    @PostMapping("/signout")
	public DAOUser username(@RequestParam("username") String username);
    
    @PostMapping("/getuser")
    public DAOUser getUser(@RequestParam("username") String username);
}
