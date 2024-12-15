package IteratorsAndComparatorsExercise.ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Input will come from the console as lines of commands. The first line will always be the "Create" command in the input
        // and it will always be the first command passed. The last command received will always be the "END" command.
        String createInput=scanner.nextLine();
        List<String> dataInput= Arrays.stream(createInput.split("\\s+")).skip(1).collect(Collectors.toList());

        ListIterator listIterator=new ListIterator(dataInput);//-> създава ми се нов обект от класа ListIterator,който ListIterator
        //първоначално се характеризира с List<String>element и index;Щом списъкът не ми е празен listterator  ми е с индекс 0

        String command=scanner.nextLine();

          while (!command.equals("END")){
              switch (command){
                  case "Move":
                      System.out.println(listIterator.move());//--> отпечетай listIterator с едно на дясно,ако може да го премести
                      break;
                  case "Print":
                      try{
                          listIterator.print();
                      }catch (Exception e){
                          System.out.println("Invalid Operation!");
                      }
                      break;
                  case "HasNext":
                      System.out.println(listIterator.hasNext());
                      break;
                  case "PrintAll":
                      listIterator.printAll();
                      break;
              }
              command=scanner.nextLine();
          }


    }
}
