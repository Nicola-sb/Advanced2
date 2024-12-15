package StreamFilesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String>countCharactesTypes= Files.readAllLines(Path.of(path));
        //В Листа си прочитам всичките реодве от моя файл(path)

        int vowelsCount=0;
        int consonantsCount=0;
        int punctCount=0;
        //•	a, e, i, o, u are vowels, only lower case.
        //•	All others are consonants.
        //•	Punctuation marks are (! , . ?).

        for (String line:countCharactesTypes){
            for(int i=0 ;i<line.length() ;i++){
                char currentSymbol=line.charAt(i);

                if(currentSymbol==' '){
                    continue;
                }

                if(currentSymbol=='a'|| currentSymbol=='e'||currentSymbol=='i'||currentSymbol=='o'||currentSymbol=='u'){
                    vowelsCount++;
                }else if(currentSymbol=='!'||currentSymbol==','||currentSymbol=='.'||currentSymbol=='?'){
                    punctCount++;
                }else{
                    consonantsCount++;
                }
            }
        }

        BufferedWriter bw=new BufferedWriter(new FileWriter("Task04CountCharacters"));
        bw.write("Vowels: "+ vowelsCount);
        bw.newLine();
        bw.write("Other symbols: "+consonantsCount);
        bw.newLine();
        bw.write("Punctuation: "+punctCount);
        bw.newLine();
        bw.close();

    }
}
