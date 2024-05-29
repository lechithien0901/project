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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Date dob;
    String gender;
    String address;
    String email;
    String phone;
    String website;
    String companyName;
    String idCard;

    @Column(columnDefinition = "boolean default false")
    boolean isDeleted;
}
