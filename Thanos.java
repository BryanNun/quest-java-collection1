import java.util.ArrayList;
import java.util.Collections;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<Hero>();

        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero ("Thor", 1500));
        heroes.add(new Hero("Spider-Man", 18));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero ("Doctor Strange", 42));

        heroes.get(5).setAge(1501);

        Collections.shuffle(heroes);
        heroes.subList(0,heroes.size()/2).clear();

        for(int i=0; i <heroes.size(); i++){
            System.out.println(heroes.get(i).getName());
        }
    } 
}