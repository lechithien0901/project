package com.example.bebuildingmanagement.dto.response;

import com.example.bebuildingmanagement.entity.Permission;
import jakarta.persistence.ManyToMany;

import java.util.Set;

public class RoleResponseDTO {
    Long id;

    String name;
    String description;
    Set<PermissionResponseDTO> permissions;
}
