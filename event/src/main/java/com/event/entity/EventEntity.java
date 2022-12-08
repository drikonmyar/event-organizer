package com.event.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eventtable")
public class EventEntity {

	@Id
	@Column(name = "event_id")
	@GeneratedValue(generator = "custom")
	@GenericGenerator(name = "custom", strategy = "com.event.utility.EventIdGenerator")
	private String eventId;

	@Column(name = "event_name")
	private String eventName;
	
	@Column(name = "event_dept")
	private String eventDept;
	
	@Column(name = "event_desc")
	private String eventDesc;

	@Column(name = "team_size")
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

	
	

}
