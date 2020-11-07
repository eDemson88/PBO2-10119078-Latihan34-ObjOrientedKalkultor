/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan kalkulator
 */
package pboif2.pkg10119078.latihan34.objorientedkalkulator;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan34ObjOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        
        System.out.print("Masukan angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        System.out.println("");
        
      kalkulator.tambahBilangan();
      kalkulator.kurangBilangan();
      kalkulator.kaliBilangan();
      kalkulator.bagiBilangan();
      kalkulator.sisaBilangan();
    }
    
}
