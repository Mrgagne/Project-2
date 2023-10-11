import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        loopEnemies(createEnemyList());
    }

    private static void loopEnemies(ArrayList<Enemy> enemies) {
        for (Enemy each : enemies) {
            each.attack();
        }
    }

    private static int generateRandomEnemy() {
        return new Random().nextInt(1, 5);
    }

    private static Enemy createEnemy(int enemyId) {
        if (enemyId == 1) {
            return new Goblin();
        } else if (enemyId == 2) {
            return new Ghost();
        } else if (enemyId == 3) {
            return new Ogre();
        } else {
            return new Dragon();
        }
    }

    private static ArrayList<Enemy> createEnemyList() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            enemies.add(createEnemy(generateRandomEnemy()));
        }

        return enemies;
    }
}
