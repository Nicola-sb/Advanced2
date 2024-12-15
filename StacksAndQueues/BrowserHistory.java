package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        ArrayDeque<String>history=new ArrayDeque<>();

        String navigation=scanner.nextLine();

        String current=null;
        while (!navigation.equals("Home")){
                  boolean hasUrl=false;
               if(navigation.equals("back")){
                  if(!history.isEmpty()){
                      current=history.pop();
                  }else{
                      System.out.println("no previous URLs");
                      hasUrl=true;
                  }
               }else{
                   if(current!=null){
                       history.push(current);
                   }
                   current=navigation;
               }
               if(!hasUrl){
                   System.out.println(current);
               }
            navigation= scanner.nextLine();
        }


    }
}
