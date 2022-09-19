package task6.second;

public class CollectionView<T> {
  public void OutputCollection(Collection<T> firstElement) {
    while (firstElement != null && firstElement.getElement() != null){
      System.out.println(firstElement.getElement());
      firstElement = firstElement.getNextElement();
    }
  }
}
