package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileALonee {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";

        InputStream in=new FileInputStream(path);
        int oneByte=in.read();

        while (oneByte>=0){
            System.out.print(Integer.toBinaryString(oneByte)+" ");
            oneByte=in.read();
        }

    }
}
