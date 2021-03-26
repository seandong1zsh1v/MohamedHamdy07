
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner; 

public class DuplicateCounter  {
List<String> words = new ArrayList<String>();
 HashMap<String, Integer> map  = new HashMap<>();



public void count(File dataFile) throws IOException {


 try {


   String temp;
     Scanner scnr = new Scanner(dataFile);
     int i;

   
   
     while (scnr.hasNext()) {
       temp= scnr.next();
       words.add(temp);
     }
     System.out.println("Your input is: ");
     System.out.println(words.toString().replace("["," ").replace("]"," ").replace(", "," "));
     
     for(i=words.size()-1; i>0; i--) {
         int wordCounter = Collections.frequency(words, words.get(i));
         map.put(words.get(i), wordCounter);
         wordCounter = 0;
     }
     System.out.println("Your counts are: ");
     System.out.println(map.toString().replace("{"," ").replace("}"," ").replace(", "," ") );
     
     scnr.close();
     

     
   
 
   
   } catch (FileNotFoundException f) {
     System.out.println("Error");
     f.printStackTrace();
   }

}
public void write(File outputFile) throws IOException
 {
 FileWriter out = new FileWriter(outputFile);

 out.write(map.toString().replace("{"," ").replace("}"," ").replace(", "," ") );
 out.write(" ");
out.close();
 
 
 
 

 }

}
