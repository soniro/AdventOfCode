package day2;

import java.util.Arrays;

public enum Opcode {

    ONE(1, (a, b) -> a + b),
    TWO(2, (a, b) -> a * b),
    NINTY_NINE(99);

    private int value = 0;
    private ProcessIntegers processIntegers;

    Opcode(int value) {
        this.value = value;
    }

    Opcode(int value, ProcessIntegers processIntegers) {
        this.value = value;
        this.processIntegers = processIntegers;
    }

    public static Opcode of(int value) {
        return Arrays.stream(Opcode.values())
                .filter(opcode -> opcode.value == value)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public int processIntegers(int a, int b) {
        return processIntegers.processIntegers(a, b);
    }


}
