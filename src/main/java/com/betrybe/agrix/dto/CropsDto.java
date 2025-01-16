package com.betrybe.agrix.dto;

import com.betrybe.agrix.entity.CropsEntity;

/**
 * Crops DTO.
 */
public record CropsDto(Long id, String name, Double plantedArea, Long farmId) {
    
  /**
   * Convert entity to DTO.
   */
  public static CropsDto fromEntity(CropsEntity cropsEntity) {
    return new CropsDto(
      cropsEntity.getId(),
      cropsEntity.getName(),
      cropsEntity.getPlantedArea(),
      cropsEntity.getFarm().getId()
    );
  }
}
