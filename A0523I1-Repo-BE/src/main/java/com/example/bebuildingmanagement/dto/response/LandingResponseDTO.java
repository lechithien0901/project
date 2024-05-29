package com.example.bebuildingmanagement.dto.response;

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
public class LandingResponseDTO {
    Long id;

    String code;
    String type;
    double area;
    String status;
    String description;
    double feePerMonth;
    double feeManager;
    FloorResponseDTO floor;
}
