import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Przykłady wprowadzania tekstu z klawiatury */
        /* Ta komenda inicjuje strumień wejsciomy danych */
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imie: ");

        String imie = scan.next();
        System.out.print("Podaj nazwikso: ");

        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");

        int wiek = scan.nextInt();
        System.out.print("Podaj nr indeksu: ");

        int indeks = scan.nextInt();


        System.out.printf("Twoje imie:  " + imie + "\n");
        System.out.println("Twoje nazwisko: " + nazwisko);
        System.out.printf("Twoj wiek:  " + wiek  + "\n");
        System.out.println("Twoj nr indeksu: " + indeks);


        int a = 17;
        int b = 4;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);



    }
}
