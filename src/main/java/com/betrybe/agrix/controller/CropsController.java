package com.betrybe.agrix.controller;

import com.betrybe.agrix.dto.CropsDto;
import com.betrybe.agrix.entity.CropsEntity;
import com.betrybe.agrix.service.CropsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Crops controller.
 */
@RestController
@RequestMapping("/crops")
public class CropsController {
    
  private CropsService cropsService;

  /**
   * Constructor.
   */
  public CropsController(CropsService cropsService) {
    this.cropsService = cropsService;
  }

  @GetMapping  
  public List<CropsDto> getAllCrops() {
    return cropsService.getAll();
  }
  
  @GetMapping("/{id}")
  public CropsDto getCropById(@PathVariable Long id) {
    CropsEntity cropsEntity = cropsService.getById(id);
    return CropsDto.fromEntity(cropsEntity);
  }
  
}
