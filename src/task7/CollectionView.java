package task7;


import javax.swing.JLabel;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CollectionView<T> {
    public void OutputCollection(Collection<T> collection, JLabel label) {
        label.setText("<html>");
        AtomicInteger number = new AtomicInteger();
        Stream.of(collection.getArray()).filter(Objects::nonNull).forEach(x -> label.setText(label.getText() + "element[" + number.getAndIncrement() + "] = " + x + "<br>"));
        label.setText(label.getText() + "</html>");
    }
}
