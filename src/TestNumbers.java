
import java.io.FileNotFoundException;
import java.util.List;


public class TestNumbers {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = FileUtils.read("numbers.txt");
            AnalysisNumbers.analisieOf(numbers);
//            System.out.println(numbers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
