package FishTank;
import java.time.LocalDateTime;
public class WaterChange {
    private LocalDateTime date;
    private String notes;
    private WaterQuality quality;

    public WaterChange(String notes, WaterQuality quality) {
        this.date = LocalDateTime.now();
        this.notes = notes;
        this.quality = quality;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

    public WaterQuality getQuality() {
        return quality;
    }
}
