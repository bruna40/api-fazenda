package com.betrybe.agrix.dto;

import com.betrybe.agrix.entity.FarmEntity;

/**
 * A classe FarmDTO é um objeto de transferência de dados que representa uma fazenda.
 * Ela é utilizada para transportar informações sobre a fazenda, como ID, nome e tamanho.
 */
public record FarmDto(Long id, String name, Double size) {
  /**
   * Convert entity to DTO.
   */
  public static FarmDto fromEntity(FarmEntity farmEntity) {
    return new FarmDto(farmEntity.getId(), farmEntity.getName(), farmEntity.getSize());
  }
}
