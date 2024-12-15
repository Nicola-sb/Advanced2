package StreamFilesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharactersWithMethods {
    public static void main(String[] args) throws IOException {


        String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> lines= Files.readAllLines(Path.of(path));
        //•	a, e, i, o, u are vowels, only lower case.
        //•	All others are consonants.
        //•	Punctuation marks are (! , . ?).
        int vowelsCount=0;
        int consonantsCount=0;
        int punctCount=0;

        Set<Character> vowels=getVowels();//съхраняваме си гласните букви

        Set<Character>punctoatioNMarks=getPunct();

        for (String line:lines){
            for(int i=0 ;i<line.length() ;i++){
                char currentSymbol=line.charAt(i);
                if(currentSymbol==32){
                    continue;
                }
                if(vowels.contains(currentSymbol)){
                    vowelsCount++;
                }else if(punctoatioNMarks.contains(currentSymbol)){
                    punctCount++;
                }else{
                    consonantsCount++;
                }
            }

            BufferedWriter bw=new BufferedWriter(new FileWriter("CountCharachterWithMethod"));
            bw.write("Vowels: "+vowelsCount);
            bw.newLine();
            bw.write("Other symbols: "+consonantsCount);
            bw.newLine();
            bw.write("Punctuation: "+punctCount);
            bw.newLine();
            bw.close();
        }
    }

    private static Set<Character> getPunct() {
        Set<Character>punctoation=new HashSet<>();
        punctoation.add('!');
        punctoation.add(',');
        punctoation.add('.');
        punctoation.add('?');
        return punctoation;
    }

    private static Set<Character> getVowels() {
        Set<Character>vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }
}
