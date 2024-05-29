package com.example.bebuildingmanagement.repository;

import com.example.bebuildingmanagement.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBuildingRepository extends JpaRepository<Building, Long> {
}
