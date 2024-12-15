package Demo;

import java.util.Comparator;

public class HeroComparatorNames implements Comparator<Hero> {

    @Override
    public int compare(Hero hero1, Hero hero2) {
        return Integer.compare(hero1.getAge(),hero2.getAge());
    }
}
