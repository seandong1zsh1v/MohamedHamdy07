import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class DuplicateRemover  {
List<String> uniqueWords = new ArrayList<String>();
  public void remove(File dataFile) throws IOException {
    try {
   
    String temp;
    int i,j;
   
      Scanner scnr = new Scanner(dataFile);
     
     
      while (scnr.hasNext()) {
        temp= scnr.next();
        uniqueWords.add(temp);
      }
     
      System.out.println("Your input with duplicates: ");
      System.out.println(uniqueWords.toString().replace("["," ").replace("]"," ").replace(", "," ") );
      scnr.close();
         
      for(i=uniqueWords.size()-1; i>0; i--) {
          for( j=i-1; j>=0; j--)
          {
              if(uniqueWords.get(i).compareTo(uniqueWords.get(j))==0) {
                  uniqueWords.remove(i);
                  break;
              }
          }
      }
     
   
     System.out.println("Your input with the duplicates removed: ");
      System.out.println(uniqueWords.toString().replace("["," ").replace("]"," ").replace(", "," ") );
   
    } catch (FileNotFoundException f) {
      System.out.println("Error");
      f.printStackTrace();
    }

   
  }
 
 
  public void write(File outputFile) throws IOException
  {
 FileWriter out = new FileWriter(outputFile);
 for(int i = 0; i < uniqueWords.size(); i++)
 {
 out.write(uniqueWords.get(i));
 out.write(" ");
 }
 out.close();
 
 

  }
}
