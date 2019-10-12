/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;



/**
 *
 * @author b404-3
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.print("1. kenarı giriniz");
     
        Scanner sonuc = new Scanner(System.in);
        int girdi1=sonuc.nextInt();
     
        System.out.print("2. kenarı giriniz");
     
        Scanner sonuc2 = new Scanner(System.in);
         int girdi2=sonuc.nextInt(); 
         System.out.print("3. kenarı giriniz");
     
        Scanner sonuc3 = new Scanner(System.in);
          int girdi3=sonuc.nextInt();
        
        if(girdi1+girdi2>girdi3&&girdi2+girdi3>girdi1&&girdi1+girdi3>girdi2)
            System.out.println("üçgen olur");
        else 
            System.out.println("olmaz");
                    
     
        
    }
    
}