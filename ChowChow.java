/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */

import java.util.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;



public class ChowChow {
    char[] alphabet={'A','B','C','D',
            'E','F','G','H','I','J','K','L','M','N','O','P',
        'Q','R','S','T','U','V','W','X','Y','Z'};
    
    char[]cipher=new char[26];
    
    
    
    
    
    public void SetCipher(int shift){
  
        int length=alphabet.length; 
        
        System.out.println("Shift Length: "+shift);
        
        for(int i=0; i<length; i++){
            cipher[i]=alphabet[(shift+i)%length];
        }
      
    }
    
    public void CeasarCipher(char[] clue,int shift){
    
        char[] message=new char[clue.length];
        int index=0; 
      
        SetCipher(shift);
        System.out.println("Original message: ");
        for(char letter:clue){
            System.out.print(letter+" ");
        }
        
        
        System.out.print("\n\n New Message: \n");
        for(int i=0; i<clue.length; i++){
            char letter =clue[i];
            
            for(int j=0; j<cipher.length;j++)
                if(cipher[j]==letter){
                    index=j;
                    break;
                }
                    
            message[i]=alphabet[index];
            System.out.print(message[i]+" "); 
        }
    
    }
    public static void main(String arg[]){
    
        ChowChow c = new ChowChow(); 
        String clue="QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD"; 
        
        char[] clueArr=clue.toCharArray();
        
        c.CeasarCipher(clueArr, 23);
        
    }
}
