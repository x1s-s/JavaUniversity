package task9.synchronizedCollection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Collection<T> {
    private T element;
    private Collection<T> nextElement;

    public Collection(T element) {
        this.element = element;
        this.nextElement = null;
    }

    public Collection() {
        this(null);
    }

    public Collection(T element, Collection<T> nextElement) {
        this.element = element;
        this.nextElement = nextElement;
    }
}
