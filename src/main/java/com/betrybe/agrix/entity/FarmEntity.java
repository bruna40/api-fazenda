package com.betrybe.agrix.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Farm entity.
 */
@Entity
@Table(name = "farm")
public class FarmEntity {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Double size;

  public FarmEntity(String name, Double size) {
    this.name = name;
    this.size = size;
  }


  public Long getId() {
    return id;
  }  

  public String getName() {
    return name;
  }

  public Double getSize() {
    return size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(Double size) {
    this.size = size;
  }
}
