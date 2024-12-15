package StreamFilesExercise;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {

        //1.Достъп до папката--> път
        //2.Обхождаме всички файлове в папката -> на всеки файл взимаме размера--> сумираме
        //3.Печатаме общия размер на папката
        String path="D:\\Работен плот\\Java документи и снимки\\Java Advanced\\StreamAndFilesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder=new File(path);//Създавам си File,който се казва folder и се намира на този път->(path);
        //Съсздам си един файл,който го взимам от този път->path
        //Вече имам достъп до папката

        File[] allFiles=folder.listFiles();
        //Когато на кажа folder.listFiles получам един масив от файловете

        int sumFolderSize=0;

        //Искам да обходя всички файлове в папката
        for (File files:allFiles){
            sumFolderSize+=files.length();//Към размера на папката си добавям на моя файл неговата дължина/размер (дължина=размер)
        }

        System.out.println("Folder size: "+sumFolderSize);

        //1во си взехме нашата папка чрез нейния път --> File folder=new File(path);
        //2ро След това направихме един масив в който съхранихме всички файлове в тази папка
        //3то Обходиме всеки един от файловете--> На всеки един от файловете му взехме големината и go добавихме към sumFolderSize


        //Как можем да си вземем една папка и да вземем всичките файлове,които са в тази папка
    }
}
