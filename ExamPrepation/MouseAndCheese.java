package ExamPrepation;

import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        String [][]matrix=new String[n][n];

        for(int row=0 ;row<n ;row++){
            String[] currentRow=scanner.nextLine().split("");
            for(int col=0 ;col<n ;col++){
                matrix[row][col]=currentRow[col];
            }
        }
        //Попълнил съм си матрицата

        //Правя си цъкъл в който да си намеря мишката--М
        int mouseRow=0;
        int mouseCol=0;

        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                if(matrix[row][col].equals("M")){
                    mouseRow=row;
                    mouseCol=col;
                }
            }
        }

        int countCheese=0;

        String command=scanner.nextLine();
        while (!command.equals("end")){
            matrix[mouseRow][mouseCol]="-";
            switch (command){
                //up", "down", "left", "right
                case "up":
                    mouseRow--;
                    break;
                case "down":
                    mouseRow++;
                    break;
                case "left":
                    mouseCol--;
                    break;
                case "right":
                    mouseCol++;
                    break;
            }

            if(mouseRow < 0 || mouseRow>=n || mouseCol<0 || mouseCol >=n){
                System.out.println("Where is the mouse?");
                break;
            }

            if(matrix[mouseRow][mouseCol].equals("c")){
                countCheese++;
            }
            if(matrix[mouseRow][mouseCol].equals("B")){
                continue;
            }

            matrix[mouseRow][mouseCol]="M";
            command=scanner.nextLine();
        }

        if(countCheese>=5){
            System.out.printf("Great job, the mouse is fed %d cheeses!%n",countCheese);
        }else{
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",5-countCheese);
        }

        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }


    }
}
