package com.edu.id;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
  
  public static void main(String[] args) {
    Date dataKrijimit = new Date();
    String emriKrijimit = "Jona";
    String v01 = "3";
    String v02 = "0";
    String v03 = "1";
    
    // 20170322|Jona|3|0|1
    String rezultati = Formulari.gjeneroStringun(dataKrijimit, emriKrijimit,
        v01, v02, v03);
    
    System.out.println("Rezultati eshte: " + rezultati);
  }
}
