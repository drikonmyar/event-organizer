package com.event.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "organizertable")
public class OrganizerEntity {

	@Id
	@Column(name = "organizer_id")
	@GeneratedValue(generator = "custom")
	@GenericGenerator(name = "custom", strategy = "com.event.utility.OrganizerIdGenerator")
	private String organizerId;

	@Column(name = "organizer_name")
	private String organizerName;

	@Column(name = "organizer_year")
	private int organizerYear;

	@Column(name = "organizer_dept")
	private String organizerDept;

	private Long organizerMobileNo;
	
	private String organizerMail;
	
	private String organizerPassword;

	@Column(name = "event_name")
	private String eventName;

	@Column(name = "event_id")
	private String eventId;
	
	

	public String getOrganizerPassword() {
		return organizerPassword;
	}

	public void setOrganizerPassword(String organizerPassword) {
		this.organizerPassword = organizerPassword;
	}

	public Long getOrganizerMobileNo() {
		return organizerMobileNo;
	}

	public void setOrganizerMobileNo(Long organizerMobileNo) {
		this.organizerMobileNo = organizerMobileNo;
	}

	public String getOrganizerMail() {
		return organizerMail;
	}

	public void setOrganizerMail(String organizerMail) {
		this.organizerMail = organizerMail;
	}

	public String getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(String organizerId) {
		this.organizerId = organizerId;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getOrganizerYear() {
		return organizerYear;
	}

	public void setOrganizerYear(int organizerYear) {
		this.organizerYear = organizerYear;
	}

	public String getOrganizerDept() {
		return organizerDept;
	}

	public void setOrganizerDept(String organizerDept) {
		this.organizerDept = organizerDept;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	
	

}
