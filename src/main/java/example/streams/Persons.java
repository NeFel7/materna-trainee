package example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public record Persons(String firstname, String name,  int year) {
    static String path = "C:\\Users\\fnewrzel\\IdeaProjects\\materna-trainee\\src\\main\\resources\\persons.csv";

    private static String mapPersons() {
        try {
            return Files.lines(Paths.get(path))
                    .skip(1)
                    .map(Persons::convertCSVLineToPerson)
                    .collect(Collectors.joining(",\n"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(mapPersons());
    }

    private static String convertCSVLineToPerson(String str) {
        String[] personInformation = str.split(";");
        return new Persons(personInformation[0], personInformation[1], Integer.parseInt(personInformation[2])).name();
    }
}
