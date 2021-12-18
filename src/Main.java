import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean d = false;
        System.out.println("Operatory arytmetyczne:" +
                "\na = false\tb = true\tc = true\t d = false");

        System.out.println("(a && b) : " + (a && b));
        System.out.println("(a && c) : " + (a && c));
        System.out.println("(a || b) : " + (a || b));
        System.out.println("(a || c) : " + (a || c));
        System.out.println("(true || b) : " + (true || b));
        System.out.println("!a : " + !a);
        System.out.println("!d : " + !d);
        System.out.println("!(c && b) : " + !(c && b));
        System.out.println("!((a && c) || (!a || b) : " + !((a && c) || (!a || b)));
        System.out.println();

        int x = 5;
        int y = 7;
        int z = 5;
        int q = 4;

        System.out.printf("Operatory porównania:" +
                "\nx = %d\ty = %d\tz = %d\t q =%d\n", x, y, z,q);

        System.out.println("(x == z) : " + (x == z));
        System.out.println("(q == z) : " + (q == z));
        System.out.println("(x != y) : " + (x != y));
        System.out.println("(x != z) : " + (x != z));
        System.out.println("(x > y) : " + (x > y));
        System.out.println("(x < y) : " + (x < y));
        System.out.println("(z >= x) : " + (z >= x));
        System.out.println("((x > q) || (a && b)) : " + ((x > q) || (a && c)));




    }
}
