package com.betrybe.agrix.controller;

import com.betrybe.agrix.entity.FarmEntity;
import com.betrybe.agrix.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    

  @Autowired
  private FarmService farmService;

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

}
