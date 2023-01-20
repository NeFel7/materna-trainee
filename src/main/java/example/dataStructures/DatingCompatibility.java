package example.dataStructures;

import java.util.HashSet;
import java.util.Set;

public class DatingCompatibility {



    public static void main(String[] args) {
        Set<String> hobbies1 = Set.of("Candy making", "Camping", "Billiards", "Fishkeeping", "Eating", "Action figures", "Birdwatching", "Axe throwing" );
        Set<String> hobbies2 = Set.of( "Axe throwing", "Candy making", "Camping", "Action figures", "Case modding", "Skiing", "Satellite watching" );

        Set<String> inBoth = new HashSet<>(hobbies1);
        inBoth.retainAll(hobbies2);

        System.out.println("Matching Hobbies: " + inBoth);

        int hobbies1Percentage = (inBoth.size() * 100) / hobbies1.size();
        int hobbies2Percentage = (inBoth.size() * 100) / hobbies2.size();

        System.out.println("Matching Hobbies from Person 1: " + hobbies1Percentage + "%, Matching Hobbies from Person 2: " +hobbies2Percentage + "%");

    }
}
