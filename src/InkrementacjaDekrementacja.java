public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
    int a = 0;
    System.out.println("Wartość a: " + a);//0
    int b = a++;
        System.out.println("Wartość b: " + b); //0
        System.out.println("Wartość a: " + a); //
    int c = ++a;
    System.out.println("Wartość c: " + c);
    System.out.println("Wartość a:" + a);


        int d = 0;
        System.out.println("Wartość a: " + d);//0
        int e = a--;
        System.out.println("Wartość b: " + e); //0
        System.out.println("Wartość a: " + d); // -1
        int f = --a;
        System.out.println("Wartość c: " + f); //-2
        System.out.println("Wartość a:" + d); // -2




    }

}
