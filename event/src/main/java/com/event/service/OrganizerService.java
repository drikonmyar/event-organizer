package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dto.OrganizerDTO;
import com.event.entity.OrganizerEntity;
import com.event.repository.OrganizerRepository;

@Service
public class OrganizerService {
	
	@Autowired
	private OrganizerRepository organizerRepository;
	
	public String addOrganizer(OrganizerDTO organizerDTO){
		OrganizerEntity organizerEntity = organizerDTO.convertToEntity(organizerDTO);
		OrganizerEntity saveOrganizerDetails = organizerRepository.save(organizerEntity);
		return saveOrganizerDetails.getOrganizerId();
	}
}
