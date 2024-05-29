package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.IBuildingRepository;
import com.example.bebuildingmanagement.service.interfaces.IBuildingService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BuildingServiceImpl implements IBuildingService {
    IBuildingRepository iBuildingRepository;


}
