package com.example.bebuildingmanagement.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BuildingResponseDTO {
    Long id;
    String name;
    String codeTax;
    String phone;
    String email;
    String fax;
    String address;
}
