package MultimentionalsArraysMatrixExercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input=scanner.nextLine().split(",\\s+");
        int n=Integer.parseInt(input[0]);
        String pattern=input[1];
        int[][]matrix=new int[n][n];

        if(pattern.equals("A")){
            getPatternA(matrix);

        }else if(pattern.equals("B")){
            getPatternB(matrix);
        }

//        for (int[]currentArr:matrix){
//            for (int element:currentArr){
//                System.out.print(element+ " ");
//            }
//            System.out.println();
//        }
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for(int row=0 ;row< matrix.length ;row++){
            for(int col=0 ;col< matrix.length ;col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    private static void getPatternB(int[][] matrix) {
        int startNumber=1;
        for(int col=0 ;col<matrix.length ;col++){
            if(col % 2 == 0){
                for(int row=0 ;row<matrix.length ;row++){
                    matrix[row][col]=startNumber;
                    startNumber++;
                }
            }else{
                for(int row= matrix.length-1;row>=0 ;row--){
                    matrix[row][col]=startNumber;
                    startNumber++;
                }
            }
        }
    }

    private static void getPatternA(int[][] matrix) {
        int startNumber=1;
        for(int col=0 ;col< matrix.length ;col++){
            for(int row=0 ;row< matrix.length ;row++){
                matrix[row][col]=startNumber;
                startNumber++;
            }
        }
    }
}
