package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.dao.UserDao;
import com.cts.model.DAOUser;
import com.cts.model.UserDTO;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		DAOUser user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
	
	public DAOUser save(UserDTO user) {
        DAOUser newUser = new DAOUser();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        newUser.setEmail(user.getEmail());
        newUser.setMobile(user.getMobile());
        return userDao.save(newUser);
    }

	public DAOUser username(String username) {
		DAOUser user = userDao.findByUsername(username);
		
		user.setAuthToken(null);
		userDao.save(user);
		return user;
		
		
	}
	
	
	public DAOUser getUser(String username) {
        return userDao.findByUsername(username);
        
    }
	
	public void delete() {
        // TODO Auto-generated method stub
        userDao.deleteAll();
    }

	public List<DAOUser> get() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
}