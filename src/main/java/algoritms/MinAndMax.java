package algoritms;

public class MinAndMax {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        int min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.printf("min value: %s", min);
        System.out.println();
        System.out.printf("min index: %s", minIndex);
    }
}
