package com.example.bebuildingmanagement.repository;

import com.example.bebuildingmanagement.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Long> {
}
