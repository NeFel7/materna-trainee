package candyLord;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Neighborhood {
    private final String name;
    private final Map<Candy, Double> priceList = new HashMap<>();
    private final Point coordinates;

    public Neighborhood(String name, Point coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public double getDistanceTo(Neighborhood neighborhood){
        return coordinates.distance(neighborhood.coordinates);
    }

    public String getName() {
        return name;
    }

    public Map<Candy, Double> getPriceList() {
        return priceList;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
