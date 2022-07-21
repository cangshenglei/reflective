package TheSixteenth.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Map集合通用的遍历方式1:键找值
public class MapDemo02 {
    public static void main(String[] args) {
        //使用多态创建Map集合对象
        Map<Object, Object> map = new LinkedHashMap<>();

        //添加元素
        map.put("","");
        map.put("探险家","伊泽瑞尔");
        map.put("黑暗之女","安妮");
        map.put("蛮族之王","泰达米尔");
        map.put("寒冰射手","艾希");

        //获取所有键的集合
        Set<Object> objects = map.keySet();
        for (Object object : objects) {
            Object o = map.get(object);
            System.out.println(o);
        }

    }
}
