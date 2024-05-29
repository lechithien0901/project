package com.example.bebuildingmanagement.dto.request;

import com.example.bebuildingmanagement.entity.Floor;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LandingRequestDTO {

    Long id;
    String code;
    String type;
    double area;
    String status;
    String description;
    double feePerMonth;
    double feeManager;
    FloorRequestDTO floor;
}
