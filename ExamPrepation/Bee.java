package ExamPrepation;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        char[][]matrix=new char[n][n];

        int currentRow=0;
        int currentCol=0;

        for(int row=0 ;row<n ;row++){
            matrix[row]=scanner.nextLine().replaceAll("","").toCharArray();
        }
        int countFlowers=0;

        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                char currentSymbol=matrix[row][col];
                if(currentSymbol=='B'){
                    currentRow=row;
                    currentCol=col;
                }else if(currentSymbol=='f'){
                    countFlowers++;
                }
            }
        }
        int currentFlower=0;
        String command=scanner.nextLine();
        while (!command.equals("End")){
            matrix[currentRow][currentCol]= '.';
            switch (command){
                case "left":
//                    if(command.equals("left") && currentCol != n-1)
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "up":
                    currentRow--;
                    break;
            }
            if(currentRow <0 || currentCol < 0 || currentRow>=n || currentCol >=n){
                System.out.println("The bee got lost!");
                break;
            }
            if(matrix[currentRow][currentCol]=='f'){
                currentFlower++;
            }

            if(matrix[currentRow][currentCol]=='O'){
                matrix[currentRow][currentCol]= '.';
                continue;
            }
            matrix[currentRow][currentCol]= 'B';
            command=scanner.nextLine();
        }

        if(currentFlower >= 5){
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n",currentFlower);
        }else{
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n",5 - currentFlower);
        }

        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }
}
