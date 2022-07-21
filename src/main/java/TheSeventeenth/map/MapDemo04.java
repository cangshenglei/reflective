package TheSeventeenth.map;

import java.util.TreeMap;

public class MapDemo04 {
    public static void main(String[] args) {
        TreeMap<Object, Object> map = new TreeMap<>();

        map.put("键1","值1");
        map.put("键2",null);
   //     map.put(null,"值2");
        System.out.println(map);
    }
}
