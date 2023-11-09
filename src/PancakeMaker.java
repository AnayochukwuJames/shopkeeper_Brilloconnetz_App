import java.util.Random;

public class PancakeMaker {
    static int makePancakes() {
        Random random = new Random();
        return random.nextInt(13);
    }
    static int[] eatingPancakes() {
        Random random = new Random();
        int[] pancakesEaten = new int[3];
        for (int i = 0; i < 3; i++) {
            pancakesEaten[i] = random.nextInt(6);
        }
        return pancakesEaten;
    }

    }
