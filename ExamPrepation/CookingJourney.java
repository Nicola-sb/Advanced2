package ExamPrepation;

import java.util.Scanner;

public class CookingJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String [][]pastryShop=new String[n][n];
        for(int row=0 ;row<n ;row++){
            String[]input=scanner.nextLine().split("");
            for(int col=0 ;col<n ;col++){
              pastryShop[row][col]=input[col];
          }
        }
        boolean weFoundFirstPillow=false;
        int currentRow=0;//къде се намираме в момента
        int currentCol=0;

        int firstPillarRow=0;
        int firstPillarCol=0;

        int secondPollarRow=0;
        int secondPollarCol=0;

        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                if(pastryShop[row][col].equals("S")){
                    currentRow=row;
                    currentCol=col;
                }else if(pastryShop[row][col].equals("P")&&weFoundFirstPillow==false){
                   firstPillarRow=row;
                   firstPillarCol=col;
                   weFoundFirstPillow=true;
                }else if(pastryShop[row][col].equals("P")&&weFoundFirstPillow==true){
                    secondPollarRow=row;
                    secondPollarCol=col;

                }
            }
        }

        // If you go out of the pastry shop, you disappear from the pastry shop and you are out of there.
        // You need at least 50 dollars to rent your own Pastry shop.
        //When you are out of the pastry shop or you collect enough money, the program ends.
        int money=0;
        while (money<50){
            String command=scanner.nextLine();
            int oldRow=currentRow;
            int oldCol=currentCol;
            //Each turn, you will be given commands for the your movement. Move commands will be: "up", "down", "left", "right".
            // If you move to a client, you collects the price equal to the digit there and the client disappears.
            // If you move to a pillar, you move on the position of the other pillar and then both pillars disappear
            //Възможни команди: "up", "down", "left", "right".
            switch (command){
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
            }
            //Цикъла приключва когато съберем над 50 долара или когато излезнем извън матрицата
            //Правя си втора проверка и ако съм излезнал извън матрицата си приключвам цикъла--->
            if(currentRow<0 || currentRow>=n || currentCol<0 || currentCol>=n){
                pastryShop[oldRow][oldCol]="-";//Ако сме излезнали извън матрицата трябва да сложим "-" на позицията на която сме били
                break;
            }
            //Ако попаднем на някой от пилоните P-->
            if(currentRow==firstPillarRow && currentCol==firstPillarCol){
                //сме попаднали на първия пилон
                //трябва да отидем на втория пилон
                currentRow=secondPollarRow;
                currentCol=secondPollarCol;//така отиваме на позицията на втория пилон P
                pastryShop[oldRow][oldCol]="-";
                //--> там където сме се намирали до момента трябва да му зададем символ "-";
                pastryShop[firstPillarRow][firstPillarCol]="-";
                //->> И новата позицията на която се намираме трябва да бъде равна на "S" -->
                pastryShop[currentRow][currentCol]="S";
            }else if(currentRow==secondPollarRow && currentCol==secondPollarCol){
                currentRow=firstPillarRow;
                currentCol=firstPillarCol;
                pastryShop[oldRow][oldCol]="-";
                pastryShop[secondPollarRow][secondPollarCol]="-";
                pastryShop[currentRow][currentCol]="S";
            }else if(pastryShop[currentRow][currentCol].equals("-")){
                pastryShop[currentRow][currentCol]="S";
                pastryShop[oldRow][oldCol]="-";
            }else{
                //Попадаме на клиент и трябва да му добавим парите-->
                money=money+Integer.parseInt(pastryShop[currentRow][currentCol]);
                pastryShop[currentRow][currentCol]="S";
                pastryShop[oldRow][oldCol]="-";
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
                System.out.print(pastryShop[row][col]);
            }
            System.out.println();
        }

    }
}
