package StreamFilesExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {


        String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader bf=new BufferedReader(new FileReader(path));
        //Вътре в скобите на new BufferReader трябва да му кажа от кой файл искам да чете

        String line=bf.readLine();//държим си реда,който сме прочели
        //bf.readLine e функционалост,която чете всеки ред поотеделно

        //Със readAllLines взимам всички редове и ги съхраняваме наведнъж

        //bf ще ми чете от този път(path)(файл),който съм си създал


        long sum=0;

//        while(line!=null){//Докато реда,които съм прочел е различен от null
//            //За всеки един от редовете искам да обхождам символите от този ред
//            for(int i=0 ;i<line.length() ;i++){
//                char currentSymbol=line.charAt(i);
//                sum=sum+currentSymbol;
//            }
//            line= bf.readLine();//Прочитам си следващия ред
//        }
//
//        System.out.println(sum);

        byte [] allBytes=Files.readAllBytes(Path.of(path));
        //Когато кажем readAllbytes  то ми връща един масив с всичките байтове
        //Държа си всичк байтове,който са от пътя който съм въвел(path);
        //Какво прави readAllBytes?-->
        //Взима ми абслолютно всички символи;връща ми един масив с абсолютно всички символи и техните аски кодове
        //Реално когато кажа readAllBytes аз получавам масив от аски кодовете на всички симовли,които имам вътре в моя файл

        //readAllBytes освен,че взима всички симоволи,преди да минем на нов ред взима символите /n/r--> За това ще си направя проверка за да не ми се добавят към обшата сума
        //Когато четем с readAllBytes то взима и стойностите,който са накрая на реда /n/r

        //В Ascii таблицата за симовли се броят и новият ред(10) и /r carriagereturn(13);

        for (byte myByte:allBytes){//Искам да си обходя всеки един байт,който имам в allBytes
            if(myByte != 10 && myByte!= 13){
                sum+=myByte;
            }
        }
        System.out.println(sum);
    }
}
