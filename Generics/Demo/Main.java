package Demo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Supermarket supermarket=new Supermarket("Apple","Banana","Orange");
//
//        Iterator<String>shopAssistanttt=supermarket.iterator();
//
//
//        while (shopAssistanttt.hasNext()){
//            System.out.println(shopAssistanttt.next());
//        }
//
//        for (String fruit : supermarket) {
//            System.out.println(fruit);
//        }


        List<Hero> myListWithHero=new ArrayList<>();
        Hero hero1=new Hero("Jurgen Clopp",10);
        Hero hero2=new Hero("Luis Suarez",106);
        Hero hero3=new Hero("Fernando Torres",4);
        Hero hero4=new Hero("Qqq",3434);
        Hero hero5=new Hero("Aaaa",35);
        Hero hero6=new Hero("Aaaa",5);

        myListWithHero.add(hero1);
        myListWithHero.add(hero2);
        myListWithHero.add(hero3);
        myListWithHero.add(hero4);
        myListWithHero.add(hero5);
        myListWithHero.add(hero6);

        HeroComparatorNames myComparatorNames=new HeroComparatorNames();

        
//        Collections.sort(myListWithHero,myComparatorNames);
//        for (Hero hero:myListWithHero){
//            System.out.println(hero.getAge());
//        }
        List<String>favouriteGames=new ArrayList<>();
        GameShop gamesMagazine=new GameShop();
        favouriteGames.add("NBA");
        favouriteGames.add("Football");
        favouriteGames.add("Handball");
        favouriteGames.add("Baseball");
        gamesMagazine.setGames(favouriteGames);

        Iterator<String>gameShopAssistant= gamesMagazine.iterator();
        while (gameShopAssistant.hasNext()){
            System.out.println(gameShopAssistant.next());
        }









    }
}
