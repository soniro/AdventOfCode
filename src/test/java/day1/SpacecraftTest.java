package day1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpacecraftTest {

    @Test
    public void shouldCalculateFuelCorrectly() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.addModule(Module.moduleWithMass(12));
        spacecraft.addModule(Module.moduleWithMass(14));
        spacecraft.addModule(Module.moduleWithMass(9));
        assertEquals(Long.valueOf(5), spacecraft.calculateFuel());
    }

}