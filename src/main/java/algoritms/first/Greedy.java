package algoritms.first;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Жадный алгоритм — алгоритм, заключающийся в принятии локально
 * оптимальных решений на каждом этапе, допуская,
 * что конечное решение также окажется оптимальным
 *
 * TODO Задача 1 - неупорядоченный список от 0 - 9
 * составить наибольшее число
 *
 * TODO Задача 2 - вы едете на автомобиле, авто может проехать на одной заправке 400 км.
 * расстояние 950 км. нужно проехать все расстояние с минимальным количеством заправок
 */
public class Greedy {

    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));

//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < digits.length; i++) {
//                if (digits[i] < digits[i - 1]) {
//                    int temp = digits[i];
//                    digits[i] = digits[-1];
//                    digits[-1] = temp;
//                    isSorted = false;
//                }
//            }
//        }
    }

    // Задача 1
    public static String maxNumberFromDigits(int[] digits) {
        // {3, 1, 7, 9, 9, 5} -> {1, 3, 5, 7, 9, 9}
        // O(n*log(n))
        // O(n)
        // O(n * log(n))\

//        Arrays.sort(digits);
//        String result = "";
//        for (int i = digits.length - 1; i >= 0; i--) {
//            result += digits[i];
//        }
//        return result;

        return String.join("", Arrays.stream(digits)
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }

}
