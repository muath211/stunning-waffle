import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {

    public static void main(String[] args) {

        printAverages();
    }

    private static void printAverages() {
        Map<String, Double> avgAgeByNationality =
                Stream.of("Name,Nationality,Age",
                                "John,US,30",
                                "Janek,UK,22",
                                "Ali,UK,28",
                                "Janel,UK,29",
                                "Bob,US,35")
                        .skip(1)
                        .map(line -> line.split(","))
                        .filter(rec -> Integer.parseInt(rec[2]) >= 25)
                        .collect(
                                Collectors.groupingBy(rec -> rec[1],
                                        Collectors.averagingDouble(rec -> Double.parseDouble(rec[2])))
                        );

        avgAgeByNationality.forEach((nationality, avgAge) ->
                System.out.printf("Nationality: %s, Average Age: %.2f%n", nationality, avgAge));
    }

}
