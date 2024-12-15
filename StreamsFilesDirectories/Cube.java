package StreamsFilesDirectories;

import java.io.Serializable;

public class Cube implements Serializable {

    //implements Serializable--> тези 2 неща правят нашето кубче Сериализуемо
    String color;
    int width;
    int lenght;
    int depth;

    public Cube (String color,int width,int lenght,int depth){
        this.color=color;
        this.width=width;
        this.lenght=lenght;
        this.depth=depth;
    }
}
