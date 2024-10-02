package cts.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import cts.models.UserDTO;
import cts.service.BookingService;
import cts.service.LoginService;
import feign.FeignException;

@Controller
@SessionAttributes(names = {"token"})
public class LoginController {
	
	
	@Autowired
	private LoginService service;
	
	@Autowired
	private BookingService bookingservice;
	
	@GetMapping("/ls")
	public String ls() {
		return "redirect:/so";
	}
	@PostMapping("/registrationn")
	public String registerr( @ModelAttribute UserDTO user,Model model, HttpSession session) {
		try {
			if(service.createNewUser(user))
			{
				model.addAttribute("message", "Account Created Successfully");
				session.setAttribute("mobile", user.getMobile());
				session.setAttribute("email", user.getEmail());
				System.out.println("Registration success");
			}
			
			return "l&s";
		}catch(FeignException e) {
			model.addAttribute("m", "You are already registered");
			System.out.println("Registration failed");
			return "l&s";
		}
		
	}
	
	
	@PostMapping("/home")
	public String isValid(@RequestParam("username") String username, @RequestParam("password") String password, Model m, HttpSession session,Model model) {
		try {
		
	 	String authToken = service.isValidLogin(username, password);
		session.setAttribute("username", username);
		session.setAttribute("token", authToken);
		System.out.println("Admin home");  
		return "redirect:/adminhome";
		}catch(FeignException e) {
			model.addAttribute("ma", "Invalid Credentials");
			System.out.println("Invalid Credentials"); 
			return "l&s";
		}
	}
	

	@GetMapping("/aboutus")
	public String aboutus(HttpSession session, Model m) {
		String token = (String) session.getAttribute("token");
		if (token == null) {
			System.out.println(token);
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			System.out.println("Invalid Credentials");  
			return "l&s";
		} else {
			System.out.println(token + " is toekn");
			m.addAttribute("sry", "Opps!! Login with your Credentials..");
			return "aboutus";
		}
		
	}
	
}
