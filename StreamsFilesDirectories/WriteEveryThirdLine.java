package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {



        String pathIn="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\05.WriteEveryThirdLineOutput.txt";

        Scanner scanner=new Scanner(new FileInputStream(pathIn));
        PrintWriter out=new PrintWriter(new FileOutputStream(pathOut));

        int counter=1;
        String line=scanner.nextLine();
        while (scanner.hasNextLine()){
            if(counter % 3 ==0){
                out.println(line);

            }
            counter++;
            line=scanner.nextLine();
//            out.flush();
        }
        out.close();
    }
    }
