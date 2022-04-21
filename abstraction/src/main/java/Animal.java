

abstract public class Animal {

    private String food;
    private boolean hunger;

    abstract public void makeNoise();
    abstract public void eat();
    abstract public void roam();
    public void sleep() {
        System.out.println("Sleeping");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }
}
