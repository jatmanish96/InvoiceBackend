package com.bill.invoice.iservice;

import org.springframework.http.ResponseEntity;

import com.bill.invoice.model.Users;

public interface IAuthService {
	
	ResponseEntity<String> login(String email, String passskey);
	
	ResponseEntity<String> register(Users user);

}
