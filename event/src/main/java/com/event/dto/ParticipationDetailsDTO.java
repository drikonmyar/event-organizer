package com.event.dto;

import com.event.entity.ParticipationDetailsEntity;



public class ParticipationDetailsDTO {
	
	private String participationId;
	
	private String participantId;
	
	private String participantPassword;
	
	private String eventId;

	public String getParticipantPassword() {
		return participantPassword;
	}



	public void setParticipantPassword(String participantPassword) {
		this.participantPassword = participantPassword;
	}



	public String getParticipationId() {
		return participationId;
	}



	public void setParticipationId(String participationId) {
		this.participationId = participationId;
	}



	public String getParticipantId() {
		return participantId;
	}



	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}




	public String getEventId() {
		return eventId;
	}



	public void setEventId(String eventId) {
		this.eventId = eventId;
	}




	public ParticipationDetailsEntity convertToEntity(ParticipationDetailsDTO participationDetailsDTO) {
		ParticipationDetailsEntity participationDetailsEntity = new ParticipationDetailsEntity();
		participationDetailsEntity.setParticipantId(participationDetailsDTO.getParticipantId());
		participationDetailsEntity.setEventId(participationDetailsDTO.getEventId());
		return participationDetailsEntity;
	}
	
}
