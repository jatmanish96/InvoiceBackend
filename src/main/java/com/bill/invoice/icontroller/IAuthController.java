package com.bill.invoice.icontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bill.invoice.model.Users;

public interface IAuthController {
	
	@GetMapping("/login")
	ResponseEntity<String>login(@RequestParam(name = "email",required = true)String email , @RequestParam(name="passkey",required = true)String passkey);
	
	@PostMapping("/Register")
	ResponseEntity<String> register(@RequestBody Users user);
	

}
