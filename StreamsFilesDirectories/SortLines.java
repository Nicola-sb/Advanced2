package StreamsFilesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String pathIn="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\input.txt";
        String pathOut="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\StreamsFilesDirectories\\06.SortLinesOutput.txt";

        Path input= Paths.get(pathIn);
        Path output=Paths.get(pathOut);

        //Трябва да си прочетем всички редове от инпута
        List<String> lines= Files.readAllLines(input);
        Collections.sort(lines);
        //Това,което сме го прочели искаме да го запишем другата.Пак можем да изполваме Files
        //Трябва да запишем всичките редове в output
        Files.write(output,lines);


        //С няколко реда код
        //1во Прочитаме всичко от един файл--> List<String> lines= Files.readAllLines(input);
        //2ро Записваме го в списък
        //3то След това го презаписваме в друг файл --> Files.write(output,lines);

//        for (String line:lines){
//            System.out.println(line);
//        }
    }
}
