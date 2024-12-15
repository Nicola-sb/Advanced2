package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegerOutput {
    public static void main(String[] args) throws FileNotFoundException {

        String pathIn="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\04.ExtractIntegersOutput.txt";

        Scanner scanner=new Scanner(new FileInputStream(pathIn));

        PrintWriter myFileOutput=new PrintWriter(new FileOutputStream(pathOut));


        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                    myFileOutput.println(scanner.nextInt());
            }
            scanner.next();
        }

        myFileOutput.close();


    }
}
