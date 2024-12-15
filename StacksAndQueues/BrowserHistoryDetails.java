package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program, which takes 2 types of browser instructions:
        //•	Normal navigation: a URL is set, given by a string
        //•	The string "back" that sets the current URL to the last set URL

        //After each instruction, the program should print the current URL. If the back instruction can’t be executed, print
        //"no previous URLs". The input ends with "Home" command and then simply you have to stop the program.

        //Hints
        //•	Use ArrayDeque<>
        //•	Use String to keep current page
        //•	Use push(), when moving to next page
        //•	Use pop(), when going back

        ArrayDeque<String> history=new ArrayDeque<>();//Стек в който си държа историята
        String current=null;// Текущ стринг който ми е равен на нул,нула
        String navigation=scanner.nextLine();
        while (!navigation.equals("Home")){//Докато навигацията ми е различна от Home
            if(navigation.equals("back")){//Ако навигацията ми е една с back
              if(!history.isEmpty()){//и във Стека history не е празен(има нещо в него)
                  current=history.pop();//Текущия стринг ми става равен на последният елемент добавен с Стека history
              }else{////Или ако стека history е празен трябва да принтирам-->
                  System.out.println("no previous URLs");
                  navigation=scanner.nextLine();//Прочитам си следващия ред и преминавам към следващата интерация с continue
                  continue;
              }
            }else{//или ако навигацията ми е различна от back трябва да -->
                if(current!=null){//Ако текущия ми стринг е различен от null,не е празен а има нешо
                    history.push(current);////Тогава на текущия Стек history добавя текущия(current)стринг --> history.push(current);
                    //Тогава на текущия Стек history добавя текущия(current)стринг --> history.push(current);
                }
                current=navigation;//Иначе текущия ми стринг е равен на navigation -->Tрябва да си принтирам текущия-->
            }
            System.out.println(current);
            navigation=scanner.nextLine();
        }
    }
}
