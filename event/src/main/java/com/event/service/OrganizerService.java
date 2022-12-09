package com.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dto.EventDTO;
import com.event.dto.OrganizerDTO;
import com.event.entity.EventEntity;
import com.event.entity.OrganizerEntity;
import com.event.exception.NoEventException;
import com.event.repository.EventRepository;
import com.event.repository.OrganizerRepository;

@Service
public class OrganizerService {
	
	@Autowired
	private OrganizerRepository organizerRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	public String addOrganizer(OrganizerDTO organizerDTO) throws NoEventException{
		List<EventEntity> allEvents = eventRepository.findAll();
		for(int i=0;i<allEvents.size();i++) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.convertToDTO(allEvents.get(i), eventDTO);
			if(eventDTO.getEventName().equals(organizerDTO.getEventName())) {
				organizerDTO.setEventId(eventDTO.getEventId());
				OrganizerEntity organizerEntity = organizerDTO.convertToEntity(organizerDTO);
				OrganizerEntity saveOrganizerDetails = organizerRepository.save(organizerEntity);
				return saveOrganizerDetails.getOrganizerId();
			}
		}
		throw new NoEventException();
		
	}
}
