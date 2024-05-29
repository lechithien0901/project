package com.example.bebuildingmanagement.repository;

import com.example.bebuildingmanagement.entity.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFloorRepository extends JpaRepository<Floor, Long> {
}
