import java.util.Random;

public class Goblin extends Enemy {

    public Goblin() {
        super(generateRandomWeight(), generateRandomHeight());
    }

    private static int generateRandomWeight() {
        return new Random().nextInt(5,11);
    }

    private static int generateRandomHeight() {
        return new Random().nextInt(70, 101);
    }

    public void attack() {
        System.out.println("Gurgle!");
    }
}
