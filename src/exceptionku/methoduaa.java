/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionku;

import java.util.Scanner;

/**
 *
 * @author 62852
 */
public class methoduaa {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2,2);
        return luas;
    }
    
   public double volume_tabung(int diameter, double tinggi){
       int jari_jari = diameter / 2;
       double total = Math.PI *
               Math.pow(jari_jari, 2) * tinggi;
       return total;
   }
   
   public double volume_kerucut(int diameter, double tinggi){
       int jari_jari = diameter / 2;
       double total = (Math.pow(jari_jari, 2)*Math.PI*tinggi)/3;
       return total;
   }
   public double volume_bola(int diameter){
       int jari_jari = diameter/2;
       double total = (4*Math.PI*Math.pow(jari_jari, 3))/3;
       return total;
   }
   
    public static void main(String[] args) {
        methoduaa count = new methoduaa();
        Scanner input = new Scanner(System.in);
        
        try{
        String status = ""; double hasil = 0;
        System.out.println("Pilihan : \n"
        +"1.Luas lingkaran\n"
        +"2.Volume tabung\n"
        +"3.Volume kerucut\n"
        +"4.Volume bola\n");
        
        System.out.print("Masukkan pilihan : ");
        byte pilihan = input.nextByte();
        
        if(pilihan == 1){
            System.out.print("Masukkan diameter : ");
            int diameter = input.nextInt();
            hasil = count.luas_lingkaran(diameter);
            status = "Masukkan Luas Lingkaran";
    } else if (pilihan == 2){
            System.out.print("Masukkan diameter : ");
            int diameter = input.nextInt();
            System.out.print("Masukkan tinggi : ");
            int tinggi = input.nextInt();
            hasil = count.volume_tabung(diameter, tinggi);
            status = "Menghitung Volume Tabung";
    } else if (pilihan == 3){
            System.out.print("Masukkan diameter : ");
            int diameter = input.nextInt();
            System.out.print("Masukkan tinggi : ");
            int tinggi = input.nextInt();
            hasil = count.volume_kerucut(diameter, tinggi);
            status = "Menghitung Volume Kerucut";
    } else{
        status = "Input-an tidak valid";
    }
        
        System.out.println("\nStatus\t: " + status);
        System.out.println("Hasil\t: " + hasil);
   }catch (Exception e) {
            System.out.println("tidak valid");
    }
}
}
        
    
