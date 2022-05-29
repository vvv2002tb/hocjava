import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> Hashint = new HashSet<>();
        try (Scanner input = new Scanner(System.in)) {
            Hashint.add(1);
            Hashint.add(2);
            Hashint.add(3);
            Hashint.add(4);
            Hashint.add(5);
            Hashint.add(6);
            Hashint.add(7);
            Hashint.add(8);

            System.out.println("Các phần tử trong Hashint: ");
            System.out.println(Hashint);
            System.out.println("Nhập các phần tử cần thêm: ");
            number = input.nextInt();
        }

        if (!Hashint.contains(number)) {
            Hashint.add(number);
            System.out.println("Thêm thành công");
            System.out.println("Các phần tử trong Hashint: ");
            System.out.println(Hashint);
        } else {
            System.out.println("Phần tử đã tồn tại");
        }
    }
}