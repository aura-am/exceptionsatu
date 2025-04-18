/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionku;

import javax.swing.JOptionPane;

/**
 *
 * @author 62852
 */
public class luasBangunan {
    public double luas_persegipanjang( int panjang, int lebar) {
        int total = panjang * lebar;
        return total;
    }
    public double luas_segitiga(int alas, int tinggi){
        int total = (alas * tinggi)/2;
        return total;
    }
    public double luas_lingkaran(int diameter){
        int jari2 = diameter/2;
        double total = Math.PI * Math.pow(jari2, 2);
        return total;
    }
    public static void main(String[] args) {
        luasBangunan count = new luasBangunan();
        
        try {
            double total =0;
            String jenis ="";
            int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan :\n"
            + "1. Luas Persegi Panjang \n"
            + "2. Luas Segitiga \n"
            + "3. Luas lingkaran\n"));
            switch(pilihan){
                case 1 :
                    int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang : "));
                    int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar : "));
                    total = count.luas_persegipanjang(panjang, lebar);
                    jenis = "Persegi panjang";
                    break;
                case 2 :
                    int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas : "));
                    int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi : "));
                    total = count.luas_segitiga(alas, tinggi);
                    jenis = "Segitiga";
                    break;
                case 3 :
                    int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Diameter"));
                    total = count.luas_lingkaran(diameter);
                    jenis ="lingkaran";
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Input Error");
                        return;
            }    
                        JOptionPane.showMessageDialog(null, " Luas " + jenis + " = " + total);
                        System.out.println("Luas" + jenis + " = " + total);
            } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Input Error");
                    System.out.println("Input Error");
                    }
        }
    }

