package day1;

public class Module {

    private long mass;

    public Module(long mass) {
        this.mass = mass;
    }

    public static Module moduleWithMass(long mass) {
        return new Module(mass);
    }

    public Long calculateFuel() {
        return calculateFuelFor(mass);
    }

    private Long calculateFuelFor(Long mass) {
        Long fuel = mass / 3 - 2;
        return Math.max(0, fuel);
    }

    public Long calculateFuelWithAccountingFuelMass() {
        Long fuel = calculateFuel();
        Long lastFuelForFuel = fuel;
        while (lastFuelForFuel > 0) {
            lastFuelForFuel = calculateFuelFor(lastFuelForFuel);
            fuel += lastFuelForFuel;
        }
        return fuel;
    }

}
