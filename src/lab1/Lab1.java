package lab1;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Lab1 {
    public static void main(String[] args) {
        //first task
        System.out.println("First Task: \n");
        File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Lab1.txt");

  if (data.exists()){
        BufferedReader in = null;
        
        
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
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
        //end first task
        //second task
            System.out.println("\nSecond Task: \n");
            List<String> fileContents = new ArrayList<String>();
            try{
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
                if ( i > 5 && i < 10){
                    System.out.println(fileContents.get(i));
                
                    
                }
            }
            //third task
            System.out.println("\nThird Task: \n");
            fileContents.add("\nMarie Anderson\n2348 S School St\nWauwatosa, WI 53224\n"
                    + "manderson@yahoo.com\n(262)854-4525\n");
            try{
                in = new BufferedReader(new FileReader(data));
                String line = in.readLine();
                while(line != null){
		  
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
            for (String s : fileContents){
                System.out.println(s);
            }
            
            }
            
            
            
        }
        
  
  
    
    
}
