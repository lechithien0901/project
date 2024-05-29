package com.example.bebuildingmanagement.dto.response;

import com.example.bebuildingmanagement.entity.Customer;
import com.example.bebuildingmanagement.entity.Employee;
import com.example.bebuildingmanagement.entity.Landing;
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
public class ContractResponseDTO {
    Long id;

    int term;
    Date startDate;
    Date endDate;
    String taxCode;
    double currentFee;
    String description;
    double deposit;
    String content;
    LandingResponseDTO landing;
    CustomerResponseDTO customer;
    EmployeeResponseDTO employee;
}
