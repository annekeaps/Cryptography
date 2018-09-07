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
public class caesar {
    int geser = 0;
    String input = "";
    String cipher1 = "";
    int i=0, j=0, k=0;    
    char [] P = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char [] array_input;

    //constructor
    public caesar(){
    }
    
    public caesar(int angka_geser, String plain_text){
        this.geser = angka_geser;
        this.input = plain_text.toLowerCase();
        this.array_input = new char[input.length()];
        array_input = input.toCharArray();
    }
    
    //proses enkrip
    public String enkrip(){        
        System.out.println("Caesar (geser "+this.geser+")\n");
                
        for (i=0; i<input.length(); i++){
            //mengecek apakah input berupa alphabet
            //proses dapat berjalan hanya pada alphabet
            for (j=0; j<26; j++){
                if (array_input[i] == P[j]){
                    k = j + this.geser;
                    break;
                }
            }
            if (k>25){
                cipher1 = cipher1 + P[k % 26];
            }
            else{
                cipher1 = cipher1 + P[k];
            }
        }
        System.out.println("Cipher Caesar : "+cipher1);
        System.out.println("===================================================");
        return cipher1;
    }
}
