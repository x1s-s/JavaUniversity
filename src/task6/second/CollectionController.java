package task6.second;

import java.util.Scanner;

public class CollectionController<T> {
  protected Collection<T> firstElement;
  private final CollectionView<T> collectionView;

  public CollectionController(Collection<T> collection,CollectionView<T> collectionView){
    this.firstElement = collection;
    this.collectionView = collectionView;
  }

  public void addElement(T element) {
    if(firstElement == null || firstElement.getElement() == null) {
      firstElement = new Collection<T>(element);
    } else{
      findLast().setNextElement(new Collection<T>(element));
    }
  }

  public void editElement(T element,Scanner scanner) {
    int index;
    do{
      System.out.print("Enter element index : ");
      index = scanner.nextInt();
    } while (index < 0);
    try{
      findByIndex(index).setElement(element);
    } catch (Exception exception){
      System.out.println(exception.getMessage());
    }
  }

  public void deleteElement(Scanner scanner) {
    int index;
    do{
      System.out.print("Enter element index : ");
      index = scanner.nextInt();
    } while (index < 0);
    try{
      if(index == 0){
        if(firstElement.getNextElement() == null){
          firstElement = null;
        } else {
          firstElement.setElement(firstElement.getNextElement().getElement());
          firstElement.setNextElement(firstElement.getNextElement().getNextElement());
        }
      } else {
        Collection<T> temp = findByIndex(index - 1);
        if(findByIndex(index) == findLast()){
          temp.setNextElement(null);
        } else {
          temp.setNextElement(temp.getNextElement().getNextElement());
        }

      }
    } catch (Exception exception){
      System.out.println(exception.getMessage());
    }
  }

  protected Collection<T> findLast(){
    Collection<T> temp = firstElement;
    while(temp != null && temp.getNextElement() != null){
      temp = temp.getNextElement();
    }
    return temp;
  }

  protected Collection<T> findByIndex(int n){
    Collection<T> temp = firstElement;
    int i = 0;
    while(temp != null && i != n){
      temp = temp.getNextElement();
      i++;
    }
    if(i != n){
      throw new IndexOutOfBoundsException("Index error out of bounds");
    }
    return temp;
  }

  protected int length(){
    int length = 0;
    Collection<T> temp = firstElement;
    while(temp != null){
      temp = temp.getNextElement();
      length++;
    }
    return length;
  }

  public void updateViews() {
    collectionView.OutputCollection(firstElement);
  }
}
