package com.event.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "participanttable")
public class ParticipantEntity {

	@Id
	@Column
	@GeneratedValue(generator = "custom")
	@GenericGenerator(name = "custom", strategy = "com.event.utility.ParticipantIdGenerator")
	private String participantId;

	@Column
	private String participantName;

	@Column
	private int participantYear;

	@Column
	private String participantDept;
	
	@Column
	private Long participantMobileNo;
	
	@Column
	private String participantMail;
	
	@Column
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
	
	

}
