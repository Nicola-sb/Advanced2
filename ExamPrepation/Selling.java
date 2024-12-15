package ExamPrepation;

import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String[][]matrix=new String[n][n];

        for(int row=0 ;row<n ;row++){
            String[] input=scanner.nextLine().split("");
            for(int col=0;col<n ;col++){
              matrix[row]=input;
            }
        }
      String command=scanner.nextLine();

    }
}
