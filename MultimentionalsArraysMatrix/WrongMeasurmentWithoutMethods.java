package MultimentionalsArraysMatrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurmentWithoutMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());
        int[][]matrix=new int[rows][];

        List<int[]>correctValues=new ArrayList<>();
        for(int row=0 ;row<rows ;row++){
            int[]numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row]=numbers;
        }

        int[]indexes= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int valueToReplace=matrix[indexes[0]][indexes[1]];

        for(int row=0 ;row< matrix.length ;row++){
            for(int col=0 ;col<matrix[row].length;col++){
                if(matrix[row][col]==valueToReplace){
                    if(row>=0 && row <matrix.length && col>=0 && col<matrix[row].length){
                          int sum=0;
                          if(matrix[row+1][col]!=valueToReplace){
                              sum=sum+matrix[row+1][col];
                          }
                          if(matrix[row-1][col]!=valueToReplace){
                              sum=sum+matrix[row-1][col];
                          }
                          if(matrix[row][col-1]!=valueToReplace){
                              sum=sum+matrix[row][col-1];
                          }
                          if(matrix[row][col+1]!=valueToReplace){
                              sum=sum+matrix[row][col+1];
                          }
                    }else{
                        correctValues.add(new int[]{row,col});
                    }
                }
            }
        }

        for (int[]currentArr:matrix){
            for (int element:currentArr){
                System.out.print(element+" ");
            }
        }
    }
}
