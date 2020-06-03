import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbersTest {
    public static void main(String[] args) {
        List<Integer> positiveNumbersFromUser = ReadDataFromUser.inputNumbers();
        Calculate.calculations(positiveNumbersFromUser);
    }
}
