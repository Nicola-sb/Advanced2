package MultimentionalsArraysMatrixExercise;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[]input=scanner.nextLine().split("\\s+");
        int rows=Integer.parseInt(input[0]);
        int cols=Integer.parseInt(input[1]);
        String[][]matrix=new String[rows][cols];

        for(int row=0 ;row<rows ;row++){
            String[]numbers=scanner.nextLine().split("\\s+");
            matrix[row]=numbers;
        }

        String command=scanner.nextLine();
        while (!command.equals("END")){

            if(!getIsValidIndex(command,rows,cols)){
                System.out.println("Invalid input!");
            }else{
                        int row1=Integer.parseInt(command.split("\\s+")[1]);
                        int col1=Integer.parseInt(command.split("\\s+")[2]);
                        int row2=Integer.parseInt(command.split("\\s+")[3]);
                        int col2=Integer.parseInt(command.split("\\s+")[4]);

                        String firstIndex=matrix[row1][col1];//1
                        String secondIndex=matrix[row2][col2];//5

                        matrix[row1][col1]=secondIndex;
                        matrix[row2][col2]=firstIndex;

                printMyMatrix(matrix);

            }
            command=scanner.nextLine();
        }
    }

    public static void printMyMatrix(String[][] matrix) {
        for(int row=0 ;row< matrix.length ;row++){
            for(int col=0 ;col<matrix[row].length ;col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    private static boolean getIsValidIndex(String command, int rows, int cols) {
        String[]commandDate=command.split("\\s+");//swap 0 0 1 1
        String firstCommand=commandDate[0];

        if(commandDate.length!=5){
            return false;
        }
        if(!firstCommand.equals("swap")){
            return false;
        }
        int row1=Integer.parseInt(commandDate[1]);//0      1 2 3
        int col1=Integer.parseInt(commandDate[2]);//0      4 5 6
        int row2=Integer.parseInt(commandDate[3]);//1
        int col2=Integer.parseInt(commandDate[4]);//1
        if(row1<0 || row1>=rows || col1<0 || col1>= cols || row2<0 || row2>= rows || col2<0 || col2>= cols){
            return false;
        }
        return true;
    }

}
