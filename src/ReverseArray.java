/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliibrahim
 * 
 */
import java.util.*;

public class ReverseArray {
    
    public static void main(String[] args){
        
      //  char[] myWord = new char[7];
      //   myWord[0]='s';
        // myWord[1]='t';
         //myWord[2]='u';
         //myWord[3]='d';
         //myWord[4]='e';
         //myWord[5]='n';
         //myWord[6]='t';
        
        
         //for(int i=0; i<myWord.length; i++)
         //{
            //    System.out.println(myWord[i]);
        
         //}
        
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter word");
         String word = sc.nextLine();
         
         char[] myLetters= new char[word.length()];
         char[] reverse = new char[word.length()];
         
       for( int i =0; i<word.length();i++)
        {
            reverse[i] = word.charAt(i);//Hello [0] = h
        }
        for(int i =reverse.length-1; i>0; i--)
        {
            
            System.out.println(reverse[i]);
           
            
        }   
         
        
         
    
        
}
}
