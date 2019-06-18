import java.util.ArrayList;
import java.util.Collections;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> lunch = new ArrayList<>();

        Hero black = new Hero ("Black Widow", 34);
        Hero captain = new Hero ("Captain America",100);
        Hero vision = new Hero ("Vision", 3);
        Hero iron = new Hero ("Iron Man",48);
        Hero scarlet = new Hero ("Scarlet Witch",29);
        Hero thor = new Hero ("Thor",1500);
        Hero spider = new Hero ("Spider-Man",18);
        Hero hulk = new Hero ("Hulk",49);
        Hero doctor = new Hero ("Doctor Strange",42);


        lunch.add(black);
        lunch.add(captain);
        lunch.add(vision);
        lunch.add(iron);
        lunch.add(scarlet);
        lunch.add(thor);
        lunch.add(spider);
        lunch.add(hulk);
        lunch.add(doctor);

        thor.setAge(1501);
        
        Collections.shuffle(lunch);

        lunch.subList(0, lunch.size()/2).clear();

        for(int i = 0 ; i < lunch.size(); i++){
            System.out.println(lunch.get(i).getName());
        }
        // TODO 5 : Keep only the half of the list

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    }
}