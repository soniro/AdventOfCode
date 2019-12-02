package day2;

import day1.Day1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Day2 {

    private static final String INPUT_FILE = "day2/input";

    public static void main(String[] args) {
        File file = new File(Day1.class.getClassLoader().getResource(INPUT_FILE).getFile());
        try (Scanner scanner = new Scanner(file)) {
            String programString = scanner.nextLine();
            int[] program = Arrays.stream(programString.split(","))
                    .mapToInt(s -> Integer.valueOf(s))
                    .toArray();

            System.out.println(runProgram(program, 12, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int runProgram(int[] program, int noun, int verb) {
        int[] programCopy = Arrays.copyOf(program, program.length);
        programCopy[1] = noun;
        programCopy[2] = verb;

        Intcode.startProgram(programCopy);

        return programCopy[0];
    }

/*
    What value is left at position 0 after the program halts?

     */
}
