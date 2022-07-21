package TheSeventeenth.map;

import java.util.HashMap;

public class MapDemo02 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Object, Object> map = new HashMap<>();

        //存储元素
        for (int i=1;i<=12;i++){
            map.put("键" + i,"值" + i);
        }
        map.put("键13","值13");
        System.out.println(map);
        System.out.println("键1".hashCode());
    }
}
