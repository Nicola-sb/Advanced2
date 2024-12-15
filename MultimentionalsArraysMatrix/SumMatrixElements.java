package MultimentionalsArraysMatrix;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input=scanner.nextLine().split(",\\s+");
        int rows=Integer.parseInt(input[0]);
        int columns=Integer.parseInt(input[1]);
        int[][]matrix=new int[rows][columns];


        for(int row=0 ;row<rows ;row++){
            String[]rowOfMatix=scanner.nextLine().split(",\\s+");//7, 1, 3, 3, 2, 1
            for(int col=0 ;col<columns ;col++){
                matrix[row][col]=Integer.parseInt(rowOfMatix[col]);
            }
        }

        //sum elements of matrix
        int sum=0;
        for(int row=0 ;row<rows ;row++){
            for(int col=0 ;col<columns ;col++){
                sum=sum+matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);

        System.out.println();
    }
}
