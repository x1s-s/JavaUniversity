package task6.second;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CollectionView<T> {
    public void OutputCollection(Collection<T> collection) {
        AtomicInteger number = new AtomicInteger();
        Stream.of(collection.getArray()).forEach(x -> System.out.println("element[" + number.getAndIncrement() + "] = " + x));
    }
}
