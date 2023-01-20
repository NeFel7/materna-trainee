package example.streams;

import java.util.stream.IntStream;

public class createPyramid {

    private static void buildPyramid(){
        IntStream.rangeClosed( 1, 5 )
                .mapToObj( i -> " ".repeat( 5 - i ) + "/\\".repeat( i ) )
                .forEach( System.out::println );
    }

    public static void main(String[] args) {
        buildPyramid();
    }
}
