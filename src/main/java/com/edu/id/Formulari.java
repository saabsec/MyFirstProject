package com.edu.id;

import java.util.Date;

/**
 * 
 * @author fatjona
 *
 */
public class Formulari {
  
  private Formulari() {
    // Constructor.
  }
  
  /**
   * Kjo metode sherben per te gjeneruar Stringun.
   * 
   * TJ-1
   * 
   * @param dataKrijimit Date
   * @param emriKrijimit String
   * @param v01 String
   * @param v02 String
   * @param v03 String
   * @return
   */
  public static String gjeneroStringun(Date dataKrijimit, String emriKrijimit,
      String v01, String v02, String v03) {
    StringBuilder result = new StringBuilder();
    result.append(dataKrijimit + "|");
    result.append(emriKrijimit + "|");
    result.append(v01 + "|");
    result.append(v02 + "|");
    result.append(v03 + "|");
    return result.toString();
  }
  
}
