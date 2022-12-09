package com.event.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.dto.OrganizerDTO;
import com.event.exception.NoEventException;
import com.event.service.OrganizerService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
public class OrganizerController {

	@Autowired
	private OrganizerService organizerService;

	@PostMapping(value = "/addorganizer")
	public ResponseEntity<String> addOrganizer(@Valid @RequestBody OrganizerDTO organizerDTO, Errors errors) throws NoEventException {

		String response = "";

		if (errors.hasErrors()) {
			response = errors.getAllErrors().stream().map(ObjectError::getDefaultMessage)
					.collect(Collectors.joining(", "));
		}
		else {
			response = organizerService.addOrganizer(organizerDTO);
		}
		
		return ResponseEntity.ok(response);

	}
}
