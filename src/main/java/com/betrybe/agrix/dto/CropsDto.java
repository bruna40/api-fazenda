package com.betrybe.agrix.dto;

import com.betrybe.agrix.entity.CropsEntity;
import java.util.List;
import java.util.stream.Collectors;

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

  /**
   * Convert list of entities to list of DTOs.
   */
  public static List<CropsDto> fromEntityList(List<CropsEntity> cropsEntities) {
    return cropsEntities.stream()
      .map(CropsDto::fromEntity)
      .collect(Collectors.toList());
  }
}
