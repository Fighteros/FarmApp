package app;

public class Horse extends Animal {
    private String hairColor = "red";
    private int speed = 320;
    private Boolean isRacingHorse = false;


    public Horse() {
    }

    public Horse(String name) {
        super(name, 5, 4, 4);
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean getRacingHorse() {
        return isRacingHorse;
    }

    public void setRacingHorse(Boolean racingHorse) {
        isRacingHorse = racingHorse;
    }

    @Override
    public String toString() {
        return
                "hairColor='" + hairColor + '\'' +
                        ", speed=" + speed +
                        ", isRacingHorse=" + isRacingHorse;
    }

}
