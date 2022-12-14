package com.event.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.entity.EventEntity;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, String> {
	public Optional<EventEntity> findByEventId(String eventId);
	public Optional<EventEntity> findByEventName(String eventName);
	public List<EventEntity> findByEventDept(String eventDept);
}
