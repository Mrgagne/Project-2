import java.util.Random;

public class Ogre extends Enemy {
    public Ogre() {
        super(generateRandomWeight(), generateRandomHeight());
    }

    private static int generateRandomWeight() {
        return new Random().nextInt(120, 200);
    }

    private static int generateRandomHeight() {
        return new Random().nextInt(200, 301);
    }

    public void attack() {
        System.out.println("Ugh!");
    }

}
