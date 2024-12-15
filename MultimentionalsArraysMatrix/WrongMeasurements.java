package MultimentionalsArraysMatrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());//3
        int[][]matrix=new int[rows][];

        List<int[]>correctValueess=new ArrayList<>();

        for(int row=0 ;row< rows ;row++){

            matrix[row]=readArray(scanner);
        }
        int[]indexes= readArray(scanner);// 1 0

        int valueToReplace=matrix[indexes[0]][indexes[1]];

        //Трябва да обходим матрицата и там където срещнем valueToReplace трябва да го заменим със сбора от числата намиращите се около него
        for(int row=0 ;row< matrix.length ;row++){
            for(int col=0 ;col<matrix[row].length ;col++){
                if(matrix[row][col]==valueToReplace){//Трябва да направя проверка дали текущото число навсякде около него има числа
                    int correctValue=getNearbySum(matrix,row,col,valueToReplace);
                    correctValueess.add(new int[]{row,col,correctValue});
                }
            }
        }

        for (int[]corectValue:correctValueess){
            int row=corectValue[0];
            int col=corectValue[1];
            matrix[row][col]=corectValue[2];
        }

        for (int[]current:matrix){
            for (int element:current){
                System.out.print(element+ " ");
            }
            System.out.println();
        }


    }

    private static int getNearbySum(int[][] matrix, int row, int col,int valueToReplace) {
        int sum=0;
        if(isInBound(matrix,row+1,col)&& matrix[row+1][col] !=valueToReplace){
           sum=sum+matrix[row+1][col];
        }
        if(isInBound(matrix,row-1,col)&&matrix[row-1][col]!=valueToReplace){
            sum=sum+matrix[row-1][col];
        }
        if(isInBound(matrix,row,col+1)&&matrix[row][col+1]!=valueToReplace){
            sum=sum+matrix[row][col+1];
        }
        if(isInBound(matrix,row,col-1)&&matrix[row][col-1]!=valueToReplace){
            sum=sum+matrix[row][col-1];
        }
    return sum;
    }

    private static boolean isInBound(int[][]matrix,int row,int col) {//Този метод работи за всяка една матрица да провери дали даден индекс по ред и колона се намира в нея
        return row>=0 && row< matrix.length && col>=0 && col<matrix[row].length;
    }

    private static int[] readArray(Scanner scanner) {
        int[]numbersToMatrix= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();//1 2 4
        return numbersToMatrix;
    }
}
