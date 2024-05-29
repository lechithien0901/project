package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.IPositionRepository;
import com.example.bebuildingmanagement.service.interfaces.IPositionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PositionServiceImpl implements IPositionService {
    IPositionRepository iPositionRepository;
}
