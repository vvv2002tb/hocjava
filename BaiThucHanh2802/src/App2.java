import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Canh a: ");
        a = sc.nextInt();
        System.out.println("Canh b: ");
        b = sc.nextInt();
        System.out.println("Canh c: ");
        c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                System.out.println("Tam giac deu");

            } else if (a == b || a == c || c == b) {

                if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (a * a == b * b + c * c)) {
                    System.out.println("Tam giac vuong can");

                } else {
                    System.out.println("Tam giac can");
                }
            } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (a * a == b * b + c * c)) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Ba canh tren khong lap thanh tam giac");
        }
    }
}