package com.example.bebuildingmanagement.repository;

import com.example.bebuildingmanagement.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContractRepository extends JpaRepository<Contract, Long> {

}
