package cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cts.models.DAOUser;
import cts.models.JwtRequest;
import cts.models.UserDTO;
import cts.proxy.AuthenticationServiceProxy;
import cts.proxy.LoginProxy;



@Service
public class LoginService {
	
	@Autowired
	private LoginProxy proxy;
	
@Autowired
	
	private AuthenticationServiceProxy authProxy;
	

public boolean createNewUser(UserDTO user) {
	ResponseEntity<?> userresp=authProxy.saveUser(user);
	
	
	if(userresp.getStatusCode().value() == 201)
		return true;

			
			return  false;
}
 

public String isValidLogin(String username, String password)
{
	
	JwtRequest request = new JwtRequest(username, password);
	ResponseEntity<?> response =	authProxy.createAuthenticationToken(request);
     
	String  token =  response.getBody().toString();

String authToken =	token.substring(7, token.indexOf("}"));
	
return authToken;

}

public DAOUser getUser(String username) {
    return authProxy.getUser(username);
}
}

