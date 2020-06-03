import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class CountriesTest {
    public static void main(String[] args) {
        String fileName = "data.csv";
        try {
            Map<String, Country> country = FileUtils.readData(fileName);
            printStatistics(country);
        } catch (FileNotFoundException e) {
            System.out.println("Błąd odczytu z pliku " + fileName);
        }
    }

    private static void printStatistics(Map<String,Country> country) {
        Scanner sc = new Scanner(System.in);
        printCodesCountries(country);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String inputUser = sc.nextLine();
        System.out.println(country.get(inputUser));
    }

    private static void printCodesCountries(Map<String,Country> country) {
        System.out.println(country.keySet());
    }
}
