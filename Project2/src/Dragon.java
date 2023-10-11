import java.util.Random;

public class Dragon extends Enemy{
    public Dragon() {
        super(generateRandomWeight(), generateRandomHeight());
    }

    private static int generateRandomWeight() {
        return new Random().nextInt(500, 1501);
    }

    private static int generateRandomHeight() {
        return new Random().nextInt(750, 2001);
    }

    public void attack() {
        System.out.println("Rawr!");
    }
}
