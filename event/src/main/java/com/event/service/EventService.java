package com.event.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dto.EventDTO;
import com.event.entity.EventEntity;
import com.event.exception.NoEventException;
import com.event.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public String addEvent(EventDTO eventDTO){
		EventEntity eventEntity = eventDTO.convertToEntity(eventDTO);
		EventEntity saveEventDetails = eventRepository.save(eventEntity);
		return saveEventDetails.getEventId();
	}
	
	public List<EventDTO> checkEvent() throws NoEventException{
		List<EventEntity> allEvents = eventRepository.findAll();
		List<EventDTO> allEventsToDTO = new ArrayList<>();
		for(int i=0;i<allEvents.size();i++) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.convertToDTO(allEvents.get(i), eventDTO);
			allEventsToDTO.add(eventDTO);
		}
		if(!allEventsToDTO.isEmpty()) {
			return allEventsToDTO;
		}
		throw new NoEventException();
	}
}
