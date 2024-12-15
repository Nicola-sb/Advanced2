package StreamsFilesDirectories;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

     Cube cube=new Cube("blue",1,1,1);
     //Как можем да съхраним това кубче във файл?

        //За да записваме и да четем обекти ще ни трябват-> ObjectInputStream  и  ObjectOuputStream

        //Трябва да си създаме файл -->
        String path="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\MyCube.ser";

        //Създавеме си ObjectOutputStream-->> защото искаме да си запишем първо нещо и после ще го четем
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(path));
                //ObjectOutputStream очаква друг OutputStream,за това си създавме FileOutputStream,който да сочи към този файл

        //Искам да си запиша Обекта Куб
        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(path));
        Cube cubeFromFile=(Cube) objectInputStream.readObject();
        System.out.println();



    }
}
