package com.example.bebuildingmanagement.service.interfaces;

import com.example.bebuildingmanagement.dto.request.LandingRequestDTO;
import com.example.bebuildingmanagement.dto.response.LandingResponseDTO;

import java.util.List;

public interface ILandingService {
    LandingResponseDTO createLanding(LandingRequestDTO landingRequestDTO);
    List<LandingResponseDTO> showListLanding();
    LandingResponseDTO findLanding(Long id);
    void deleteLanding(Long id);
}
