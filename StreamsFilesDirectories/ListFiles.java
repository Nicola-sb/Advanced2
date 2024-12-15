package StreamsFilesDirectories;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {


        File file=new File("C:\\Users\\User\\IdeaProjects\\Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if(file.exists()){//Ако нашият файл съществувам
            if(file.isDirectory()){//Нашият файл Директория/Папка ли е?
                File[]files=file.listFiles();//Взимаме всичките файлове,който са в тази папка
                for (File f:files){//С фориййч преминаваме през всеки един файл и ако той не е Директория/Папка ще го принтираме->Името на файла и големината
                    if(!f.isDirectory()){
                        System.out.printf("%s: [%s]%n",f.getName(),f.length());
                    }
                }
            }
        }
    }
}
