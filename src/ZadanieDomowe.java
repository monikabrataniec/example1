import java.util.Scanner;

public class ZadanieDomowe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe ");
        System.out.println("Podaj druga liczbe ");
        int firstName = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = firstName + secondNumber;
        System.out.println("Dodane liczby dają wynik " + result + "!");
        int result2 = firstName - secondNumber;
        System.out.println("Odjęte liczby dają wynik " + result2 + "!");
        int result3 = firstName * secondNumber;
        System.out.println("Pomnożone liczby dają wynik " + result3 + "!");
        int result4 = firstName / secondNumber;
        System.out.println("Podzielone liczby dają wynik " + result4 + "!");

    }
}
