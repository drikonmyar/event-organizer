package com.event.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.event.dto.ParticipationDetailsDTO;
import com.event.entity.EventEntity;
import com.event.entity.ParticipantEntity;
import com.event.entity.ParticipationDetailsEntity;
import com.event.exception.NoEventException;
import com.event.exception.PasswordMismatchException;
import com.event.exception.UserNotFoundException;
import com.event.repository.EventRepository;
import com.event.repository.ParticipantRepository;
import com.event.repository.ParticipationDetailsRepository;

@Service
public class ParticipationService {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private ParticipationDetailsRepository participationDetailsRepository;
	
	public boolean participate(ParticipationDetailsDTO participationDetailsDTO) throws UserNotFoundException, NoEventException, PasswordMismatchException {
		Optional<ParticipantEntity> participantEntity = participantRepository.findByParticipantId(participationDetailsDTO.getParticipantId());
		if(participantEntity.isPresent()) {
			if(participationDetailsDTO.getParticipantPassword().equals(participantEntity.get().getParticipantPassword())) {
				Optional<EventEntity> eventEntity = eventRepository.findByEventId(participationDetailsDTO.getEventId());
				if(eventEntity.isPresent()) {
					ParticipationDetailsEntity participationDetailsEntity = participationDetailsDTO.convertToEntity(participationDetailsDTO);
					participationDetailsRepository.save(participationDetailsEntity);
					return true;
				}
				throw new NoEventException();
			}
			throw new PasswordMismatchException();
		}
		throw new UserNotFoundException();
	}
	
}
