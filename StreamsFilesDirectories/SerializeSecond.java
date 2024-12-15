package StreamsFilesDirectories;

import java.io.*;

public class SerializeSecond {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Cube cube=new Cube("blue",1,1,1);

        String path="C:\\Users\\User\\IdeaProjects\\Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\MyCube.ser";

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(path));

        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(path));
        Cube cubeFromFIle=(Cube)objectInputStream.readObject();
        System.out.println();





    }
}
