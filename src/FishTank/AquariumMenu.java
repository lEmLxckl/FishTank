package FishTank;
import java.util.Scanner;
public class AquariumMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aquarium aquarium = new Aquarium();

        while (true) {
            System.out.println("\nVelkommen til Diana's akvarium!");
            System.out.println("1. Tilføj fisk");
            System.out.println("2. Udfør vandskift");
            System.out.println("3. Liste over fisk");
            System.out.println("4. Liste over vandskift");
            System.out.println("5. Afslut programmet");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Ryd bufferen

            switch (choice) {
                case 1:
                    System.out.print("Indtast navnet på fisken: ");
                    String fishName = scanner.nextLine();
                    Fish fish = new Fish(fishName);
                    aquarium.addFish(fish);
                    System.out.println(fishName + " er tilføjet til akvariet.");
                    break;
                case 2:
                    System.out.print("Noter om vandskift: ");
                    String notes = scanner.nextLine();
                    System.out.println("Vælg kvaliteten (1. Perfekt, 2. God, 3. Okay, 4. Dårlig): ");
                    int qualityChoice = scanner.nextInt();
                    WaterQuality quality = WaterQuality.values()[qualityChoice - 1];
                    aquarium.performWaterChange(notes, quality);
                    System.out.println("Vandskift udført.");
                    break;
                case 3:
                    aquarium.listFish();
                    break;
                case 4:
                    aquarium.listWaterChanges();
                    break;
                case 5:
                    System.out.println("Farvel!");
                    System.exit(0);
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }
        }
    }
}
