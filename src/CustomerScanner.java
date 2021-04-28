import java.util.Scanner;

public class CustomerScanner {

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie ");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe ");
        int firstName = scanner.nextInt();
        int result = firstName * firstName;
        System.out.println("Kwadrat tej liczby to " + result + "!");


    }
}