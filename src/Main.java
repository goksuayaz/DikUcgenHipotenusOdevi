import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, b, c;

        System.out.print("A'nın uzunluğunu yazınız : ");
        a = inp.nextInt();

        System.out.print("B'nin uzunluğunu yazınız : ");
        b = inp.nextInt();

        System.out.print("C'nin uzunluğunu yazınız : ");
        c= inp.nextInt();

        int uC = (a + b + c);
        // uC ucgenin cevresi o da 2u ve u formulune gore ıslem yaptıgımızda bu formulu alırız.

        double alanKaresi = uC * (uC - a) * (uC - b) * (uC - c);
        System.out.println("Üçgenin Alanı : " + alanKaresi);

    }
}