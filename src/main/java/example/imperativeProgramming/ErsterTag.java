package example.imperativeProgramming;

public class ErsterTag {
    public static void main(String[] args) {

/*
        // Aufgabe 1.2.1:
        int x = 100, y = 110;
        double r = 20.5;

        System.out.println(
                "<svg height='100' width='100'>\n" + " <circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" />\n" + "</svg> "
        );

        // Aufgabe 1.2.2:
        int x = 100, y = 110;
        double r = Math.random() * 10 + 10;

        System.out.println(
                "<svg height='100' width='100'>\n" + " <circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" />\n" + "</svg> "
        );


        // Aufgabe 1.2.3:
        System.out.print("Gib den x-Wert an: ");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.print("Gib den y-Wert an: ");
        int y = new java.util.Scanner(System.in).nextInt();
        double r = Math.random() * 10 + 10;
        System.out.println("Hier dein SVG: ");
        System.out.printf("<svg height='100' width='100'>\n <circle cx=\"%d\" cy=\"%d\" r=\"%s\" />\n</svg> %n", x, y, r);


        // Aufgabe 1.3.1:
        boolean check;

        System.out.print("Gib den ersten Wert ein: ");
        double monetaryAmountCosimo = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Gib den zweiten Wert ein: ");
        double monetaryAmountLucia = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Gib den dritten Wert ein: ");
        double monetaryAmountSlickFoot = new java.util.Scanner(System.in).nextDouble();

        double sum = monetaryAmountCosimo + monetaryAmountLucia + monetaryAmountSlickFoot;

        check = (sum >= 1_000_000);
        System.out.println("Der Boolean ist '" + check + "' und die sum ist " + sum + " !");


        // Aufgabe 1.3.5:
        int noOfBottles = 5;
        String bottleOrBottles = noOfBottles != 1 ? "bottles" : "bottle";
        System.out.println(noOfBottles + " " + bottleOrBottles + " of rum");


        // Aufgabe 1.4.2:
        System.out.print("Dealer-Guess: ");
        int dealer = new java.util.Scanner(System.in).nextInt();
        System.out.print("Player-Guess: ");
        int player = new java.util.Scanner(System.in).nextInt();

        int maxValue = 0;
        int maxScore = 21;
        if (player < 2 || dealer < 2) // End programm, when one of dealer or player has 1.
            return;

        if (dealer > maxScore && player > maxScore) { // Both > 21 -> 0
            System.out.println(0);
        } else if (player > maxScore) { // Player > 21 -> Dealer wins
            System.out.println("Der Dealer gewinnt mit einem Wert von " + dealer + ".");
        } else if (dealer > maxScore) { // Dealer > 21 -> Player wins
            System.out.println("Der Player gewinnt mit einem Wert von " + player + ".");
        } else { // Both are <= 21 -> Max is best
            maxValue = Math.max(player, dealer);
            System.out.println((maxValue == dealer ? ("Derler gewinnt mit einem Wert von " + dealer + ".") : ("Player gewinnt mit einem Wert von " + player + ".")));
        }


        // Aufgabe 1.4.4:

        int random = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 4);
        String color = switch (random) {
            case 1 -> "red";
            case 2 -> "green";
            case 3 -> "blue";
            default -> "black";
        };

        System.out.printf("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"%s\"/>", color);


        // Aufgabe 1.4.5:
        String input = new java.util.Scanner(System.in).nextLine();

        switch (input.toLowerCase()) {
            case "ay", "aye", "ay, ay", "ja", "joo" -> System.out.println("Keep it up!");
            default -> System.out.println("Don't you dare!");
        }
        */
    }

}
