package GenericCountMethodDoubles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt(scanner.nextLine());
         Box<Double>box=new Box<>();
         for(int i=1 ;i<=n ;i++){
             double number=Double.parseDouble(scanner.nextLine());
             box.add(number);
         }

         double numberToCheck=Double.parseDouble(scanner.nextLine());
        System.out.println(box.countMethod(numberToCheck));

    }
}
