package MultimentionalsArraysMatrixExercise;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows=scanner.nextInt();
        int cols=scanner.nextInt();

        String[][]matrix=new String[rows][cols];

        char symbol='a';

        for(int row=0 ;row<rows ;row++){
            for(int col=0 ;col<cols ;col++){
                String palindrome=""+symbol+(char)(symbol+col)+symbol;
                matrix[row][col]=palindrome;
            }
            symbol=(char)(symbol+1);
        }

        printMatrix(matrix,rows,cols);
    }

    private static void printMatrix(String[][] matrix,int rows,int cols) {
        for(int row=0 ;row<rows ;row++){
            for(int col=0 ;col<cols ;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
