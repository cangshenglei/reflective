package TheSixteenth.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //使用多态创建Map集合对象
        LinkedHashMap<Object, Object> objectObjectLinkedHashMap = new LinkedHashMap<>();
        Map<String,String> map = new LinkedHashMap<>();

        objectObjectLinkedHashMap.put("郭靖","华筝");
        //添加数据
        map.put("郭靖","华筝");
        map.put("杨过","小龙女");
        map.put("张无忌","敏敏特木尔");
        System.out.println(map);

        map.remove("杨过");
        System.out.println(map);

        //判断Map集合中是否含有指定的键或者指定值
        System.out.println(map.containsKey("郭靖"));
        System.out.println(map.containsKey("韦小宝"));

        System.out.println(map.containsValue("黄蓉"));
        System.out.println(map.containsValue("韦小宝"));

        //根据指定的键获取对应的值
        System.out.println(map.get("郭靖"));
        System.out.println(map.get("韦小宝"));

        //获取所有键的集合
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        Collection<String> values = map.values();
        System.out.println(values);

       /* Set<Map.Entry<K,V>> entrySet()
                *              返回此映射中包含的映射关系的 Set 视图。*/
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);


    }
}
