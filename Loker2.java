/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loker2;

import java.util.Scanner;
public class Loker2 {
    public static void main(String[] args) {
        String loker[][] = new String[5][10];
        Scanner s = new Scanner(System.in);
        int baris=0, kolom=0, pilih;
        do{
            System.out.println("\nLoker Digital");
            System.out.println("1. Masukkan Loker");
            System.out.println("2. Cari di Loker");
            System.out.println("3. Status Loker");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih=s.nextInt();
            switch(pilih){
                case 1: String barang;
                int i,j=0;
                boolean ketemu=false;
                System.out.print("Nama Barang = ");
                barang=s.next();
                System.out.println("Cari Loker...");
                for(i=0;i<5;i++){
                    baris=i;
                    for(j=0;j<10;j++){
                        kolom=j;
                        if(loker[i][j]==null){
                            ketemu=true;
                            break;
                        }
                    }
                    if(ketemu)break;
                }
                if(i==5&&j==10){
                    System.out.println("Loker Penuh");
                }
                else{
                    loker[baris][kolom]=barang;
                    System.out.println(baris+"-"+kolom);
                }
                break;
                case 2: barang ="";
                ketemu = false;
                j=0;
                System.out.print("Barang yang Dicari = ");
                barang=s.next();
                System.out.println("Pencarian...");
                for(i=0;i<5;j++){
                    baris = i;
                    for(j=0;j<10;j++){
                        kolom=j;
                        if(loker[i][j].compareToIgnoreCase(barang)==0){
                            ketemu=true;
                            break;
                        }
                    }
                    if(ketemu)break;
                }
                if(i==5){
                    System.out.println("Barang tidak ada");
                }
                else{
                    System.out.println("Ada di "+baris+"-"+kolom);
                }
                break;
                case 3: int isi=0, kosong=0;
                System.out.println("Cek LOker...");
                for(i=0;i<5;i++){
                    for(j=0;j<10;j++){
                        if(loker[i][j]==null)
                            kosong++;
                            else
                              isi++;
                    }
                }
                System.out.println("Loker Terisi: "+isi);
                System.out.println("Loker Kosong: "+kosong);
                break;
            }
        }while(pilih!=4);
        System.out.println("Terima Kasih");
    }
}
    
