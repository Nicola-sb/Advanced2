package ExamPrepation;

import java.util.Scanner;

public class CookingJourneyAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        String[][]matrix=new String[n][n];
        for(int row=0 ;row<n ;row++){
            matrix[row]=scanner.nextLine().split("");
        }

        //You will be placed on a random position, marked with the letter 'S'
        int startRow=0;
        int startCol=0;
        boolean isPillowFound=false;

        int firstPillowRow=0;
        int firstPillowCol=0;

        int secondPillowRow=0;
        int secondPillowCol=0;
        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                if(matrix[row][col].equals("S")){
                    startRow=row;
                    startCol=col;
                }
                if(matrix[row][col].equals("P") && !isPillowFound){
                    firstPillowRow=row;
                    firstPillowCol=col;
                    isPillowFound=true;
                }
                if(matrix[row][col].equals("P")&& isPillowFound){
                    secondPillowRow=row;
                    secondPillowCol=col;
                }
            }
        }
        //Each turn, you will be given commands for the your movement. Move commands will be: "up", "down", "left", "right".

        int money=0;
        while (money<50){
            String command=scanner.nextLine();

            int oldRow=startRow;
            int oldCol=startCol;

            switch (command){
                case "left":
                    startCol--;
                    break;
                case "right":
                    startCol++;
                    break;
                case "up":
                    startRow--;
                    break;
                case "down":
                    startRow++;
                    break;
            }

            if(startRow<0 || startRow>=n || startCol<0 || startCol >=n){
                matrix[oldRow][oldCol]="-";
                break;
            }

            //Ако попадна на някой от пиловите
            if(startRow==firstPillowRow && startCol==firstPillowCol){
                matrix[oldRow][oldCol]="-";
                startRow=secondPillowRow;
                startCol=secondPillowCol;
                matrix[firstPillowRow][firstPillowCol]="-";
                matrix[startRow][startCol]="S";
            }else if(startRow==secondPillowRow &&startCol==secondPillowCol){
                matrix[startRow][startCol]="S";
                startRow=firstPillowRow;
                startCol=firstPillowCol;
                matrix[secondPillowRow][secondPillowCol]="-";
                matrix[oldRow][oldCol]="-";
            }else if(matrix[startRow][startCol].equals("-")){
                matrix[startRow][startCol]="S";
                matrix[oldRow][oldCol]="-";
            }else{
                //попадам на цифра и трябва да я добавя
                money=money+Integer.parseInt(matrix[startRow][startCol]);
                matrix[startRow][startCol]="S";
                matrix[oldRow][oldCol]="-";
            }
        }

        if(money>=50){
            System.out.println("Good news! You succeeded in collecting enough money!");
        }else{
            System.out.println("Bad news! You are out of the pastry shop.");
        }
        System.out.println("Money: "+money);

        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
