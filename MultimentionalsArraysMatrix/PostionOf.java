package MultimentionalsArraysMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class PostionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []inputNumbers=scanner.nextLine().split("\\s+");
        int rows=Integer.parseInt(inputNumbers[0]);
        int columns=Integer.parseInt(inputNumbers[1]);

        int[][]matrix=new int[rows][columns];

        for(int row=0 ;row<rows ;row++){
            int[]numbersToMatrix= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row]=numbersToMatrix;
        }

        int n=Integer.parseInt(scanner.nextLine());
        boolean isFound=false;
        for(int row=0 ;row<rows ;row++){
            for(int col=0 ;col<columns ;col++){
                if(matrix[row][col]==n){
                    System.out.println(row + " "+ col);
                    isFound=true;
                }
            }
        }

        if(!isFound){
            System.out.println("not found");
        }

    }
}
