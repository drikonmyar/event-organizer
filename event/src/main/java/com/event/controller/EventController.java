package com.event.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.dto.EventDTO;
import com.event.exception.NoEventException;
import com.event.service.EventService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
public class EventController {

	@Autowired
	private EventService eventService;

	@PostMapping(value = "/addevent")
	public ResponseEntity<String> addEvent(@Valid @RequestBody EventDTO eventDTO, Errors errors) {

		String response = "";

		if (errors.hasErrors()) {
			response = errors.getAllErrors().stream().map(ObjectError::getDefaultMessage)
					.collect(Collectors.joining(", "));
		}
		else {
			response = eventService.addEvent(eventDTO);
		}
		
		return ResponseEntity.ok(response);

	}
	
	@GetMapping(value="/checkevent")
	public List<EventDTO> checkEvent() throws NoEventException{
		return eventService.checkEvent();
	}
}
