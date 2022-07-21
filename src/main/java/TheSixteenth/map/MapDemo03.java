package TheSixteenth.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {

        //使用多态创建Map集合对象
        Map<Object, Object> map = new LinkedHashMap<>();

        //添加元素
        map.put("探险家","伊泽瑞尔");
        map.put("黑暗之女","安妮");
        map.put("蛮族之王","泰达米尔");
        map.put("寒冰射手","艾希");

        //获取集合中键值对对象的集合
        Set<Map.Entry<Object, Object>> entries = map.entrySet();

        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + "=" + value);
        }


    }
}
