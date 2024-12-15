package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";

        try(InputStream in =new FileInputStream(path)){
          int oneByte=in.read();

          while (oneByte >=0){
              System.out.print(Integer.toBinaryString(oneByte)+ " ");
              oneByte=in.read();
          }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
