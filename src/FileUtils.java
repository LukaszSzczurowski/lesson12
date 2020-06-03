import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    static List<Integer> read(String fileName) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(new File("numbers.txt"));
        while (scanner.hasNextLine()) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}
