package com.betrybe.agrix.service;

import com.betrybe.agrix.dto.CropsDto;
import com.betrybe.agrix.exceptions.CropsNotFoundException;
import com.betrybe.agrix.repository.CropsRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Crops service.
 */
@Service
public class CropsService {

  private CropsRepository cropsRepository;

  public CropsService(CropsRepository cropsRepository) {
    this.cropsRepository = cropsRepository;
  }
    
  public List<CropsDto> getAll() {
    return CropsDto.fromEntityList(cropsRepository.findAll());
  }

  public CropsDto getById(Long id) {
    return CropsDto
      .fromEntity(cropsRepository.findById(id).orElseThrow(CropsNotFoundException::new));
  }

}
