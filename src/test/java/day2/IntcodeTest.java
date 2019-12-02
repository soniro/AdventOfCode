package day2;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntcodeTest {

    @Test
    public void runProgram() {
        int[] program = {1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50};

        Intcode.startProgram(program);

        int[] expectedResult = {3500, 9, 10, 70, 2, 3, 11, 0, 99, 30, 40, 50};
        assertArrayEquals(expectedResult, program);
    }

    @Test
    public void runProgramOne() {
        int[] program = {1, 0, 0, 0, 99};

        Intcode.startProgram(program);

        int[] expectedResult = {2, 0, 0, 0, 99};
        assertArrayEquals(expectedResult, program);
    }

    @Test
    public void runProgramTwo() {
        int[] program = {2, 3, 0, 3, 99};

        Intcode.startProgram(program);

        int[] expectedResult = {2, 3, 0, 6, 99};
        assertArrayEquals(expectedResult, program);
    }

    @Test
    public void runProgramThree() {
        int[] program = {2, 4, 4, 5, 99, 0};

        Intcode.startProgram(program);

        int[] expectedResult = {2, 4, 4, 5, 99, 9801};
        assertArrayEquals(expectedResult, program);
    }

    @Test
    public void runProgramFour() {
        int[] program = {1, 1, 1, 4, 99, 5, 6, 0, 99};

        Intcode.startProgram(program);

        int[] expectedResult = {30, 1, 1, 4, 2, 5, 6, 0, 99};
        assertArrayEquals(expectedResult, program);
    }

}