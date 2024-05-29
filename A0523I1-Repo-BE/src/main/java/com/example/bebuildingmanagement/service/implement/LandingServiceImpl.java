package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.dto.request.LandingRequestDTO;
import com.example.bebuildingmanagement.dto.response.LandingResponseDTO;
import com.example.bebuildingmanagement.entity.Landing;
import com.example.bebuildingmanagement.repository.ILandingRepository;
import com.example.bebuildingmanagement.service.interfaces.ILandingService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LandingServiceImpl implements ILandingService {
    ILandingRepository iLandingRepository;
    ModelMapper modelMapper;

    @Override
    public LandingResponseDTO createLanding(LandingRequestDTO landingRequestDTO) {
        iLandingRepository.save(modelMapper.map(landingRequestDTO, Landing.class));

        return null;
    }

    @Override
    public List<LandingResponseDTO> showListLanding() {
        List<Landing> listLanding = iLandingRepository.findAll();
        List<LandingResponseDTO> landingResponseDTOList = listLanding.stream()
                .map(listNew -> modelMapper.map
                        (listNew, LandingResponseDTO.class))
                .collect(Collectors.toList());
        System.out.println(landingResponseDTOList);

        return landingResponseDTOList;
    }

    @Override
    public LandingResponseDTO findLanding(Long id) {
        return modelMapper.map(iLandingRepository.findById(id),LandingResponseDTO.class);
    }

    @Override
    public void deleteLanding(Long id) {
        iLandingRepository.deleteById(id);

    }
}
