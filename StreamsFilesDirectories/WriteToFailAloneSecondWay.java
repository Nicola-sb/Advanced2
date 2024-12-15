package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WriteToFailAloneSecondWay {
    public static void main(String[] args) throws IOException {

        String pathIn="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\2raZadachaPoMoqNachin";

        Set<Character>forbiddenSymbols=new HashSet<>();
        Collections.addAll(forbiddenSymbols,'?','!',',','.');

        FileInputStream fileInputStream=new FileInputStream(pathIn);
        FileOutputStream fileOutputStream=new FileOutputStream(pathOut);

        int oneByte=fileInputStream.read();
        while (oneByte>=0){
            char mySymbol=(char)(oneByte);
            if(!forbiddenSymbols.contains(mySymbol)){
                fileOutputStream.write(oneByte);
            }
            oneByte=fileInputStream.read();
        }
    }
}
