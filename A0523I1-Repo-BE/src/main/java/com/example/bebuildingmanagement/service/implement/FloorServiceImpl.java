package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.dto.request.FloorRequestDTO;
import com.example.bebuildingmanagement.dto.response.FloorResponseDTO;
import com.example.bebuildingmanagement.entity.Floor;
import com.example.bebuildingmanagement.repository.IFloorRepository;
import com.example.bebuildingmanagement.service.interfaces.IFloorService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FloorServiceImpl implements IFloorService {
    IFloorRepository iFloorRepository;
    ModelMapper modelMapper;

    @Override
    public void createFloor(FloorRequestDTO floorRequestDTO) {
        Floor floor=modelMapper.map(floorRequestDTO,Floor.class);

        iFloorRepository.save(floor);


    }

    @Override
    public List<FloorResponseDTO> getFloor() {

        List<Floor> listFloor=iFloorRepository.findAll();

       List<FloorResponseDTO>floorResponseDTOS= listFloor.stream().map(listNew -> modelMapper.map(listNew,FloorResponseDTO.class)).collect(Collectors.toList());

        return floorResponseDTOS;
    }

    @Override
    public FloorResponseDTO findFloor(Long id) {
        Optional<Floor> floor=iFloorRepository.findById(id);
        FloorResponseDTO floorResponseDTO=modelMapper.map(floor,FloorResponseDTO.class);

        return floorResponseDTO;
    }



    @Override
    public void deleteFloor(Long id) {

    }
}
