package example.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GenerateArray {

    private static int[] fillNewArray(int size, int value){
        if(size < 0){
            throw new IllegalArgumentException("Size must be greater 0!");
        }

        return IntStream.range(0, size).map(input -> value).toArray();
    };


    public static void main(String[] args) {
        System.out.println(Arrays.toString( fillNewArray( 3, -723 ) ));
    }
}
