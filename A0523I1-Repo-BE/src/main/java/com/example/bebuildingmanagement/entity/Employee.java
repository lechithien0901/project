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
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(columnDefinition = "boolean default false")
    int isDeleted;

    @ManyToOne
    @JoinColumn(name = "department_id")
    Department department;

    @ManyToOne
    @JoinColumn(name = "position_id")
    Position position;

    @OneToOne
    @JoinColumn(name = "account_id")
    Account account;

}
