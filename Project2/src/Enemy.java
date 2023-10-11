public abstract class Enemy {
    private int weight;
    private int height;

    public Enemy(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void attack();
}
