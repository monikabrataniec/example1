public class ZadanieDomoweStudent {

    public static void main(String[] args) {

        Student pierwszy = new Student();
        pierwszy.imie = "Sławek";
        pierwszy.nazwisko = "Mazera";
        pierwszy.nick = "slawekM";
        pierwszy.email = "slawek@gmail.com";
        pierwszy.numerIndeksu = 32321;

        Student drugi = new Student();
        drugi.imie = "Sebastian";
        drugi.nazwisko ="Nowak";
        drugi.nick = "sebanowak";
        drugi.email = "seba@nowak.com";
        drugi.numerIndeksu = 434213;

        Student trzeci = new Student();
        trzeci.imie = "Marian";
        trzeci.nazwisko = "Barylka";
        trzeci.nick = "marianolitaliano";
        trzeci.email = "marianbaryla@gma";
        trzeci.numerIndeksu = 23123;


      Student[] studenci = new Student[3];
      studenci[0] = pierwszy;
      studenci[1] = drugi;
      studenci[2] = trzeci;



     for (int i = 0; i < studenci.length; i++) {
         studenci[i].przedstawSie();
         studenci[i].podajEmail();
         studenci[i].PodajNumerIndeksy();
         studenci[i].zalogujSie();
     }


    }
}
