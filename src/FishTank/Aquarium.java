package FishTank;
import java.util.ArrayList;
import java.util.List;
public class Aquarium {
    private List<Fish> fishList;
    private List<WaterChange> waterChanges;

    public Aquarium() {
        this.fishList = new ArrayList<>();
        this.waterChanges = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        fishList.add(fish);
    }

    public void performWaterChange(String notes, WaterQuality quality) {
        WaterChange waterChange = new WaterChange(notes, quality);
        waterChanges.add(waterChange);
    }

    public void listFish() {
        for (Fish fish : fishList) {
            System.out.println(fish);
        }
    }

    public void listWaterChanges() {
        for (WaterChange change : waterChanges) {
            System.out.println("Dato: " + change.getDate() + ", Noter: " + change.getNotes() + ", Kvalitet: " + change.getQuality());
        }
    }
}
