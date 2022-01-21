import java.util.Scanner;

public class DortVeBesinKatlari {
    public static void main(String[] args) {
        int b;

        Scanner data = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        b = data.nextInt();

        System.out.println("\n4'ün katları :");
        for (int a = 1; a < b; a *= 4) {
            System.out.print(a + ",");
        }
        System.out.println("\n\n5'in katları :");
        for (int c = 1; c < b; c *= 5) {
            System.out.print(c + ",");
        }
    }
}
