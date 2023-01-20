package candyLord;

public class Player {
    private int inventorySpace;
    private int cash;
    private int bank;
    private int debt;
    private Neighborhood currentNeighborhood;
    private final Candy[] candies;

    public Player(Neighborhood currentNeighborhood) {
        this.currentNeighborhood = currentNeighborhood;
        this.inventorySpace = 10;
        this.cash = 500;
        this.bank = 0;
        this.debt = 0;

        candies = generateCandyArray();

    }

    private Candy[] generateCandyArray(){
        Candy[] candies = new Candy[]{
                new Candy("Giotto", 800,900),
                new Candy("KinderSchocobons",700,800),
                new Candy("Toblorone",600,700),
                new Candy("Snickers",500,600),
                new Candy("Smarties",400,500),
                new Candy("Haribo",300,400),
                new Candy("Schocokuss",200,300),
                new Candy("Esspapier",100,200)
        };
        for(int i = 0; i < candies.length; i++ ){
            candies[i].setCount(0);
        }

        return candies;
    }

    public Neighborhood getCurrentNeighborhood() {
        return currentNeighborhood;
    }

    public Candy[] getCandies() {
        return candies;
    }

    public int getInventorySpace() {
        return inventorySpace;
    }

    public void setInventorySpace(int inventorySpace) {
        this.inventorySpace = inventorySpace;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }
}
