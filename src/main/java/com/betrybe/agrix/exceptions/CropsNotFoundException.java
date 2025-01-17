package com.betrybe.agrix.exceptions;

/**
 * Crops not found exception.
 */
public class CropsNotFoundException extends NotFoundException {
  public CropsNotFoundException() {
    super("Plantação não encontrada!");
  }
    
}
