package MultimentionalsArraysMatrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurmentDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());
        int[][]matrix=new int[rows][];

        List<int[]>correctValues=new ArrayList<>();
        //Правя си списък,за всеки елемент който има  3 стойности,реда,колона и вярната стойност
        //Правя си списък,защото не знам колко точно ще ми бъде индексите и да мога да си ги добавям
        //Списък от масиви
        //--> после когато намеря correctValues Искам да го добавя към
        for(int row=0 ;row<rows ;row++){
            int[]numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row]=numbers;
        }
        int[]indexes= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();//1 0
        //В този инт масив си държа индексите от матрицата,които са сгрешени и трябва да заменя
        int valueToReplace=matrix[indexes[0]][indexes[1]];
        //Съхранявам стойността която търся-->
        //Трябва да си обходя матрицата и там където срещна valueToReplace трябва да го сменя като стойност

        //За да се презастраховам от грешки винаги външия фор цикъл ходи до matrix.lenght,а вътрешния до от матрицата текущия ред дължината
        //Така ако имам матрица с 3 реда и 4 колони се застраховам и си я прочитам правилно

        for(int row=0 ;row< matrix.length ;row++){
            for(int col=0 ;col<matrix[row].length ;col++){
            //правя си проверка,ако от матрицата на текущия ред и на текущата колона имам стойност която да е равна на valueToReplace

                if(matrix[row][col]==valueToReplace){
                    //Когато това е вярно трябва да сменим стойността.
                    //Как сменямаме стойността?Взимаме сумата от неговите съседни иднески ако ги има
                    //Правя си метод getNearbySum -->трябва да му подам матрицата,реда,коланата и valueToReplace
                    int correctValue=getNearbySum(matrix,row,col,valueToReplace);
                    correctValues.add(new int[]{row,col,correctValue});
                  //В  correctValues искам да добавиш нов масив,който ще съдържа 3 стойности-->реда и колоната на който трябва да замени стойноста
                    // и вярната стойност ---< new int[]
                    //Koгато добавям към new int[] Стойнстите за между КЪДРАВИ СКОБИ-->correctValues.add(new int[]{row,col,correctValue});
                }
            }
        }
        //ПРеди да си отпечам матрица първо трябва да си обходям списък List<int[]>correctValues=new ArrayList<>();
        //Трябва да си обиколям всичките масиви от списъка с верните стойности и -->
        for (int[]correctValue:correctValues){
            int row=correctValue[0];
            int col=correctValue[1];
            matrix[row][col]=correctValue[2];
        }
        for (int[]currentArr:matrix){
            for (int element:currentArr){
                System.out.print(element+ " ");
            }
            System.out.println();
        }
    }

    private static int getNearbySum(int[][] matrix, int row, int col, int valueToReplace) {//трябва да добавя в метода и int valueToReplace
        //и да го добавя в иф проверката да бъде различно от valueToReplace
        //С този метод си намирам сумата на всички възможни съседни индески-->отдясно,отляво,отгоре,отдолу
        int sum=0;
        //Трябва да си направя проверки дали индекса е валиден.Иначе получвам IndexOutOfBoundException
        //Трябва да си направя друг метод,които да ми проверява дали индекса е валиден и дали ще влезна в него-->isInBound

        //Правя си четире проверки за от всяка една страна на числото-->row+1,col  row,col+1    row,col+1   row+1,col+1 и ги сумирам
        //ако е валиден
        if(isInBound(matrix,row+1,col)&& matrix[row+1][col]!=valueToReplace){
            sum=sum+matrix[row+1][col];
        }
        if(isInBound(matrix,row-1,col)&& matrix[row-1][col]!=valueToReplace){
            sum=sum+matrix[row-1][col];
        }
        if(isInBound(matrix,row,col-1)&&matrix[row][col-1]!=valueToReplace){
            sum=sum+matrix[row][col-1];
        }
        if(isInBound(matrix,row,col+1)&&matrix[row][col+1]!=valueToReplace){
            sum=sum+matrix[row][col+1];
        }
        return sum;
    }

    private static boolean isInBound(int[][] matrix, int row, int col) {
        //Трябва да си подам матрицата,реда и колоната
        return row>=0 && row <matrix.length && col>=0 && col<matrix[row].length;
        //Текущия ред трябва да по-голям ила равен на 0 и по-малък или равен на дължината на матрицата
        //и текущата колона трябва да е по-голяма или равна на 0 и по-малка или равна на дължината на текущия ред от матрицата
        //ТОЗИ МЕТОД РАБОТИ ЗА ВСЯКА ЕДНА МАТРИЦА ЗА ПРОВЕРКА ДАЛИ ДАДЕН ИНДЕКС ПО РЕД И КОЛАНА СЕ НАМИРА В НЕГО
    }
}
