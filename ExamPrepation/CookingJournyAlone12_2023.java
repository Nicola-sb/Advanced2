package ExamPrepation;

import java.util.Scanner;

public class CookingJournyAlone12_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][]matrix=new char[n][n];

        for(int row=0 ;row<n ;row++){
            matrix[row]=scanner.nextLine().replaceAll("","").toCharArray();
        }

        int currentRow=0;
        int currentCol=0;

        int firstPillarRow=0;
        int firstPillarCol=0;

        int secondPillaroRow=0;
        int secondPillarCol=0;
        boolean isFirstPillarFound=false;
        for(int row=0 ;row< n;row++){
            for(int col=0 ;col<n ;col++){
                char currentSymbol=matrix[row][col];
                if(currentSymbol== 'S'){
                    currentRow=row;
                    currentCol=col;
                }else if(currentSymbol=='P' && !isFirstPillarFound){
                    firstPillarRow=row;
                    firstPillarCol=col;
                    isFirstPillarFound=true;
                }else if(currentSymbol == 'P' && isFirstPillarFound){
                    secondPillaroRow=row;
                    secondPillarCol=col;
                }
            }
        }

        int money=0;

        while (money < 50){
            String command=scanner.nextLine();
            matrix[currentRow][currentCol]='-';

          int oldRow=currentRow;
          int oldCol=currentCol;

          switch (command){
              case "left":
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
            if(currentRow < 0 || currentCol < 0 || currentRow >=n || currentCol >=n){
                System.out.println("Bad news! You are out of the pastry shop.");
                break;
            }

            if(currentRow == firstPillarRow && currentCol== firstPillarCol){
                matrix[oldRow][oldCol]='-';
                currentRow=secondPillaroRow;
                currentCol=secondPillarCol;
                matrix[firstPillarRow][firstPillarCol]='-';
                matrix[currentRow][currentCol]='S';
            }else if(currentRow==secondPillaroRow && currentCol == secondPillarCol){
                matrix[oldRow][oldCol]='-';
                currentRow=firstPillarRow;
                currentCol=firstPillarCol;
                matrix[firstPillarRow][firstPillarCol]='-';
                matrix[currentRow][currentCol]='S';
            }else if(matrix[currentRow][currentCol]=='-'){

            }else{
                money=money+Integer.parseInt(String.valueOf(matrix[currentRow][currentCol]));
                matrix[currentRow][currentCol]='S';
                matrix[oldRow][oldCol] = '-';
            }
        }


        if(money>=50){
            System.out.printf("Good news! You succeeded in collecting enough money!%n");
        }

        System.out.printf("Money: %d%n",money);

               for(int row=0 ;row<n ;row++){
                for(int col=0 ;col<n ;col++){
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
    }
}
