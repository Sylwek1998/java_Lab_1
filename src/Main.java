public class Main {

    public static void main(String[] args) {
        /*zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        int zmiennaInt = 12;
        System.out.println("zmienna int = " + zmiennaInt);

        int a = 1, b = 2, c = 3, d = 4;
        int wynik = b + d;
        System.out.println(wynik);

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        int A =37, B = 3;
        double X = 3.2, Y = 1.5;
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

        System.out.println(X + Y);
        System.out.println(X - Y);
        System.out.println(X * Y);
        System.out.println(X / Y);
        System.out.println(X % Y);


    }
}
