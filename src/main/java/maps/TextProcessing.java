package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TextProcessing {

    /**
     *     Compute the # of occurrences for each word in the array of words
     *     @param words - an array of strings
     */
    public static void computeFrequencies(String[] words) {
        HashMap<String, Integer> counterMap = new HashMap<>();
        for (String word: words) {
            // FILL IN CODE:

        }

        // Print the map:
        // FILL IN CODE

    }

    /**
     * Computes a map where the lengths are the keys, and the set of words that have this length is the value.
     * @param words array of strings
     */
    public static void computeLengthToWords(String[] words) {
        HashMap<Integer, HashSet<String>> lengthToWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int l = word.length();

            // FILL IN CODE:
        }
        // Print the map
        // FILL IN CODE:

    }

    /** Groups words by their first character and prints the resulting map.
     *
     * @param words array of words
     */
    public static void computeFirstLetterToWords(String[] words) {
        HashMap<Character, HashSet<String>> firstLetterMap = new HashMap<>();
        // The key is the character and the value is the hash set of words that have this character in position 0 (the first character of the word)
        /* Example: Suppose the words are {"cat", "parrot", "crane", "fox", "panda"}
         The map may look like this:
         'c' -> {"cat", "crane"}
         'p' -> {"parrot", "panda"}
         'f' -> {"fox"}
         */
        for (String word : words) {
            if (word.isEmpty()) continue;
            char first = word.charAt(0);

            // FILL IN CODE:
        }

        // Print the map
        // FILL IN CODE:

    }

    /**
     * Take a list of City-objects, and for each City, place it in the map so that
     * the key is the continent, and the value is another map, where the key is the country name
     * and the value is yet another map, mapping each city to it's population
     * @param cities
     */
    public static void buildWorld(List<City> cities) {
        Map<String, Map<String, Map<String, Integer>>> world = new HashMap<>();
        /* Example: (including only some continents, a couple of countries/cities per continent)
        world = {
                Europe -> {
                    France -> { Paris -> 2148327, Lyon -> 515695 },
                    Germany -> { Berlin -> 3769000, Munich -> 1488000 }
                },
                Asia -> {
                    China -> { Beijing -> 21540000, Shanghai -> 24240000 },
                    India -> { Delhi -> 30290000, Mumbai -> 20411000 }
                },
                Africa -> {
                    Nigeria -> { Lagos -> 14000000, Abuja -> 3600000 },
                    South Africa -> { Johannesburg -> 5635000, Cape Town -> 4800000 }
                },
                North America -> {
                    United States -> { New York City -> 8336817, Los Angeles -> 3979576 },
                    Canada -> { Toronto -> 2930000, Vancouver -> 675218 }
                },
                South America -> {
                    Brazil -> { São Paulo -> 12325232, Rio de Janeiro -> 6747815 },
                    Mexico -> { Mexico City -> 9209944, Guadalajara -> 1495000 }
            }
        }
        */

        // FILL IN CODE:
    }

}
