/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kriptografi;
/**
 *
 * @author anne
 */
public class scytale {
    int kolom = 6;
    double temp = 0;
    int baris = 0;
    String cipher2 = "";
    String cipher1 = "";
    int a=0, b=0, hit=0, m=0, n=0;
    char [][] arrScy;
    char [] array_cipher1;

    //constructor
    public scytale(){
    }
    
    public scytale(String cipher1){
        this.temp = Math.ceil((double) cipher1.length()/(double) kolom);
        this.baris = (int) temp;
        
        this.cipher1 = cipher1;
        this.array_cipher1 = cipher1.toCharArray();
    }
    
    public String enkrip(){
        System.out.println("Scytale\n");
        
        this.arrScy = new char[baris][kolom];
        System.out.println("Matriks: ");
        
        while (a<baris){
            while (b<kolom){
                if (hit < cipher1.length()){
                    arrScy[a][b] = array_cipher1[hit];
                }
                else{
                    arrScy[a][b] = 'X';
                }
                System.out.print(arrScy[a][b]+" ");
                hit++;
                b++;
            }
            System.out.println();
            a++;
            b = 0;
        }
        
        while (m<kolom){
            while (n<baris){
                cipher2 = cipher2 + arrScy[n][m];
                n++;
            }
            m++;
            n = 0;
        }

        System.out.println("\nCipher Scytale : "+cipher2);
        System.out.println("===================================================");
        return cipher2;
    }
}