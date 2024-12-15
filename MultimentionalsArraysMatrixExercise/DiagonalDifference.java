package MultimentionalsArraysMatrixExercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int [][]matrix=new int[n][n];

        for(int row=0 ;row< matrix.length ;row++){
            int[]numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row]=numbers;
        }

        int sumPrimary=getPrimarygDiagonal(matrix);
        int sumSecond=getSecondSum(matrix);

        System.out.println(Math.abs(sumSecond-sumPrimary));
    }

    private static int getSecondSum(int[][] matrix) {
        int sum=0;
        for(int row=0;row< matrix.length;row++){
            for(int col=0 ;col<matrix.length ;col++){
                int currentNum=matrix[row][col];
                if(col==matrix.length-row-1){
                    sum=sum+currentNum;
                }
            }
        }
        return sum;
    }

    private static int getPrimarygDiagonal(int[][] matrix) {
        int sum=0;
        for(int row=0 ;row< matrix.length;row++){
            for(int col=0 ;col< matrix.length ;col++){
                int currentNumber=matrix[row][col];
                if(row==col){
                    sum=sum+currentNumber;
                }
            }
        }
        return sum;
    }
}
