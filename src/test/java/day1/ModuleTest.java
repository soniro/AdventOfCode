package day1;

import org.junit.Test;

import static day1.Module.moduleWithMass;
import static org.junit.Assert.assertEquals;

public class ModuleTest {

    @Test
    public void shouldCalculateItsFuel() {
        assertEquals(Long.valueOf(2), moduleWithMass(12).calculateFuel());
        assertEquals(Long.valueOf(2), moduleWithMass(14).calculateFuel());
        assertEquals(Long.valueOf(654), moduleWithMass(1969).calculateFuel());
        assertEquals(Long.valueOf(33583), moduleWithMass(100756).calculateFuel());
        assertEquals(Long.valueOf(0), moduleWithMass(3).calculateFuel());
    }

    @Test
    public void shouldCalculateFuelAccountingFuelMass() {
        assertEquals(Long.valueOf(966), moduleWithMass(1969).calculateFuelWithAccountingFuelMass());
        assertEquals(Long.valueOf(50346), moduleWithMass(100756).calculateFuelWithAccountingFuelMass());
    }

}