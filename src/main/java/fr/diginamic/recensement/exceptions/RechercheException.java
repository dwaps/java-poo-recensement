package fr.diginamic.recensement.exceptions;

public class RechercheException extends Exception {
  public RechercheException(String message) {
    super("\n[ERREUR MON COCO !!!] " + message + "\n");
  }
}
