package task7;

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

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Collection<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Collection<T> nextElement) {
        this.nextElement = nextElement;
    }
}
