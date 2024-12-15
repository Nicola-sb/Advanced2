package MultimentionalsArraysMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixWithoutTwoLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input=scanner.nextLine().split(",\\s+");
        int rows=Integer.parseInt(input[0]);
        int columns=Integer.parseInt(input[1]);

        int[][]matrix=new int[rows][columns];

        for(int row=0 ;row<rows ;row++){
            int[]rowOfMatrix= Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row]=rowOfMatrix;
        }

        int sum=0;
        for(int row=0 ;row<rows ;row++){
            for(int col=0 ;col<columns ;col++){
                sum=sum+matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);

    }
}
