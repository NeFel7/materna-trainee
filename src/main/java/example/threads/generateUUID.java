package example.threads;

import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class generateUUID {

    public static void main(String[] args) {

        Stream.generate(UUID::randomUUID)
                .limit(20)
                .forEach(System.out::println);

        Stream.generate(UUID::randomUUID)
                .map(UUID::toString)
                .limit(100)
                .parallel()
                .peek(a -> System.out.println(Thread.currentThread()))
                .collect(Collectors.joining("\n"));
    }
}
