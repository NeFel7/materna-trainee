package candyLord;

public class Player {
    int inventorySpace;
    int cash;
    int bank;
    int debt;

    public void Player (){
        this.inventorySpace = 100;
        this.cash = 2000;
        this.bank = 0;
        this.debt = 0;

        Candy Giotto = new Candy();
        Candy KinderSchocobons = new Candy();
        Candy Toblorone = new Candy();
        Candy Snickers = new Candy();
        Candy Smarties = new Candy();
        Candy Haribo = new Candy();
        Candy Schokokuss = new Candy();
        Candy Esspapier = new Candy();

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
