/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Teraesa
 */
public class Lab2 {
    public static void main(String[] args) {
         File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Lab1.txt");
         
         Scanner keyboard = new Scanner(System.in);
  if (data.exists()){
        BufferedReader in = null;
        List<String> fileContents = new ArrayList<String>();
        
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  fileContents.add(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        System.out.println("Please enter the number for the record you would like to view: \n");
        int record = keyboard.nextInt();
        
        
        switch (record){
            case 1: for(int i = 0; i < fileContents.size(); i ++){
                         if ( i >= 0 && i < 5){
                         System.out.println(fileContents.get(i));
                         }}
            break;
            case 2: for(int i = 0; i < fileContents.size(); i ++){
                         if ( i > 5 && i < 11){
                         System.out.println(fileContents.get(i));
                         }}
            break;
            case 3: for(int i = 0; i < fileContents.size(); i ++){
                         if ( i > 11 && i < 17){
                         System.out.println(fileContents.get(i));
                         }}
            break;
            default: throw new IllegalArgumentException("The number you entered is invalid");
                
            
        }
        
            
        }
  
    }
}
