package MultimentionalsArraysMatrix;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input=scanner.nextLine().split(",\\s+");
        int rows=Integer.parseInt(input[0]);
        int columns=Integer.parseInt(input[1]);

        int[][]matrix=new int[rows][columns];

        for(int row=0 ;row<rows ;row++){
            int[]currentNum= Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
            for(int col=0 ;col<columns ;col++){
                matrix[row][col]=currentNum[col];
            }
        }

        int[][]maxMatrix=new int[2][2];
        int maxSum=Integer.MIN_VALUE;
        for(int row=0 ;row< matrix.length-1 ;row++){
            for(int col=0 ;col< matrix[row].length-1 ;col++){
                int sum=0;

                sum=matrix[row][col]+matrix[row][col+1]+matrix[row+1][col]+matrix[row+1][col+1];
                if(sum> maxSum){
                    maxSum=sum;
                    maxMatrix[0][0]=matrix[row][col];
                    maxMatrix[0][1]=matrix[row][col+1];
                    maxMatrix[1][0]=matrix[row+1][col];
                    maxMatrix[1][1]=matrix[row+1][col+1];
                }
            }
        }
        for (int[]item:maxMatrix){
            for (int element:item){
                System.out.print(element+ " ");
            }
            System.out.println();
        }

        System.out.println(maxSum);
    }
}
