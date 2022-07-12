
import java.util.*;

public class ZadanieString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String string = "";

        System.out.print("Podaj ilość wyrazów, które wpiszesz: ");
        n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            String string1 = scanner.nextLine();
            if (string1.length() > string.length())
                string = string1;
        }

        System.out.println("Najdłuższy wyraz: \"" + string + "\" ma " + string.length() + " liter");
        System.out.print("Podaj literę: ");
        char _char = scanner.next().charAt(0);

        int count = 0;
        for (char c: string.toCharArray())
            if (c == _char)
                count++;

        System.out.println("Liczba wystąpień szukanej litery:" + count);
    }

}