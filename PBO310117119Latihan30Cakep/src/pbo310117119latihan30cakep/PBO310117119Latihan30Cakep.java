/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan30cakep;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * V Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini dapat menanyakan ya dan tidak
 */
public class PBO310117119Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Keterangan;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println((char) 27+"[01;35mkamu "+(char)27+
                "[01;32mNgerjain Sendir"+(char)27+ "[01;33mLatihan 17 Sampai "
        +(char)27+"[01;34mLatihan 30 ini ?");
        
        System.out.print((char)27+"[01;34mJawab "+(char)27
                +"[01;35m(Yoi/Enggak) : ");
        Keterangan = scanner.next();
        
        System.out.println("");
        if("Yoi".equals(Keterangan)||("yoi".equals(Keterangan))){
            System.out.println((char)27+"[01;31mCakep Bener." +(char)27 + 
                    "[01;35mGood Job!!");
        }
        if("Enggak".equals(Keterangan)||("enggak".equals(Keterangan))){
            System.out.println((char)27+"[01;31mTetap Cakep Sih.");
            System.out.println((char)27+"[36mSing Penting Paham Konsepnya yes.");
            System.out.println("Keep the code works dude!");
        }
    }
    
}
