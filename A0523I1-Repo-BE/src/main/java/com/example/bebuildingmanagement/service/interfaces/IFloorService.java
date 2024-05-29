package com.example.bebuildingmanagement.service.interfaces;

import com.example.bebuildingmanagement.dto.request.FloorRequestDTO;
import com.example.bebuildingmanagement.dto.response.FloorResponseDTO;

import java.util.List;

public interface IFloorService {
 void createFloor(FloorRequestDTO floorRequestDTO);
 List<FloorResponseDTO> getFloor();
 FloorResponseDTO findFloor(Long id);

 void deleteFloor(Long id);
}
