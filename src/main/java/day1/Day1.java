package day1;

import java.io.File;
import java.util.Scanner;

import static day1.Module.moduleWithMass;

public class Day1 {

    private static final String INPUT_FILE = "day1/input";

    public static void main(String[] args) {
        try {
            Spacecraft spacecraft = createSpacecraftFromFile();
            System.out.println(spacecraft.calculateFuel());
            System.out.println(spacecraft.calculateFuelAccountingFuelMass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Spacecraft createSpacecraftFromFile() throws Exception {
        File file = new File(Day1.class.getClassLoader().getResource(INPUT_FILE).getFile());
        try (Scanner scanner = new Scanner(file)) {
            Spacecraft spacecraft = new Spacecraft();
            while (scanner.hasNextLong()) {
                spacecraft.addModule(moduleWithMass(scanner.nextLong()));
            }
            return spacecraft;
        }
    }
}
