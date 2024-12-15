package ExamPrepation;

import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String[] commandsInput=scanner.nextLine().split(",\\s+");
        char [][]matrix=new char[n][n];

        for(int row=0 ;row<n ;row++){
            matrix[row]=scanner.nextLine().replaceAll(" ","").toCharArray();
        }
        int rowPython=0;
        int colPython=0;
        int countFood=0;//Общо количество храна
      //The python starts from s-position --> трябва да намеря къде ми се намира позиция "s"

         for(int row=0 ;row<n ;row++){
             for(int col=0 ;col<n ;col++){
                 char currentSymbol=matrix[row][col];
                 if(currentSymbol=='s'){
                     rowPython=row;
                     colPython=col;
                 }else if(currentSymbol=='f'){
                     countFood++;
                 }
             }
         }
         //moves
        int pythonLenghts=1;//дължина на змията
        boolean isDead=false;
        //Обхождам си командите --> прочел съм ги на 2я ред        String[] commandsInput=scanner.nextLine().split("\\s+");

//        The python starts from s-position The commands will be: "left", "right", "up", "down
        for (String command:commandsInput){
            matrix[rowPython][colPython]='*';
            //вариантите ми за команди са left", "right", "up", "down"
            switch(command){
                case "left":
                    colPython--;
                    break;
                case "right":
                    colPython++;
                    break;
                case "up":
                    rowPython--;
                    break;
                case "down":
                    rowPython++;
                    break;
            }
            //След преместването дали сме излзязли извън полето
            //проверка дали сме излезнали от реда-->
            // If the python reaches the side edge of the screen (left or right), it goes to the opposite side of the same row.
            // If the python reaches the top/bottom edge of the screen it goes on the opposite side of the same column
            if(rowPython<0 || rowPython>=n){
                if(rowPython<0){
                    //ako редът ми стане отрицателен-->змията ми трябва да дойде на последния ред(n-1);
                    rowPython= n-1;
                }
                if(rowPython>=n){
                    rowPython=0;
                }
            }
            if(colPython<0 || colPython>=n){
                if(colPython<0){
                    colPython=n-1;
                }
                if(colPython>=n){
                    colPython=0;
                }
            }
            //Проверка къде сме отишли
            if(countFood==0){
                break;
            }
            if(matrix[rowPython][colPython]=='f'){
                pythonLenghts++;//Ако попаднем на буквата f трябва да увеличм дължината на питона
                countFood--;
            }
            if(matrix[rowPython][colPython]=='e'){//Попаднали сме на enemy И програмата ни трябва да приключи
                isDead=true;
                break;
            }
            matrix[rowPython][colPython]='s';
        }

        if(countFood==0){
            System.out.println("You win! Final python length is "+pythonLenghts);
        }else if(isDead){
            System.out.println("You lose! Killed by an enemy!");
        }else{
            System.out.printf("You lose! There is still %d food to be eaten.%n",countFood);
        }

    }
}
