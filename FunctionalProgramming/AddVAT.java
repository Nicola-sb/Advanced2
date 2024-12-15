package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]prices=scanner.nextLine().split(",\\s+");
        Function<String,Double>doubleParseDouble=e->Double.parseDouble(e);
        Function<Double,Double>addVat= e -> e * 1.2;
        Consumer<Double>printer= e-> System.out.printf("%.2f%n",e);

        System.out.println("Prices with VAT:");
//        Arrays.stream(prices).map(doubleParseDouble).map(addVat).forEach(printer);
        List<Double> doubletoPrint=Arrays.stream(prices).map(e-> Double.parseDouble(e)).map(e -> e * 1.2).collect(Collectors.toList());
        doubletoPrint.forEach(e-> System.out.printf("%.2f%n",e));
    }
}
