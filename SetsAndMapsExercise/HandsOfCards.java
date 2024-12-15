package SetsAndMapsExercise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Set<String>>players=new LinkedHashMap<>();
        String input=scanner.nextLine();
        while (!input.equals("JOKER")){
            //Peter: 2C, 4H, 9H, AS, QS
            String playerName=input.split(":\\s+")[0];
            String cards=input.split(":\\s+")[1];
            //card -->2C, 4H, 9H, AS, QS
            String []cardsInHand=cards.split(",\\s+");
            //1.Съхраняване на картите в Set
            Set<String>cardsSet=new HashSet<>();//картите на играча
            cardsSet.addAll(Arrays.asList(cardsInHand));

            //2.Добавяне в мап

            if(!players.containsKey(playerName)){
                //ако не сме го записали
                players.put(playerName,cardsSet);
            }else{
                //ако сме го записали
                Set<String>currentCards=players.get(playerName);//текущите карти
                //към текущите карти добавяме новите изтеглени
                currentCards.addAll(cardsSet);
                players.put(playerName,currentCards);
            }


            input=scanner.nextLine();
        }

        players.entrySet().forEach(entry ->{
            String name= entry.getKey();
            Set<String>cards=entry.getValue();
            int points=getCardspoints(cards);
            System.out.printf("%s: %d%n",name,points);
        });
    }

    private static int getCardspoints(Set<String> cards) {
        Map<Character,Integer>symbolsValues=getSymbolsValue();
        int sumPoints=0;
        //списък с карти: "2C","4H","9H","AS","QS"
        //всяка една карта->намираме точките на картата->добавяме точките на картата към сумата на всички точки
        for (String card:cards){
            //card = "2C" -> "[сила][тип]"
            //сила 2(2) 3(3) 4(4) 5(5) 6(6) 7(7) 8(8) 9(9) 10(10) J(11) Q(12) K(13) A(14)
            //тип  S(4),  H(3),   D(2),    C(1)
            //точки сила*тип
            int points=0;
            if(card.startsWith("10")){
                //Картата е 10C
                //сила=10
                char type=card.charAt(2);
                points=10*symbolsValues.get(type);
            }else{
                //"4H"
                char power=card.charAt(0);//4
                char type=card.charAt(1);//H
                points=symbolsValues.get(power) * symbolsValues.get(type);
            }
            sumPoints=sumPoints+points;
        }
        return sumPoints;
    }

    public static Map<Character, Integer> getSymbolsValue() {
        Map<Character,Integer>charachterValues=new HashMap<>();
        charachterValues.put('2',2);
        charachterValues.put('3',3);
        charachterValues.put('4',4);
        charachterValues.put('5',5);
        charachterValues.put('6',6);
        charachterValues.put('7',7);
        charachterValues.put('8',8);
        charachterValues.put('9',9);
        charachterValues.put('J',11);
        charachterValues.put('Q',12);
        charachterValues.put('K',13);
        charachterValues.put('A',14);
        charachterValues.put('S',4);
        charachterValues.put('H',3);
        charachterValues.put('D',2);
        charachterValues.put('C',1);
        return charachterValues;


    }
}
