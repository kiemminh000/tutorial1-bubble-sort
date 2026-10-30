package vn.edu.rmit.s4067934;

import java.util.Arrays;

/**
 * Runs the bubble sort algorithm with the arrays from Tutorial 1.
 */
public final class App {
    private App() {
        // Application entry-point class; do not instantiate.
    }

    public static void main(String[] args) {
        Integer[][] examples = {
            {70, 61, 72, 83, 38},
            {7, 2, 76, 4, 99},
            {28, 9, 13, 78, 19},
            {68, 84, 41, 62, 18},
            {37, 57, 40, 13, 50}
        };

        for (Integer[] example : examples) {
            Integer[] sorted = BubbleSort.sort(example);
            System.out.printf(
                "%s -> %s%n",
                Arrays.toString(example),
                Arrays.toString(sorted)
            );
        }
    }
}
