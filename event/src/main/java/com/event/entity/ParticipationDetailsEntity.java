package com.event.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "participationdetailstable")
public class ParticipationDetailsEntity {

	@Id
	@Column
	@GeneratedValue(generator = "custom")
	@GenericGenerator(name = "custom", strategy = "com.event.utility.ParticipationIdGenerator")
	private String participationId;

	@Column
	private String participantId;

	@Column
	private String eventId;

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

	
	
	

}
