package StreamFilesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathIn="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        //1.Трябва да прочета всички редове от файла
        //Правя си един лист в който трябва да си държа всички редове от моя файл
        //Със Files.readAllLines си държа
        //readAllLines връща ми спъсък със Стрингове ,като в този списък аз съхранявам всеки един ред
        //Всеки отделен елемент от Листа е ред от моя файл
        //Вътре в метода readAllLines(трябва да въведа пътя на файла,който искам да прочета)-->Path.of(path)
        List<String> lines= Files.readAllLines(Path.of(pathIn));

        //2.Трябва да обходим всеки един ред за да намерим сумата 
//        for (String line:lines){
//            int sum=0;
//          //намиране на сумата от аsci--> принтиране на сумата
//            for(int i=0 ;i<line.length() ;i++){
//                char currentSymbol=line.charAt(i);
//                sum=sum+currentSymbol;
//            }
//            System.out.println(sum);
//        }

//        lines.stream().forEach(entry -> {//Пускам стрийм по lines, и после мапва всеки един от елементите(всеки един ред го превръщам в CharArray)
//            int sum=0;
//            for(int i=0 ;i<entry.length() ;i++){
//                char currentSymbol=entry.charAt(i);
//                sum=sum+currentSymbol;
//            }
//            System.out.println(sum);
//        });                        TAKA СЪЩО РАБОТИ

        lines.stream().map(line -> line.toCharArray())   //"Ivan" -> ['I','v','a','n']
                .forEach(arr -> {                        //За всеки един ред,който представлява масив от символи
                    int sum=0;
                    for (char symbol:arr){
                        sum=sum+symbol;
                    }
                    System.out.println(sum);
                });

    }
}
