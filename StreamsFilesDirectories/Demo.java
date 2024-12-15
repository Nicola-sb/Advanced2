package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        String filePath="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";


        try(InputStream inputStream=new FileInputStream(filePath)){
            int readtByte=inputStream.read();

            while (readtByte>=0){
                System.out.print(Integer.toBinaryString(readtByte)+ " ");

                readtByte=inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        InputStream inputStream = new FileInputStream(filePath);

//        int firstByte=inputStream.read();
//        System.out.println(firstByte);
//        System.out.println((char)(firstByte));
//        inputStream.close();


    }
}