import java.sql.Time;

public class Main {
    public static void main(String[] args) {

        int pancakesMade = PancakeMaker.makePancakes();
        int[] pancakesEaten = PancakeMaker.eatingPancakes();
        Long startTime = System.currentTimeMillis();
        System.out.println("Start Time: " + new Time(startTime));
        while (System.currentTimeMillis() - startTime < 30000) {

        }
        long endTime = System.currentTimeMillis();
        System.out.println("total pancakes Made: " + pancakesMade);

        int totalPancakesEaten = 0;
        for (int i = 0; i < 3; i++) {
            totalPancakesEaten += pancakesEaten[i];
        }
        System.out.println("Total Pancake Eaten: " + totalPancakesEaten);
        System.out.println("End Time: " + new Time(endTime));


        if (totalPancakesEaten <= 15 && pancakesMade >= totalPancakesEaten) {
            System.out.println("Shopkeeper met the needs of the 3 users.");
            int wastedPancakes = Math.abs(pancakesMade - totalPancakesEaten);
            System.out.println("Number of wasted pancakes: " + wastedPancakes);
        } else {
            System.out.println("Shopkeeper couldn't meet the needs of all the customers.");
            int orderNotMet = totalPancakesEaten - pancakesMade;
            System.out.println("Pancake order that was not met : " + orderNotMet);
        }
    }
}