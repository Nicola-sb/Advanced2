package MultimentionalsArraysMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]inputForFirstMatrix=scanner.nextLine().split("\\s+");
        int rows=Integer.parseInt(inputForFirstMatrix[0]);
        int columns=Integer.parseInt(inputForFirstMatrix[1]);
        int[][]matrixFirst=new int[rows][columns];

        for(int row=0 ;row<rows ;row++){
            int[]numbersForFirstMatrix= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrixFirst[row]=numbersForFirstMatrix;
        }

        String[]inputForSecondMatrix=scanner.nextLine().split("\\s+");
        int rowsSec=Integer.parseInt(inputForSecondMatrix[0]);
        int columnsSec=Integer.parseInt(inputForSecondMatrix[1]);
        int[][]matrixSecond=new int[rowsSec][columnsSec];

        for(int row=0 ;row<rowsSec ;row++){
            int[]numbersForSecondMatrix= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrixSecond[row]=numbersForSecondMatrix;
        }

        if(rows!=rowsSec||columns!=columnsSec){
            System.out.println("not equal");
            return;
        }

        for(int row=0 ;row<rows ;row++) {
            for (int col = 0; col < columns; col++) {
                if (matrixFirst[row][col] != matrixSecond[row][col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");

    }
}
