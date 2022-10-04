package task9.synchronizedCollection;

public class CollectionView<T> {
    public void OutputCollection(Collection<T> firstElement) {
        System.out.println("-----------------------------------------");
        while (firstElement != null && firstElement.getElement() != null) {
            System.out.println(firstElement.getElement());
            firstElement = firstElement.getNextElement();
        }
        System.out.println("-----------------------------------------");
    }
}
