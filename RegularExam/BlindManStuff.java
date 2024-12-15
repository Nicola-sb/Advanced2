package RegularExam;

import java.util.Scanner;

public class BlindManStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []numbers=(scanner.nextLine().split(" "));
        int rows=Integer.parseInt(numbers[0]);
        int cols=Integer.parseInt(numbers[1]);

        String [][]matrix=new String[rows][cols];

        for(int row=0 ;row<rows ;row++){
            matrix[row]=scanner.nextLine().split("\\s+");
        }

        int currentRow=0;
        int currentCol=0;
        for(int row=0 ;row<rows ;row++){
            for(int col=0 ;col<cols ;col++){
                if(matrix[row][col].equals("B")){
                    currentRow=row;
                    currentCol=col;
                }
            }
        }
        int movesMade=0;
        int touchOpponentsP=0;

           String command=scanner.nextLine();
        while (!command.equals("Finish")){
       //up", " down", "right", and "left
            switch (command){
                case "up":
                    if(!matrix[currentRow-1][currentCol].equals("O")){
                        currentRow--;
                        movesMade++;
                    }
                    break;
                case "down":
                    if(!matrix[currentRow+1][currentCol].equals("O")){
                        currentRow++;
                        movesMade++;
                    }
                    break;
                case "right":
                    if(!matrix[currentRow][currentCol+1].equals("O")){
                        currentCol++;
                        movesMade++;
                    }
                    break;
                case "left":
                    if(!matrix[currentRow][currentCol-1].equals("O")){
                        currentCol--;
                        movesMade++;
                    }
                    break;
            }


            if(currentRow<0 || currentRow>=rows){
                if(currentRow<0){
                    currentRow=0;
                }
                if(currentRow>=rows){
                    currentRow=rows-1;
                }
            }
            if(currentCol<0 || currentCol>=cols){
                if(currentCol<0){
                    currentCol=0;
                }
                if(currentCol>=cols){
                    currentCol=cols-1;
                }
            }
            if(matrix[currentRow][currentCol].equals("O")){
                command=scanner.nextLine();
                continue;

            }
            if(matrix[currentRow][currentCol].equals("P")){
                touchOpponentsP++;

                matrix[currentRow][currentCol]="B";
            }
            if(touchOpponentsP==3){
                System.out.println("Game over!");
                System.out.printf("Touched opponents: %d Moves made: %d%n",touchOpponentsP,movesMade);
                return;
            }

            command=scanner.nextLine();
        }


            System.out.println("Game over!");
            System.out.printf("Touched opponents: %d Moves made: %d",touchOpponentsP,movesMade);


    }
}
