public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && wtedy kiedy wyrazenia składowe są rowne true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue);


        //   || jedno wyrazenie składowe jest true
        System.out.println(firstValue || secondValue); // false
        System.out.println(firstValue || fourthValue);
        System.out.println(firstValue || thirdValue); // false


        // ! negacja  zwraca wartość przeciwną do tej przed którą się znajduje
        System.out.println(!firstValue);
        System.out.println(!thirdValue);
        System.out.println(!(firstValue&&secondValue)); //true
    }

}
