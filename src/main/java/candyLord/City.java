package candyLord;

import java.awt.*;

public class City {

    private final Neighborhood[] neighborhoods;


    public City(Neighborhood[] neighborhood) {


        neighborhoods = generateNeighborhoodArray();
    }

    private Neighborhood[] generateNeighborhoodArray(){
        Neighborhood[] neighborhoods = new Neighborhood[]{
                new Neighborhood("Queens", new Point(4,6)),
                new Neighborhood("Bronx", new Point(17,6))
        };

        return neighborhoods;
    }

    public int calculateTravelCost(Neighborhood neighborhood, Neighborhood currentNeighborhood){
        int travelCost = (int) Math.round(currentNeighborhood.getDistanceTo(neighborhood) * 10);

        return travelCost;
    }
}
