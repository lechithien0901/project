package com.example.bebuildingmanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Landing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String code;
    String type;
    double area;
    String status;
    String description;
    double feePerMonth;
    double feeManager;

    @Column(columnDefinition = "boolean default false")
    boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "floor_id")
    Floor floor;
}
