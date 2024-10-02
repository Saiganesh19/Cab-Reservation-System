package cts.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cts.models.User;

@FeignClient(name="login-service",url="http://localhost:8081/user")
public interface LoginProxy {
	
	 @PostMapping("/postuser")
		public ResponseEntity<User> create(@RequestBody User user);
	 
	 @GetMapping("/username/{username}")
	 	public ResponseEntity<User> getUserByUserName(@PathVariable("username") String  username);

}
