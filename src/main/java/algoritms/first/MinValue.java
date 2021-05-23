package algoritms.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinValue {
    public static void main(String[] args) {
        int [] array = new int[] {99, 22, 11, 88, 77, 35, 69, 9, 121, 17};
        List<Integer> list = Arrays.asList(99, 22, 11, 88, 77, 35, 69, 9, 121, 17);

        int minValue = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                index = i;
            }
        }

        System.out.println("minValue: " + minValue);
        System.out.println("index: " + index);
    }
}
