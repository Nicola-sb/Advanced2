package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExtractIntegersAnotherWay {
    public static void main(String[] args) throws IOException {


        String pathIn="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\Proba4taZadacha.txt";

        Scanner scanner=new Scanner(new FileInputStream(pathIn));
        FileOutputStream out=new FileOutputStream(pathOut);

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                int myNumbers=scanner.nextInt();
                out.write(myNumbers);
            }
            scanner.next();
        }


    }
}
