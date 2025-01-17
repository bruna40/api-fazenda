package com.betrybe.agrix.service;

import com.betrybe.agrix.entity.CropsEntity;
import com.betrybe.agrix.entity.FarmEntity;
import com.betrybe.agrix.exceptions.FarmNotFoundException;
import com.betrybe.agrix.repository.CropsRepository;
import com.betrybe.agrix.repository.FarmRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Farm service.
 */
@Service
public class FarmService {
    
  
  private FarmRepository farmRepository;
  private CropsRepository cropsRepository;

  public FarmService(FarmRepository farmRepository, CropsRepository cropsRepository) {
    this.farmRepository = farmRepository;
    this.cropsRepository = cropsRepository;
  }

  public FarmEntity save(FarmEntity farm) {
    return farmRepository.save(farm);
  }

  public List<FarmEntity> getAll() {
    return farmRepository.findAll();

  }

  /**
   * Find farm by id.
   */
  public FarmEntity getFarmById(Long id) {

    return farmRepository.findById(id)
           .orElseThrow(FarmNotFoundException::new);
  }

  /**
   * Create a crop.
   */
  public CropsEntity createCrop(CropsEntity cropsEntity, Long farmId) throws FarmNotFoundException {
    FarmEntity farm = getFarmById(farmId);
    
    cropsEntity.setFarm(farm);

    return cropsRepository.save(cropsEntity);
  }


}
