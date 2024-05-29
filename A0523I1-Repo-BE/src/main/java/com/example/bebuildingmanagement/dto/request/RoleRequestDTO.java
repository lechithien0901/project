package com.example.bebuildingmanagement.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleRequestDTO {
    String name;
    String description;
    Set<PermissionRequestDTO> permissions;
}
