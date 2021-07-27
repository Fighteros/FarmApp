package app;

public class Horse extends Animal {
    private String hairColor = "red";
    private int speed = 320;
    private Boolean isRacingHorse = false;


    public Horse(Farm farm) {
        super(farm);
    }

    public Horse(String name, Farm farm) {
        super(name, farm, 5, 4.0, 4.0);
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
        return "Horse{" +
                "hairColor='" + hairColor + '\'' +
                ", speed=" + speed +
                ", isRacingHorse=" + isRacingHorse +
                '}';
    }
}
