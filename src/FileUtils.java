import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileUtils {
    static Map<String, Country> readData(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        Map<String, Country> countryMap = new HashMap<>();

        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(";");
            String key = split[0];
            String countryName = split[1];
            String numberOfPeople = split[2];
            countryMap.put(key, new Country(key, countryName, numberOfPeople));
        }
        return countryMap;
    }
}
