package com.example.bebuildingmanagement.dto.response;

import com.example.bebuildingmanagement.entity.Role;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountResponseDTO {

    Long id;
    String username;
    Set<RoleResponseDTO> roles;
}
