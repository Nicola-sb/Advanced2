package StreamFilesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String>allLines= Files.readAllLines(Path.of(path));

        int number=1;

        PrintWriter pw=new PrintWriter("Taks05LineNumbers");

        for (String line:allLines){
            pw.println(number+". "+line);
            number++;
        }
        pw.close();
    }
}
