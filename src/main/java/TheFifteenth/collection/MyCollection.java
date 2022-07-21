package TheFifteenth.collection;

import java.util.Collection;

public interface MyCollection<E>{
    void add(E e);

    <A> void method(Collection<A> a);

    void show(Collection<?> coll);
}
