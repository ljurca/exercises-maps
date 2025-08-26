package maps;

import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        String[] words1 = {"cat", "dog", "cat", "fox", "cat", "dog"};
        TextProcessing.computeFrequencies(words1);

        String[] words2 = {"apple", "cat", "dog", "axe", "crawl", "anime", "fox"};
        TextProcessing.computeLengthToWords(words2);

        //TextProcessing.computeFirstLetterToWords(words2);

        List<City> cities = List.of(
                new City("Europe", "Germany", "Berlin", 3600000),
                new City("Europe", "Germany", "Munich", 1500000),
                new City("Europe", "France", "Paris", 2200000),
                new City("Europe", "France", "Lyon", 515000),

                new City("Asia", "China", "Beijing", 21540000),
                new City("Asia", "China", "Shanghai", 24240000),
                new City("Asia", "India", "Delhi", 30290000),
                new City("Asia", "India", "Mumbai", 20411000),

                new City("Africa", "Nigeria", "Lagos", 14000000),
                new City("Africa", "Nigeria", "Abuja", 3600000),
                new City("Africa", "South Africa", "Johannesburg", 5635000),
                new City("Africa", "South Africa", "Cape Town", 4800000),

                new City("North America", "United States", "New York City", 8336817),
                new City("North America", "United States", "Los Angeles", 3979576),
                new City("North America", "Canada", "Toronto", 2930000),
                new City("North America", "Canada", "Vancouver", 675218),

                new City("South America", "Brazil", "São Paulo", 12325232),
                new City("South America", "Brazil", "Rio de Janeiro", 6747815),
                new City("South America", "Mexico", "Mexico City", 9209944),
                new City("South America", "Mexico", "Guadalajara", 1495000),

                new City("Oceania", "Australia", "Sydney", 5312163),
                new City("Oceania", "Australia", "Melbourne", 5078193),
                new City("Oceania", "New Zealand", "Auckland", 1652000),
                new City("Oceania", "New Zealand", "Wellington", 215100)
        );


        TextProcessing.buildWorld(cities);


    }
}
