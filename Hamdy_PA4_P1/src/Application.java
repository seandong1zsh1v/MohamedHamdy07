import java.io.File;
import java.io.IOException;

public class Application extends DuplicateRemover {

public static void main(String[] args) throws IOException {
File dataFile = new File("problem1.txt");
File outputFile = new File("unique_words.txt");
   

DuplicateRemover duplicateRemover = new DuplicateRemover();
duplicateRemover.remove(dataFile);

System.out.println("Beep boop bop writing to the file: ");
duplicateRemover.write(outputFile);
System.out.println("Successful");

}

}
