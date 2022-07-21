package TheSixteenth.set.demo6;

import java.util.TreeSet;

public class SetDemo06 {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        //set.add(null);
       /*空指针异常
        Exception in thread "main" java.lang.NullPointerException
        at java.util.TreeMap.compare(TreeMap.java:1294)
        at java.util.TreeMap.put(TreeMap.java:538)
        at java.util.TreeSet.add(TreeSet.java:255)
        at TheSixteenth.set.demo6.SetDemo06.main(SetDemo06.java:8)
*/

        System.out.println(set);
    }
}
