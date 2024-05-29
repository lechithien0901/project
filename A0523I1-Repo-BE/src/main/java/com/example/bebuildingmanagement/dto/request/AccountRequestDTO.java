package com.example.bebuildingmanagement.dto.request;

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
public class AccountRequestDTO {
    Long id;

    String username;
    String password;

    Set<RoleRequestDTO> roles;
}
