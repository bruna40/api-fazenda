package com.betrybe.agrix.controller;

import com.betrybe.agrix.dto.FarmDto;
import com.betrybe.agrix.entity.FarmEntity;
import com.betrybe.agrix.service.FarmService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Farm controller.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {
    
  private FarmService farmService;

  /**
   * Constructor.
   */
  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * Save a farm.
   */
  @PostMapping
  public ResponseEntity<FarmEntity> save(@RequestBody FarmEntity farmEntity) {
    try {
      FarmEntity farm = farmService.save(farmEntity);
      return ResponseEntity.status(HttpStatus.CREATED).body(farm);
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }

  /**
   * Get all farms.
   */
  @GetMapping
  public List<FarmDto> getAllFarms() {
    List<FarmEntity> allFarms = farmService.getAll();
    return allFarms.stream()
            .map(FarmDto::fromEntity)// convert entity to DTO
            .toList();
  }

  /**
   * Find farm by id.
   */
  @GetMapping("/{id}")
  public ResponseEntity<List<FarmEntity>> findFarmById(@PathVariable Long id) {
    try {
      List<FarmEntity> farm = farmService.findFarmById(id);
      return ResponseEntity.ok(farm);
    } catch (Exception e) {
      return ResponseEntity.notFound().build();
    }
  }

}
