package com.betrybe.agrix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Crops entity.
 */
@Entity
@Table(name = "crops")
public class CropsEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(name = "planted_area")
  private Double plantedArea;

  @ManyToOne
  @JoinColumn(name = "farm_id")
  private FarmEntity farm;
  
  public CropsEntity() {
  }
  
  /**
   * Constructor.
   */
  public CropsEntity(String name, Double plantedArea) {
    this.name = name;
    this.plantedArea = plantedArea;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getPlantedArea() {
    return plantedArea;
  }

  public FarmEntity getFarm() {
    return farm;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPlantedArea(Double plantedArea) {
    this.plantedArea = plantedArea;
  }

  public void setFarm(FarmEntity farm) {
    this.farm = farm;
  }


}
