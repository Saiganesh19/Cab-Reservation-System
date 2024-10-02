package com.cts;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.dao.UserDao;
import com.cts.model.DAOUser;

@SpringBootApplication
public class SpringBootHelloWorldApplication {
	
	@Autowired 
	private UserDao brepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	  @PostConstruct
		public void initData() {
			List<DAOUser> bookingList = Arrays.asList(
					
					new DAOUser(1,"admin2","$2a$10$2R4aEZ1Np1YEB4PuW68SQ.BvkTNOj6PcqEwm9cJyjn9E5S23JmTVq","admin2@gmail.com","8309503323",null));
			
			brepo.saveAll(bookingList);
		}
}