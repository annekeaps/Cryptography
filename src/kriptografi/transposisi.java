/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kriptografi;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author anne
 */
public class transposisi {
    int kolom = 7;
    double temp = 0;
    int baris = 0;
    String cipher2 = "";
    String cipher3 = "";
    int a=0, b=0, hit=0, m=0, n=0;    
    char [][] arrScy;
    char [] array_cipher2;
    int keyTrans [] = {0, 1, 2, 3, 4, 5, 6};

    //constructor
    public transposisi(){
    }
    
    public transposisi(String cipher2){        
        this.temp = Math.ceil((double) cipher2.length()/(double) kolom);        
        this.baris = (int) temp;        
        this.cipher2 = cipher2;
        this.array_cipher2 = cipher2.toCharArray();
    }
    
    public String enkrip(){
        this.keyTrans = shuffleArray(keyTrans);        
        System.out.println("Transposisi\n");
        
        System.out.println("Kunci Urutan Transposisi: ");
        for (int i=0; i<7; i++){
            System.out.print(keyTrans[i]+" ");
        }        
        System.out.println();
        
        this.arrScy = new char[baris][kolom];
        System.out.println("\nBlok Transposisi: ");
        while (a<baris){
            while (b<kolom){
                if (hit < cipher2.length()){
                    arrScy[a][b] = array_cipher2[hit];
                }
                else{
                    arrScy[a][b] = 'X';
                }
                System.out.print(arrScy[a][b]+" ");
                hit++;
                b++;
            }
            System.out.print("\t");
            a++;
            b = 0;
        }
                        
        System.out.println();
        
        while (m<baris){
            while (n<kolom){
                cipher3 = cipher3 + arrScy[m][keyTrans[n]];
                n++;
            }
            m++;
            n = 0;
        }

        System.out.println("\nCipher Transposisi : "+cipher3);
        System.out.println("===================================================");
        return cipher3;
    }
    
    public int [] get_keyTrans(){
        return this.keyTrans;
    }
    
    // Implementing Fisher–Yates shuffle
    static int [] shuffleArray(int[] ar)
    {       
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }
}
