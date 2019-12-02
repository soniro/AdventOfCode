package day1;

import java.util.ArrayList;
import java.util.List;

public class Spacecraft {

    List<Module> modules = new ArrayList<>();

    public void addModule(Module module) {
        this.modules.add(module);
    }

    public Long calculateFuel() {
        return modules.stream()
                .mapToLong(module -> module.calculateFuel())
                .sum();
    }

    public Long calculateFuelAccountingFuelMass() {
        return modules.stream()
                .mapToLong(module -> module.calculateFuelWithAccountingFuelMass())
                .sum();
    }
}
