/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        
    
    File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Lab1.txt");
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
         for(int i = 0; i < fileContents.size(); i ++){
                if ( i == 8){
                    String str = fileContents.get(i);
                    char[] charArray = str.toCharArray();
                    for (int s = 0; s < charArray.length; s++){
                        if (s >= 0 && s < 8){
                            System.out.print(charArray[s]);
                        }
                    }
                System.out.println("");
                    
                }
            }
     }
    }
}
