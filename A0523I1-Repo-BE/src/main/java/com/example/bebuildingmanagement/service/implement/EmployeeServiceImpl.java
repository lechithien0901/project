package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.IEmployeeRepository;
import com.example.bebuildingmanagement.service.interfaces.IEmployeeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EmployeeServiceImpl implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository;
}
