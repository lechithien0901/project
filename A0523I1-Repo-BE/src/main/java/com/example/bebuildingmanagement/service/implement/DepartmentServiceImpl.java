package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.IDepartmentRepository;
import com.example.bebuildingmanagement.service.interfaces.IDepartmentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DepartmentServiceImpl implements IDepartmentService {
    IDepartmentRepository iDepartmentRepository;
}
