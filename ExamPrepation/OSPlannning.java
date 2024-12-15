package ExamPrepation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlannning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String tasks=scanner.nextLine();
//        String threads=scanner.nextLine();
//        //20, 23, 54, 34, 90
//        //150 64 20 34
//
//        int taskToKill=Integer.parseInt(scanner.nextLine());
//
//        String[]tasksArrays=tasks.split(",\\s+");
//        ArrayDeque<Integer>firstTasks=new ArrayDeque<>();
//        for (String element:tasksArrays){
//            firstTasks.push(Integer.parseInt(element));
//        }
//
//        String[]secondThreadsArray=threads.split("\\s+");
//        ArrayDeque<Integer>secondThreads=new ArrayDeque<>();
//        for (String element:secondThreadsArray){
//            secondThreads.add(Integer.parseInt(element));
//        }
        ArrayDeque<Integer>firstTasks=new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(firstTasks::push);

        ArrayDeque<Integer>secondThreads=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        int taskToKill=Integer.parseInt(scanner.nextLine());


        int firstElement=firstTasks.peek();
        int secondElement=secondThreads.peek();

//•	If the thread value is greater than or equal to the task value, the task and thread get removed.
//•	If the thread value is less than the task value, the thread gets removed, but the task remains.

        while (firstElement!=taskToKill){
            if(secondElement>=firstElement){
                firstTasks.pop();
            }
            secondThreads.poll();

           firstElement=firstTasks.peek();
           secondElement=secondThreads.peek();
        }
//                       "Thread with value {thread} killed task {taskToBeKilled}"
        System.out.printf("Thread with value %d killed task %d%n",secondThreads.peek(),taskToKill);
//
//        secondThreads.forEach( entry ->
//                System.out.print(entry+ " "));
        String leftThreads=secondThreads.stream().map(String::valueOf).collect(Collectors.joining( " "));
        System.out.println(leftThreads);





    }
}
