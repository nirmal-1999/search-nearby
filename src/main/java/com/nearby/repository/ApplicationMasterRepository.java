package com.nearby.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearby.model.ApplicationMasterEntity;


@Repository
public interface ApplicationMasterRepository extends JpaRepository<ApplicationMasterEntity, Integer> {
	
	Optional<ApplicationMasterEntity> findByTargetName(String targetName);
}
