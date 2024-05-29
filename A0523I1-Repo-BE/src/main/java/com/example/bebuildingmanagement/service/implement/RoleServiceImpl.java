package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.IRoleRepository;
import com.example.bebuildingmanagement.service.interfaces.IRoleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoleServiceImpl implements IRoleService {
    IRoleRepository iRoleRepository;


}
