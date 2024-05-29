package com.example.bebuildingmanagement.controller;

import com.example.bebuildingmanagement.dto.request.ApiResponseDTO;
import com.example.bebuildingmanagement.dto.request.LandingRequestDTO;
import com.example.bebuildingmanagement.dto.response.FloorResponseDTO;
import com.example.bebuildingmanagement.dto.response.LandingResponseDTO;
import com.example.bebuildingmanagement.service.interfaces.IFloorService;
import com.example.bebuildingmanagement.service.interfaces.ILandingService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/landing")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LandingController {
    ILandingService iLandingService;
    IFloorService iFloorService;

    @GetMapping
    List<LandingResponseDTO> getListAllLanding() {
        return iLandingService.showListLanding();
    }

    @PostMapping
    ApiResponseDTO<LandingResponseDTO> createLanding(@RequestBody @Valid LandingRequestDTO landingRequestDTO) {
        ApiResponseDTO<LandingResponseDTO> apiResponseDTO = new ApiResponseDTO<>();
        apiResponseDTO.setResult(iLandingService.createLanding(landingRequestDTO));
        return apiResponseDTO;

    }

    @GetMapping("/listFloor")
    ResponseEntity<List<FloorResponseDTO>> getListAllFloor() {
        List<FloorResponseDTO> floorResponseDTOList = iFloorService.getFloor();
        return new ResponseEntity<>(floorResponseDTOList, HttpStatus.OK);
    }


}
