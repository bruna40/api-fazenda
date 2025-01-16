package com.betrybe.agrix.exceptions;

/**
 * Not found exception.
 * Thrown when a resource is not found.
 */
public class NotFoundException extends RuntimeException {
  public NotFoundException(String message) {
    super(message);
  }
    
}
