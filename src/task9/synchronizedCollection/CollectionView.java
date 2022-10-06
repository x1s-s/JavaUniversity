package task9.synchronizedCollection;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CollectionView<T> {
    public void OutputCollection(Collection<T> collection) {
        AtomicInteger number = new AtomicInteger();
        Stream.of(collection.getArray()).filter(Objects::nonNull).forEach(x -> System.out.println("element[" + number.getAndIncrement() + "] = " + x));
    }
}
