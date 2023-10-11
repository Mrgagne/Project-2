import java.util.Random;

public class Ghost extends Enemy{
    public Ghost() {
        super(0, generateRandomHeight());
    }

    private static int generateRandomHeight() {
        return new Random().nextInt(90, 150);
    }

    public void attack() {
        System.out.println("Boo!");
    }
}
