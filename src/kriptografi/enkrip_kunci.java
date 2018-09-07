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
public class enkrip_kunci {    
    int keyTrans [] = new int[7];    
    char allKey[] = new char[9];
    String keyCae;
    char keyScy = '6';
    int kolomTrans = 7;
    int geserKunci = 0;
    int i = 0;
    String mainKey = "";

    caesar c = new caesar();
    
    //constructor
    public enkrip_kunci(){
    }
    
    //constructor
    public enkrip_kunci(String keyCae, int [] keyTrans, int geserKunci){
        this.geserKunci = geserKunci;
        this.keyCae = String.valueOf(keyCae);
        this.keyTrans = keyTrans;        
    }
    
    public char convert_alphabet(String number){
        char alphabet = c.P[Integer.parseInt(number)];        
        return alphabet;
    }
    
    public String enkrip(){        
        System.out.println("KUNCI ");
        
        //Kunci Caesar
        this.allKey[0] = convert_alphabet(this.keyCae);
        System.out.print(this.allKey[0]+" ");
        
        //Kunci Scytale
        this.allKey[1] = convert_alphabet(String.valueOf(this.keyScy));        
        System.out.print(this.allKey[1]+" ");
        
        //Kunci Transposisi
        for (i=2; i<=kolomTrans+1; i++){            
            this.allKey[i] = convert_alphabet(Integer.toString(this.keyTrans[i-2]));
            System.out.print(this.allKey[i]+" ");
        }
        System.out.println();
        
        caesar c = new caesar(this.geserKunci, String.valueOf(this.allKey));
        System.out.println();
        mainKey = c.enkrip();
        
        return mainKey;
    }    
    
    public String get_allKey(){
        return String.valueOf(this.allKey);
    }
}