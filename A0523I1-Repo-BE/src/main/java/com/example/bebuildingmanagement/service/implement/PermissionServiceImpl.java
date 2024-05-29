package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.IPermissionRepository;
import com.example.bebuildingmanagement.service.interfaces.IPermissionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PermissionServiceImpl implements IPermissionService {
    IPermissionRepository iPermissionRepository;
}
