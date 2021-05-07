public class ZadanieDomowePetle {

    public static void main(String[] args) {
   /*     for (int i =0; i < 100; i++) {
            System.out.println(i);
        }*/

   /*     for (int i=3; i<100; i++) {
            if(i%3==0) {
                System.out.println("Jestem podzielna przez 3 " + i);

            }
        }*/

        int[] number = new int[]{8,6,7,5,3};

        for(int i =0;i<number.length/2;i++){
            int temp = number[i];
            number[i]=number[number.length-1-i];
            number[number.length-1-i]=temp;
        }

        for(int i =0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }



    }
}
