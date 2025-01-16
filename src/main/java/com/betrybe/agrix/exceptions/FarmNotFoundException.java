package com.betrybe.agrix.exceptions;

/**
 * Farm not found exception.
 */
public class FarmNotFoundException extends NotFoundException {
  
  public FarmNotFoundException() {
    super("Fazenda não encontrada!");
  }
    
}
