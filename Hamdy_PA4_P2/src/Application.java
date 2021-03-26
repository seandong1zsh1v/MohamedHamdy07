import java.io.File;
import java.io.IOException;


public class Application extends DuplicateCounter {

public static void main(String[] args) throws IOException {
File dataFile = new File("problem1.txt");
File outputFile = new File("unique_word_counts.txt");
DuplicateCounter duplicateCounter = new DuplicateCounter();
duplicateCounter.count(dataFile);

System.out.println("Beep boop bop writing to the file: ");
duplicateCounter.write(outputFile);
System.out.println("Successful");

}

}

