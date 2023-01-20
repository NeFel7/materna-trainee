package candyLord;

public class Robbery extends Event{
    @Override
    void process(Player player) {
        player.setCash(0);
//        player.output("Oh no! Someone stole all your cash. At least they let you your candy.%n");
    }
}
