package com.event.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dto.LoginDTO;
import com.event.entity.OrganizerEntity;
import com.event.exception.UserNotFoundException;
import com.event.repository.OrganizerRepository;

@Service
public class LoginService {
	
	@Autowired
	private OrganizerRepository organizerRepository;
	
	public boolean login(LoginDTO loginDTO) throws UserNotFoundException{
		Optional<OrganizerEntity> organizerEntity = organizerRepository.findByOrganizerId(loginDTO.getUserId());
		if(organizerEntity.isPresent()) {
			if(loginDTO.getUserPassword().equals(organizerEntity.get().getOrganizerPassword())) {
				return true;
			}
			return false;
		}
		throw new UserNotFoundException();
	}
	
}
