package app;

public class Rabbit extends Animal {
    private boolean isMale = true;
    private boolean hasBeenHunted = false;
    private boolean hasBunnies = false;

    public Rabbit() {
    }

    public Rabbit(String name) {
        super(name, 1, 1, 0.5);
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isHasBeenHunted() {
        return hasBeenHunted;
    }

    public void setHasBeenHunted(boolean hasBeenHunted) {
        this.hasBeenHunted = hasBeenHunted;
    }

    public boolean isHasBunnies() {
        return hasBunnies;
    }

    public void setHasBunnies(boolean hasBunnies) {
        this.hasBunnies = hasBunnies;
    }

    @Override
    public String toString() {
        return "rabbit{" +
                "isMale=" + isMale +
                ", hasBeenHunted=" + hasBeenHunted +
                ", hasBunnies=" + hasBunnies +
                '}';
    }
}
