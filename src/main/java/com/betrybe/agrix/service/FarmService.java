package com.betrybe.agrix.service;

import com.betrybe.agrix.entity.FarmEntity;
import com.betrybe.agrix.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Farm service.
 */
@Service
public class FarmService {
    
  @Autowired
  private FarmRepository farmRepository;

  public FarmEntity save(FarmEntity farm) {
    return farmRepository.save(farm);
  }
}
