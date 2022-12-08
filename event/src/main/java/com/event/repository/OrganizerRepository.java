package com.event.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.entity.OrganizerEntity;

@Repository
public interface OrganizerRepository extends JpaRepository<OrganizerEntity, String> {
	public Optional<OrganizerEntity> findByOrganizerId(String organizerId);
}
