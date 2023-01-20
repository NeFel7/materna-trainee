package candyLord;

public class Candy {
    private final String name;
    private int count;
    private int currentPrice;
    private final int minPrice;
    private final int maxPrice;

    public Candy(String name, int minPrice, int maxPrice) {
        this.name = name;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;

    }
    public void calculateCurrentPrice(Neighborhood neighborhood){

        int newPrice = (int) Math.round(currentPrice * neighborhood.getPriceList().get(this));

        if(newPrice < minPrice || newPrice > maxPrice){
            calculateCurrentPrice(neighborhood);
        }
        currentPrice = newPrice;
    }

    public void increaseAmountBy(Integer amount){
        if(amount < 0){
            throw new IllegalArgumentException("Negative parameters are not accepted.");
        }
        count += amount;
    }
    public void decreaseAmountBy(Integer amount){
        if(amount < 0){
            throw new IllegalArgumentException("Negative parameters are not accepted.");
        }
        if((count - amount) < 0 ){
            throw new IllegalArgumentException("Your amount can´t decrease below zero.");
        }
        count -= amount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }
}
