package com.bill.invoice.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bill.invoice.iservice.IAuthService;
import com.bill.invoice.model.Users;
import com.bill.invoice.repository.IAuthRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service 
public class AuthServiceImpl implements IAuthService{

    private static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);
    
    @Autowired
    private IAuthRepository iAuthRepository;
	
	@Override
	public ResponseEntity<String> login(String email, String passskey) {
		// TODO Auto-generated method stub
		log.info("AuthServiceImpl class login method email {} ,passkey {}",email,passskey);
		 iAuthRepository.save(null);
		 return null;
	}

	@Override
	public ResponseEntity<String> register(Users user) {
		log.info("AuthServiceImpl class login method user {}", user);
		iAuthRepository.count(null);
		return null;
	}

	
}
