package example.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class TrimNonGrowingList {

    static void trimNonGrowingNumbers(ArrayList<Double> numbers){
        if(numbers.size() < 2){
            return;
        }

        double prevNumber = 0;

        for(int i = 0; i < numbers.size(); i++){
            if(prevNumber >= numbers.get(i)){
                numbers.subList(i, numbers.size()).clear();
            }
            else {
                prevNumber = numbers.get(i);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>( Arrays.asList( 1.7, 2.1, 3.4, 2.6, 1.1 ) );
        trimNonGrowingNumbers( numbers );
        System.out.println( numbers );
    }
}
