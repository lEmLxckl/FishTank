package FishTank;
public class Fish {
    private String name;
    private boolean isHealthy;

    public Fish(String name) {
        this.name = name;
        this.isHealthy = true;
    }

    public String getName() {
        return name;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    @Override
    public String toString() {
        return name + (isHealthy ? " er sund og glad" : " ser ikke sund ud");
    }
}

