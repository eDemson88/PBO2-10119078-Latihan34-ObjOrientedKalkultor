/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan34.objorientedkalkulator;

/**
 *
 * @author ryzen
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
public double tambahBilangan(){
    System.out.println("Hasil pertambahan : " + (value1 + value2));
    return (value1 + value2);
}

public double kurangBilangan(){
    System.out.println("Hasil pengurangan : " + (value1 - value2));
    return (value1 - value2);
}

public double kaliBilangan(){
    System.out.println("Hasil perkalian : " + (value1 * value2));
    return (value1 * value2);
}

public double bagiBilangan(){
    System.out.println("Hasil pembagian : " + (value1 / value2));
    return (value1 / value2);
}

public double sisaBilangan(){
    System.out.println("Hasil sisa : " + (value1 % value2));
    return (value1 % value2);
}
    
}
