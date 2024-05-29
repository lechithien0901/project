package com.example.bebuildingmanagement.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerRequestDTO {

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
