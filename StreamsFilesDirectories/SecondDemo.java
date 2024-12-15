package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecondDemo {
    public static void main(String[] args) throws FileNotFoundException {


        String inputPath="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\Banicaaa";

        Scanner scanner=new Scanner(new FileInputStream(inputPath));

        PrintWriter output=new PrintWriter(new FileOutputStream(pathOut));

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                output.println(scanner.nextInt());
            }
            scanner.next();
        }

        output.close();
    }
}
