package StreamFilesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {


        String pathWord="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        //of which The
        List<String> allLinesWithWords= Files.readAllLines(Path.of(pathWord));

        Map<String,Integer>wordCountsMap=new HashMap<>();//дума ->бр.срещания

        //1.Прочетем всички думи от файла и всяка дума да я съхраним в мапа
        for (String line:allLinesWithWords){//
            Arrays.stream(line.split("\\s+")).forEach(word -> {////-->of which The  ->> ["of","which","the"]
                wordCountsMap.put(word,0);
            });
        }

        //2.Прочитаме файла от който търсим
        String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        //Обхождаме всеки ред->взимаме всички думи на всеки ред->проверяваме дали думата трябва да я преброим(само думите,които са в мапа)
        List<String>allLines=Files.readAllLines(Path.of(path));
        for (String line:allLines){
            Arrays.stream(line.split("\\s+")).forEach( word -> {//Трябва да проверя дали думата ми е за броене(дали я има в мапа)
                 if(wordCountsMap.containsKey(word)){
                     int currentValue=wordCountsMap.get(word);
                     wordCountsMap.put(word,currentValue+1);
                 }
            });
        }
        //Знае коя дума колко пъти се среша
        //Write the results in file "results.txt". Sort the words by frequency in descending order.
        //3.Принтираме резултата
        //сортиране по value
        PrintWriter pw=new PrintWriter("Task06text.txt");

        wordCountsMap.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue()))//С entrySet си взимам всички записи;със stream sorted искаме да ги сортираме в discending order po value
                .forEach(entry -> pw.println(entry.getKey() + " - "+ entry.getValue()));
        pw.close();
    }
}
