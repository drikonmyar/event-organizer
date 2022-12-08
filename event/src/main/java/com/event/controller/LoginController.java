package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.dto.LoginDTO;
import com.event.exception.UserNotFoundException;
import com.event.service.LoginService;

@RestController
@CrossOrigin
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping(value = "/login")
	public ResponseEntity<Boolean> login(@RequestBody LoginDTO loginDTO) throws UserNotFoundException {
		if(loginService.login(loginDTO)==true) {
			return ResponseEntity.ok(true);
		}
		return ResponseEntity.ok(false);
	}
}
