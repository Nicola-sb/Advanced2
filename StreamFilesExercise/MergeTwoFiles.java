package StreamFilesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String pathFileOne="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";

        String pathFileTwo="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        BufferedWriter bw=new BufferedWriter(new FileWriter("Taks07MergeTwoFiles"));

        List<String>allLinesFIleOne= Files.readAllLines(Path.of(pathFileOne));

        List<String>allLinesFileTwo= Files.readAllLines(Path.of(pathFileTwo));

        for (String line:allLinesFIleOne){
            bw.write(line);
            bw.newLine();
        }
        for (String line:allLinesFileTwo){
            bw.write(line);
            bw.newLine();
        }
        bw.close();

//        PrintWriter pw=new PrintWriter("Task07output.txt");
//
//        allLinesFIleOne.forEach(line ->
//                pw.println(line));
//        allLinesFileTwo.forEach(line ->
//                pw.println(line));
//
//
//        pw.close();


    }
}
