public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number = 17;

        if(number ==0) {
            System.out.println("Number jest równy zero");
        }else if (number > 10) {
            System.out.println("Liczba wieksza od 10");
        }else if (number > 0) {
            System.out.println("Liczba dodatnia");

        }else if (number < -5) {
            System.out.println("Liczba jest mniejsza od -5");
        }else {
            System.out.println("Zaden warunek nie zostal spelniony");
        }

    }
}
