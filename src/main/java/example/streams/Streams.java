package example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    static String path = "C:\\Users\\fnewrzel\\IdeaProjects\\materna-trainee\\src\\main\\resources\\stream.txt";

    private static void sortLinesByLength () {
        try {
            Comparator<String> compareByLength = (a, b) -> a.length() - b.length();
            System.out.println(Files.lines(Paths.get(path)).sorted(compareByLength).collect(Collectors.joining(",\n")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void joinLines() {
        try {
            System.out.println(Files.lines(Paths.get(path)).collect(Collectors.joining(",\n")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void findLineCount() {
        try {
            System.out.println("Line Count: " + Files.lines(Paths.get(path)).count());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void isThereANumber() {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            System.out.println(stream.anyMatch(line -> line.matches(".*\\d+.*")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
    sortLinesByLength();
//        joinLines();
//    findLineCount();
//    isThereANumber();
    }
}
