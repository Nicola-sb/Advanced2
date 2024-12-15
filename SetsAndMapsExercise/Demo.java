package SetsAndMapsExercise;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>>handsOfCardsMap=new LinkedHashMap<>();

        String input=scanner.nextLine();
        while (!input.equals("JOKER")){
            //Peter: 2C, 4H, 9H, AS, QS
            String[] inputData=input.split(":\\s+");

            String playerName=inputData[0];//Peter
            String hands=inputData[1];//"[2C, 4H, 9H, AS, QS]"
            String []handsArray=hands.split(",\\s+");

            Set<String>cardsSet=new HashSet<>();
            cardsSet.addAll(Arrays.asList(handsArray));


            if(!handsOfCardsMap.containsKey(playerName)){
                handsOfCardsMap.put(playerName,cardsSet);
            }else{
                Set<String>currentHands=handsOfCardsMap.get(playerName);
                currentHands.addAll(cardsSet);
                handsOfCardsMap.put(playerName,currentHands);
            }


            input=scanner.nextLine();
        }

        handsOfCardsMap.entrySet().forEach(entry ->{
            String playerName= entry.getKey();
            Set<String>cardsHand=entry.getValue();
            int points=getCardsPoints(cardsHand);
            System.out.println(playerName+": "+points);
        });

    }

    private static int getCardsPoints(Set<String> cardsHand) {
        //QH, QC, JS, JD, JC
        Map<Character,Integer>symbolsValue=getSumValue();
        //Създавам си променлива в коята ще държа общо всичките точки от Characte * Integer
        int sumAllPoints=0;
        //Със един форийч цикъл си обхождавм всяка една карта в сета cardsHand
        for (String card:cardsHand){
            //card --> QH -->[сила][тип]
            //Трябва всяка една буква да я взема поотеделно
            //Създавам си променлива за точките от тази ръка QH -->Q * H --> 12 * 3
            int points=0;
            //За каратата 10 си правя проверка,защото е с 2 цифри
            if(card.startsWith("10")){
                //трябва на картата да взема силата и типа-->
                //Ще си създавам две променливи тип чар в които щи си държа силата и типа
                char type=card.charAt(2);//Ako картата е 10C си взимам 3я символ които ми е C и това ми е типа
                //типа трябва да го умножа по силата за да си получи точките за текущата ръка
                //към променивата point си добавям точките от текущата ръка
                points=10*symbolsValue.get(type);
            }else{
                char power=card.charAt(0);
                char type=card.charAt(1);
                points=symbolsValue.get(power)*symbolsValue.get(type);
            }
            sumAllPoints=sumAllPoints+points;
        }
        return sumAllPoints;
    }

    private static Map<Character, Integer> getSumValue() {
        //Toзи метод ми държи всеки един символ на какво число отговаря
        //връщам мап с ретърн getSumValue
        Map<Character,Integer>characterValues=new HashMap<>();
        characterValues.put('2',2);
        characterValues.put('3',3);
        characterValues.put('4',4);
        characterValues.put('5',5);
        characterValues.put('6',6);
        characterValues.put('7',7);
        characterValues.put('8',8);
        characterValues.put('9',9);
        characterValues.put('J',11);
        characterValues.put('Q',12);
        characterValues.put('K',13);
        characterValues.put('A',14);
        characterValues.put('S',4);
        characterValues.put('H',3);
        characterValues.put('D',2);
        characterValues.put('C',1);
        return characterValues;
    }
}
