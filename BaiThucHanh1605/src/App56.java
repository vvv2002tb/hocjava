import java.util.HashSet;
import java.util.Scanner;
public class App56{
   public static void main(String[] args){
        String name;
        HashSet<String> hashSetString=new HashSet<>();
        Scanner sc=new Scanner(System. in);
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        System.out.println("Các phần tử trong hashSetstring: ");
        System.out.println(hashSetString);
        System.out.println("Nhập phần từ cần xóa: ");
        name=sc.nextLine();
        if (hashSetString.contains(name)){
           hashSetString.remove(name);
           System.out.println("Xóa thành công!");
           System.out.println("Các phần tử còn lại trong hashsetString: ");
           System.out.println(hashSetString);
        }else{
           System.out.println("Xóa không thành công!");
        }
    }
}