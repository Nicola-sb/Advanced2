package GenericCountMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //60 ot 100
        int n=Integer.parseInt(scanner.nextLine());
        Box<String>box=new Box<>();
        for(int i=1 ;i<=n ;i++){
            String text=scanner.nextLine();
            box.add(text);
        }

        String valueToCompare=scanner.nextLine();//aa
//        box.countElements(valueToCompare);//2

        System.out.println(box.countElements(valueToCompare));
    }
}
