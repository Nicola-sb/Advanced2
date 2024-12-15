package GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Box<String>box=new Box<>();
        for(int i=1 ;i<=n ;i++){
            String text=scanner.nextLine();
            box.add(text);
        }
        String[]inputIndex=scanner.nextLine().split(" ");
        int firstIndex=Integer.parseInt(inputIndex[0]);
        int secondIndex=Integer.parseInt(inputIndex[1]);
        box.swap(firstIndex,secondIndex);

        System.out.println(box.toString());
    }
}
