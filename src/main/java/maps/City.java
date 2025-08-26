package maps;

public class City {
    private final String continent;
    private final String country;
    private final String name;
    private final int population;

    public City(String continent, String country, String name, int population) {
        this.continent = continent;
        this.country = country;
        this.name = name;
        this.population = population;
    }

    public String getContinent() { return continent; }

    public String getCountry() { return country; }

    public String getName() { return name; }

    public int getPopulation() { return population; }

    @Override
    public String toString() {
        return name + " (" + country + ", " + continent + ") → " + population;
    }
}
