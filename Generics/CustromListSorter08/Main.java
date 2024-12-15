package CustromListSorter08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        CustomList<String>customList=new CustomList<>();
        while (!command.equals("END")){
            String currentType=command.split("\\s+")[0];
            switch (currentType){
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
                    System.out.println(customList.countGreatherThan(greaterElement));
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
                case "Sort":
                    customList.sort();
            }
          command=scanner.nextLine();
        }
    }
}
