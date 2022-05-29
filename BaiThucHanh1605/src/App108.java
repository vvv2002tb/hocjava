import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App108 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9.d);
        treeMap.put(4, 10.1d);
        treeMap.put(2, 7.2d);
        treeMap.put(8, 20.28d);
        System.out.println("Cac pham tu co trong treeMap: ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
        treeMap.replace(4, 20.11d);

        treeMap.replace(2, 7.d, 7.7d);

        System.out.println("Cac phan tu co trong TreeMap khi thay the : ");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }
    
}