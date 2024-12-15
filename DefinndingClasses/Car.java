package DefinndingClasses;

public class Car {

    private String brand;
    public String model;

    private int horsePower;

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getHorsePower(){//Позволявам на ползвателите да четят конските сили //Създал съм си private int horsePower и те реално не могат да променят тази стойност
        //така могат да го четат,но не могат да го променят
        return this.horsePower;
    }
    //След това какво трябва да направя за да позволя на хората да променят това поле (private int horsePower)?
    //В нашият случаи ще искаме хората да могат да четат,да пишат и да променят полето (private int horsePower)
    //Тогава трябва да използваме сетъри
    //Те са void методи;Те не връщат нищо
    //Приемат един арггумент и променят стойността,която имаме в нашият клас
    //getHorsePower(int horsePower - това ни е аргумента
    //this.horsePower=horsePower;-- променят стойността,която имаме в нашия клас

    public void setHorsePower(int horsePower){//Някъде отвън ще ни дадът колко к.с. ще бъде нашата кола)
        this.horsePower=horsePower;
    }



}
