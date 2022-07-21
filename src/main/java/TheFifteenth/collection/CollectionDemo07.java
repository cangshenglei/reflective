package TheFifteenth.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;

public class CollectionDemo07 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        ((ArrayList) collection).add(22);
        ((ArrayList) collection).add(134);

        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
