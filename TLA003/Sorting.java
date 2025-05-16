/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sorting;

/**
 *
 * @author Students Account
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
      
        Stack <String> galahad = new Stack<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence for word reversal");
        
        
        
        
       String Sentence = scanner.nextLine();
       
      String [] pt2 = Sentence.split(" ");
      
     
      
        
      
      for (String obj : pt2){
          
           galahad.push(obj);
          
          
      }
      
        
      
       while(!galahad.isEmpty()){
           
           
           System.out.println(galahad.pop() + " ");
          
       }
       
     
      
      
      
     
        
        
        
        
        
        
        
        
        
    }
    
   
    }


        
        
    

