import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDataFromUser {

    static List<Integer> inputNumbers() {
        List<Integer> numbersUserList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczby dodatnie. Wpisanie liczby ujemnej zakończy program.");
        int inputNumber = 0;
        while ((inputNumber = sc.nextInt()) >= 0) {
            numbersUserList.add(inputNumber);
        }
        return numbersUserList;
    }
}
