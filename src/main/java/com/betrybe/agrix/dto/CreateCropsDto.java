package com.betrybe.agrix.dto;

import com.betrybe.agrix.entity.CropsEntity;

/**
 * Create crops DTO.
 */
public record CreateCropsDto(String name, Double plantedArea) {
    
  public CropsEntity toEntity() {
    return new CropsEntity(name, plantedArea);
  }
}
