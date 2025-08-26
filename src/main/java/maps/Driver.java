package maps;

import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        String[] words = {"apple", "cat", "dog", "axe", "crawl", "anime", "fox"};
        // Test other methods


        TextProcessing.computeFirstLetterToWords(words);

        List<City> cities = List.of(
                    new City("Europe", "Germany", "Berlin", 3600000),
                    new City("Europe", "Germany", "Munich", 1500000),
                    new City("Europe", "France", "Paris", 2200000),
                    new City("Asia", "Japan", "Tokyo", 13900000)
        );

        TextProcessing.buildWorld(cities);
    }
}
