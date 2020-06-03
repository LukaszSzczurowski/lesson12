import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AnalysisNumbers {

    static void analisieOf(List<Integer> list) {
        Set<Integer> numbersToPrintf = new TreeSet<>(list);
        int counter = 0;
        for (Integer number : numbersToPrintf) {
            for (Integer numberOf : list) {
                if (number == numberOf)
                    counter++;
            }
            System.out.println(number + " - ilość wystąpień: " + counter);
            counter = 0;
        }
    }
}
