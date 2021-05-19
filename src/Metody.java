public class Metody {

    public void policzWynik(){
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i<100; i ++){
            result = result + i;
        }
        System.out.println("Rezulatat to: " +result);
    }

    public void policzWynikParm(int number){
        System.out.println("Number ma wartosc: " + number);
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i<number; i ++){
            result = result + i;
        }
        System.out.println("Rezulatat to: " +result);
    }

    public int add(int firstNumber, int secondNumber) {
        System.out.println("Suma to " + (firstNumber +secondNumber));

        return firstNumber+secondNumber;

    }
}

