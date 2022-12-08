package com.event.dto;



import com.event.entity.OrganizerEntity;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;



public class OrganizerDTO {
	
	private String organizerId;
	
	@NotNull(message = "Organizer name mandatory")
	private String organizerName;
	
	@NotNull(message = "Organizer year mandatory")
	@Min(value=1,message = "Organizer year should be 1 i.e. First year to 4 i.e. Fourth year")
	@Max(value=4,message = "Organizer year should be 1 i.e. First year to 4 i.e. Fourth year")
	private int organizerYear;
	
	@NotNull(message = "Organizer department mandatory")
	@Pattern(regexp="^\\w{2,25}$",message = "Organizer department should be in range of 2-25")
	private String organizerDept;
	
	@NotNull(message = "Mobile number mandatory")
	@Digits(message="Mobile number should be of 10 digits", fraction = 0, integer = 10)
	@Min(value=1000000000, message="Mobile number should be of 10 digits")
	private Long organizerMobileNo;
	
	@NotNull(message = "Mail ID mandatory")
	@Email(message="Provide a valid Mail ID")
	private String organizerMail;
	
	@NotNull(message = "Password mandatory")
	@Pattern(regexp="^\\w{5,10}$",message = "Organizer password should be in range of 5-10")
	private String organizerPassword;
	
	@NotNull(message = "Event name mandatory")
	private String eventName;
	
	@Pattern(regexp="^\\w{2,25}$",message = "Event department should be in range of 2-25")
	private String eventDept;
	
	
	
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
	public String getOrganizerPassword() {
		return organizerPassword;
	}
	public void setOrganizerPassword(String organizerPassword) {
		this.organizerPassword = organizerPassword;
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
	public String getEventDept() {
		return eventDept;
	}
	public void setEventDept(String eventDept) {
		this.eventDept = eventDept;
	}
	
	public OrganizerEntity convertToEntity(OrganizerDTO organizerDTO) {
		OrganizerEntity organizerEntity = new OrganizerEntity();
		organizerEntity.setOrganizerName(organizerDTO.getOrganizerName());
		organizerEntity.setOrganizerYear(organizerDTO.getOrganizerYear());
		organizerEntity.setOrganizerDept(organizerDTO.getOrganizerDept());
		organizerEntity.setOrganizerMobileNo(organizerDTO.getOrganizerMobileNo());
		organizerEntity.setOrganizerMail(organizerDTO.getOrganizerMail());
		organizerEntity.setOrganizerPassword(organizerDTO.getOrganizerPassword());
		organizerEntity.setEventName(organizerDTO.getEventName());
		organizerEntity.setEventDept(organizerDTO.getEventDept());
		return organizerEntity;
	}
	
}
