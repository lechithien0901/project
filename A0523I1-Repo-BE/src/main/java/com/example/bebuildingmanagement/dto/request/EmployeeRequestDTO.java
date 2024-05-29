package com.example.bebuildingmanagement.dto.request;

import com.example.bebuildingmanagement.entity.Account;
import com.example.bebuildingmanagement.entity.Department;
import com.example.bebuildingmanagement.entity.Position;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeRequestDTO {

    Long id;
    String code;
    String name;
    Date dob;
    String gender;
    String address;
    String phone;
    String email;
    Date workDate;
    String salaryRank;

    DepartmentRequestDTO department;

    PositionRequestDTO position;

    AccountRequestDTO account;
}
