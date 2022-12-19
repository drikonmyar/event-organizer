package com.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.event.entity.ParticipationDetailsEntity;

@Repository
public interface ParticipationDetailsRepository extends JpaRepository<ParticipationDetailsEntity, String> {
}
