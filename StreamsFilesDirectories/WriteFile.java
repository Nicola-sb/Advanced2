package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WriteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        //Стринга за файла  който четем
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\02.NicolaFile.txt";
        //Стринг за файл  който пишем

        Set<Character>forbiddenSymbols=new HashSet<>();
        Collections.addAll(forbiddenSymbols,'.',',','!','?');

        try(FileInputStream input =new FileInputStream(pathIn);
            //Създаваме си един поток,който ще бъде от файла към нашето java приложение
            FileOutputStream out=new FileOutputStream(pathOut)) {
            //Създаваме си един поток,който ще бъде от нашето проложение към друг файл
            int oneByte=input.read();
            while (oneByte>=0){
                char myByteAsChar=(char)oneByte;
                if(!forbiddenSymbols.contains(myByteAsChar)){
                  out.write(oneByte);
              }

                oneByte=input.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
