package com.example.bebuildingmanagement.repository;

import com.example.bebuildingmanagement.entity.Landing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILandingRepository extends JpaRepository<Landing, Long> {
}
