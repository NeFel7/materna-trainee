package candyLord;

public class Candy {
    int amount;
    int price;
    int minPrice;
    int maxPrice;

    public void Candy (int min, int max){
        minPrice = min;
        maxPrice = max;
        amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
