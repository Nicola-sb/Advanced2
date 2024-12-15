package StreamFilesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {


       String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
       List<String> listOfWords= Files.readAllLines(Path.of(path));
        Map<String,Integer>countWordsMap=new HashMap<>();
        for (String line:listOfWords){
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                countWordsMap.put(word,0);
            });
        }

        String pathText="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String>allLines=Files.readAllLines(Path.of(pathText));
        for (String line:allLines){
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                if(countWordsMap.containsKey(word)){
                    int currentCount=countWordsMap.get(word);
                    countWordsMap.put(word,currentCount+1);
                }
            });
        }
        PrintWriter pw=new PrintWriter("Task06Alone");

        countWordsMap.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).
        forEach(entry-> pw.println(entry.getKey()+ " - "+entry.getValue()));

        pw.close();

    }
}
