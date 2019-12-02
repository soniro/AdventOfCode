package day2;

public class Intcode {

    public static  void startProgram(int[] program) { // 1,0,0,3,99
        runOperation(program, 0);
    }

    private static void runOperation(int[] program, int index) {
        Opcode opcode = Opcode.of(program[index]);
        switch (opcode) {
            case ONE:
            case TWO:
                int indexX = program[index+1];
                int indexY = program[index+2];
                int targetIndex = program[index+3];
                program[targetIndex] = opcode.processIntegers(program[indexX], program[indexY]);
                break;
            case NINTY_NINE:
                // programm is finished & should immediately halt
                return;
            default:
                throw new RuntimeException("Something went wrong");
        }
        runOperation(program, index + 4);
    }
}
