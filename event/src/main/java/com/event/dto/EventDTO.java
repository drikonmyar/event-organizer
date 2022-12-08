package com.event.dto;



import com.event.entity.EventEntity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;



public class EventDTO {
	
	private String eventId;
	
	@NotNull(message = "Event name mandatory")
	private String eventName;
	
	@Pattern(regexp="^\\w{2,25}$",message = "Event department should be in range of 2-25")
	private String eventDept;
	
	private String eventDesc;
	
	@NotNull(message = "Team size mandatory")
	@Min(value=1,message = "Team size should be at least 1")
	private int teamSize;
	
	
	
	public String getEventId() {
		return eventId;
	}



	public void setEventId(String eventId) {
		this.eventId = eventId;
	}



	public String getEventName() {
		return eventName;
	}



	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public String getEventDept() {
		return eventDept;
	}



	public void setEventDept(String eventDept) {
		this.eventDept = eventDept;
	}



	public String getEventDesc() {
		return eventDesc;
	}



	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}



	public int getTeamSize() {
		return teamSize;
	}



	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}



	public EventEntity convertToEntity(EventDTO eventDTO) {
		EventEntity eventEntity = new EventEntity();
		eventEntity.setEventName(eventDTO.getEventName());
		eventEntity.setEventDept(eventDTO.getEventDept());
		eventEntity.setEventDesc(eventDTO.getEventDesc());
		eventEntity.setTeamSize(eventDTO.getTeamSize());
		return eventEntity;
	}
	
	public boolean convertToDTO(EventEntity eventEntity, EventDTO eventDTO) {
		eventDTO.setEventId(eventEntity.getEventId());
		eventDTO.setEventName(eventEntity.getEventName());
		eventDTO.setEventDept(eventEntity.getEventDept());
		eventDTO.setEventDesc(eventEntity.getEventDesc());
		eventDTO.setTeamSize(eventEntity.getTeamSize());
		return true;
	}
	
}
