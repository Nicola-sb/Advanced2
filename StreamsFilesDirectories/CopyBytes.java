package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String pathIn="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\03.CopyBytesOutput.txt";

        FileInputStream in=new FileInputStream(pathIn);
        FileOutputStream out=new FileOutputStream(pathOut);


        int oneByte=in.read();
        while (oneByte>=0){

            if(oneByte==32|| oneByte==10){
                out.write(oneByte);
            }else{
             String digit=String.valueOf(oneByte);
             for(int i=0 ;i<digit.length() ;i++){
                 out.write(digit.charAt(i));
                 System.out.print(digit.charAt(i));
             }
            }
            oneByte=in.read();
        }

    }
}
