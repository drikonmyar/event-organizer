package com.event.dto;

import com.event.entity.ParticipantEntity;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;



public class ParticipantDTO {
	
	private String participantId;
	
	@NotNull(message = "Participant name mandatory")
	private String participantName;
	
	@NotNull(message = "Participant year mandatory")
	@Min(value=1,message = "Participant year should be 1 i.e. First year to 4 i.e. Fourth year")
	@Max(value=4,message = "Participant year should be 1 i.e. First year to 4 i.e. Fourth year")
	private int participantYear;
	
	@NotNull(message = "Participant department mandatory")
	@Pattern(regexp="^\\w{2,4}$",message = "Participant department should be in range of 2-4")
	private String participantDept;
	
	@NotNull(message = "Mobile number mandatory")
	@Digits(message="Mobile number should be of 10 digits", fraction = 0, integer = 10)
	@Min(value=1000000000, message="Mobile number should be of 10 digits")
	private Long participantMobileNo;
	
	@NotNull(message = "Mail ID mandatory")
	@Email(message="Provide a valid Mail ID")
	private String participantMail;
	
	@NotNull(message = "Password mandatory")
	@Pattern(regexp="^\\w{5,10}$",message = "Participant password should be in range of 5-10")
	private String participantPassword;
	
	
	



	public String getParticipantId() {
		return participantId;
	}


	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}


	public String getParticipantName() {
		return participantName;
	}


	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}


	public int getParticipantYear() {
		return participantYear;
	}


	public void setParticipantYear(int participantYear) {
		this.participantYear = participantYear;
	}


	public String getParticipantDept() {
		return participantDept;
	}


	public void setParticipantDept(String participantDept) {
		this.participantDept = participantDept;
	}


	public Long getParticipantMobileNo() {
		return participantMobileNo;
	}


	public void setParticipantMobileNo(Long participantMobileNo) {
		this.participantMobileNo = participantMobileNo;
	}


	public String getParticipantMail() {
		return participantMail;
	}


	public void setParticipantMail(String participantMail) {
		this.participantMail = participantMail;
	}


	public String getParticipantPassword() {
		return participantPassword;
	}


	public void setParticipantPassword(String participantPassword) {
		this.participantPassword = participantPassword;
	}
	
	



	public ParticipantEntity convertToEntity(ParticipantDTO participantDTO) {
		ParticipantEntity participantEntity = new ParticipantEntity();
		participantEntity.setParticipantName(participantDTO.getParticipantName());
		participantEntity.setParticipantYear(participantDTO.getParticipantYear());
		participantEntity.setParticipantDept(participantDTO.getParticipantDept());
		participantEntity.setParticipantMobileNo(participantDTO.getParticipantMobileNo());
		participantEntity.setParticipantMail(participantDTO.getParticipantMail());
		participantEntity.setParticipantPassword(participantDTO.getParticipantPassword());
		return participantEntity;
	}
	
}
