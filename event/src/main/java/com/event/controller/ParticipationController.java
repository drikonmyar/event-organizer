package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.event.dto.ParticipationDetailsDTO;
import com.event.exception.NoEventException;
import com.event.exception.PasswordMismatchException;
import com.event.exception.UserNotFoundException;
import com.event.service.ParticipationService;

@RestController
@CrossOrigin
public class ParticipationController {

	@Autowired
	private ParticipationService participationService;

	@PostMapping(value = "/participate")
	public ResponseEntity<Boolean> participate(@RequestBody ParticipationDetailsDTO participationDetailsDTO) throws UserNotFoundException, NoEventException, PasswordMismatchException {
		if(participationService.participate(participationDetailsDTO)==true) {
			return ResponseEntity.ok(true);
		}
		return ResponseEntity.ok(false);
	}
}
