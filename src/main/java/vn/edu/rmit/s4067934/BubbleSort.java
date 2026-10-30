package vn.edu.rmit.s4067934;

/**
 * Sorts arrays of integers using the bubble sort algorithm.
 */
public final class BubbleSort {
    private BubbleSort() {
        // Utility class; do not instantiate.
    }

    /**
     * Returns a sorted copy of the supplied array.
     *
     * @param values the integers to sort
     * @return a new array sorted in ascending order
     * @throws IllegalArgumentException if values is null
     */
    public static Integer[] sort(Integer[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Values must not be null");
        }

        Integer[] sorted = values.clone();

        for (int i = 0; i < sorted.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    Integer temporary = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temporary;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return sorted;
    }
}
