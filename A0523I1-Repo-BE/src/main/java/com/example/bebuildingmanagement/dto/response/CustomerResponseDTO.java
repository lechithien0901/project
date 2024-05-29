package com.example.bebuildingmanagement.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponseDTO {
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
}
