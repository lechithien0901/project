package com.example.bebuildingmanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int term;
    Date startDate;
    Date endDate;
    String taxCode;
    double currentFee;
    String description;
    double deposit;

    @Column(columnDefinition="LONGTEXT")
    String content;

    @Column(columnDefinition = "boolean default false")
    boolean isDeleted;

    @OneToOne
    @JoinColumn(name = "landing_id")
    Landing landing;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    Employee employee;
}
