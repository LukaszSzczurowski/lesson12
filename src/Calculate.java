import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculate {

    public static void calculations(List<Integer> numbers) {
        reverseOrder(numbers);
        sumNumbers(numbers);
        minAndMaxNumber(numbers);
    }

    private static void minAndMaxNumber(List<Integer> numbers) {
        System.out.println("Największa podana liczba wynosi: " + Collections.max(numbers));
        System.out.println("Najmniejsza podana liczba wynosi: " + Collections.min(numbers));
    }

    private static void sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Suma wszystkich liczb wynosi: " + sum);
    }

    private static void reverseOrder(List<Integer> numbers) {
        Collections.reverse(numbers);
        System.out.println("Odwrócona lista: " + numbers);
    }

}
