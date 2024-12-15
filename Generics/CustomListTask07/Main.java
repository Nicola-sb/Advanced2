package CustomListTask07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        CustomList<String>customList=new CustomList<>();
        while (!command.equals("END")){
            String currentType=command.split("\\s+")[0];
            switch (currentType){
                //•	Add {element} - Adds the given element to the end of the list.
                //•	Remove {index} - Removes the element at the given index.
                //•	Contains {element} - Prints if the list contains the given element (true or false).
                //•	Swap {index1} {index2} - Swaps the elements at the given indexes.
                //•	Greater {element} - Counts the elements that are greater than the given element and prints their count
                //•	Max - Prints the maximum element in the list.
                //•	Min - Prints the minimum element in the list.
                //•	Print - Prints all elements in the list, each on a separate line.
                case "Add":
                    String elementToAdd=command.split("\\s+")[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int indexToRemove=Integer.parseInt(command.split("\\s+")[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                    String elementToContains=command.split("\\s+")[1];
                    System.out.println(customList.contains(elementToContains));
                    break;
                case "Swap":
                    int firstIndexSwap=Integer.parseInt(command.split("\\s+")[1]);
                    int secondIndexSwap=Integer.parseInt(command.split("\\s+")[2]);
                    customList.swap(firstIndexSwap,secondIndexSwap);
                    break;
                case "Greater":
                    String greaterElement=command.split("\\s+")[1];
                    System.out.println(customList.countGreaterThan(greaterElement));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
            }
            command=scanner.nextLine();
        }

    }
}
