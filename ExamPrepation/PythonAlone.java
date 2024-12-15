package ExamPrepation;

import java.util.Scanner;

public class PythonAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String[]commands=scanner.nextLine().split(",\\s+");
        char[][]matrix=new char[n][n];

        for(int row=0 ;row<n ;row++){
            matrix[row]=scanner.nextLine().replaceAll(" ","").toCharArray();//По този начин си напълвам матрицата с чарове
        }

        int rowPython=0;
        int colPython=0;
        int lenghtPython=1;
        int countFoood=0;
        boolean isDead=false;

        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
            char currentSymbol=matrix[row][col];
            if(currentSymbol=='s'){
                rowPython=row;
                colPython=col;
            }else if(currentSymbol=='f'){
                countFoood++;
            }
           }
        }




        for (String command:commands){
            matrix[rowPython][colPython]='s';
            switch (command){
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
            if(rowPython<0 || rowPython>=n){
                if(rowPython<0){
                    rowPython=n-1;
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
            if(countFoood==0){
                break;
            }
            if(matrix[rowPython][colPython]=='e'){
                isDead=true;
                break;
            }
            if(matrix[rowPython][colPython]=='f'){
                lenghtPython++;
                countFoood--;
            }

            matrix[rowPython][colPython]='*';
        }

        if(countFoood==0){
            System.out.println("You win! Final python length is "+lenghtPython);
        }else if(isDead){
            System.out.println("You lose! Killed by an enemy!");
        }else{
            System.out.printf("You lose! There is still %d food to be eaten.",countFoood);
        }
    }
}
