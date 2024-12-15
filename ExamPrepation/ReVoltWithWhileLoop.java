
package ExamPrepation;

import java.util.Scanner;

public class ReVoltWithWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        int nNumberOfCommands=Integer.parseInt(scanner.nextLine());

        char[][]matrix=new char[n][n];

        for(int row=0 ;row<n ;row++){
            matrix[row]=scanner.nextLine().replaceAll("","").toCharArray();
        }

        int currentRow=0;
        int currentCol=0;
        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                char currentSymbol=matrix[row][col];
                if(currentSymbol=='f'){
                    currentRow=row;
                    currentCol=col;
                }
            }
        }
        boolean isFinishFound=false;

//        for(int i=0 ;i<nNumberOfCommands ;i++){
//            String command=scanner.nextLine();
//            matrix[currentRow][currentCol]='-';
//
//            switch (command){
//                case "left":
//                    currentCol--;
//                    break;
//                case "right":
//                    currentCol++;
//                    break;
//                case "up":
//                    currentRow--;
//                    break;
//                case "down":
//                    currentRow++;
//                    break;
//            }
//            if(currentCol <0){
//                currentCol=n-1;
//            }
//            if(currentRow < 0){
//                currentRow=n-1;
//            }
//            if(currentCol >=n){
//                currentCol=0;
//            }
//            if(currentRow>=n){
//                currentRow=0;
//            }
//
//            if(matrix[currentRow][currentCol]=='F'){
//                System.out.println("Player won!");
//                isFinishFound=true;
//                matrix[currentRow][currentCol]='f';
//                break;
//            }else if(matrix[currentRow][currentCol]=='B'){
//                if(command.equals("left")){
//                    currentCol--;
//                    matrix[currentRow][currentCol]='f';
//                }else if(command.equals("right")){
//                    currentCol++;
//                    matrix[currentRow][currentCol]='f';
//                }else if(command.equals("up")){
//                    currentRow--;
//                    matrix[currentRow][currentCol]='f';
//                }else if(command.equals("down")){
////                   matrix[currentRow][currentCol]=matrix[currentRow+1][currentCol];
//                    currentRow++;
//                    matrix[currentRow][currentCol]='f';
//                }
//            }else if(matrix[currentRow][currentCol]=='T'){
//                if(command.equals("left")){
//                    currentCol++;
//                    matrix[currentRow][currentCol]='f';
//                }else if(command.equals("right")){
//                    currentCol--;
//                    matrix[currentRow][currentCol]='f';
//                }else if(command.equals("up")){
//                    currentRow++;
//                    matrix[currentRow][currentCol]='f';
//                }else if(command.equals("down")){
//                    currentRow--;
//                    matrix[currentRow][currentCol]='f';
//                }
//            }
//            matrix[currentRow][currentCol]='f';
//        }
        while (nNumberOfCommands-- > 0 && !isFinishFound){
            String command=scanner.nextLine();
//            matrix[currentRow][currentCol]='-';
            int oldRow=currentRow;
            int oldCol=currentCol;

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
            if(currentCol <0){
                currentCol=n-1;
            }
            if(currentRow < 0){
                currentRow=n-1;
            }
            if(currentCol >=n){
                currentCol=0;
            }
            if(currentRow>=n){
                currentRow=0;
            }

            if(matrix[currentRow][currentCol]=='F'){
                System.out.println("Player won!");
                isFinishFound=true;
                matrix[oldRow][oldCol]='-';
                matrix[currentRow][currentCol]='f';
                break;
            }else if(matrix[currentRow][currentCol]=='B'){
                if(command.equals("left")){
                    currentCol--;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }else if(command.equals("right")){
                    currentCol++;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }else if(command.equals("up")){
                    currentRow--;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }else if(command.equals("down")){
//                   matrix[currentRow][currentCol]=matrix[currentRow+1][currentCol];
                    currentRow++;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }
            }else if(matrix[currentRow][currentCol]=='T'){
                if(command.equals("left")){
                    currentCol++;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }else if(command.equals("right")){
                    currentCol--;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }else if(command.equals("up")){
                    currentRow++;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }else if(command.equals("down")){
                    currentRow--;
                    matrix[oldRow][oldCol]='-';
                    matrix[currentRow][currentCol]='f';
                }
            }else{
                matrix[oldRow][oldCol]='-';
                matrix[currentRow][currentCol]='f';
            }
//            matrix[currentRow][currentCol]='f';
        }

        if(!isFinishFound){
            System.out.println("Player lost!");
        }
        for(int row=0 ;row<n ;row++){
            for(int col=0 ;col<n ;col++){
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }


    }
}
