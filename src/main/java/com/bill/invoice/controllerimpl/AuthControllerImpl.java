package com.bill.invoice.controllerimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill.invoice.icontroller.IAuthController;
import com.bill.invoice.iservice.IAuthService;
import com.bill.invoice.model.Users;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthControllerImpl implements IAuthController {
	
    private static final Logger log =  LoggerFactory.getLogger(AuthControllerImpl.class);
    
    @Autowired
    private IAuthService iAuthService;
	
	@Override
	public ResponseEntity<String> login(String email, String passkey) {
		log.info("AuthControllerImpl class login method email {} ,passkey {}",email,passkey);
		return  iAuthService.login(email, passkey);
	}

	@Override
	public ResponseEntity<String> register(Users user) {
		log.info("AuthControllerImpl class register method user {}",user);
		return iAuthService.register(user);
	}
	

}
