package task6.first;

import java.util.Scanner;

public class CollectionController {
  private Collection collection;

  public CollectionController(Collection collection) {
    this.collection = collection;
  }

  public void addElement(Scanner scanner){
    Man[] mens = collection.getMens();
    Man[] tempArray = mens.clone();
    mens = new Man[mens.length + 1];
    mens[mens.length - 1] = ManFactory.getFromFactory(scanner);
    System.arraycopy(tempArray,0, mens,0,tempArray.length);
    collection.setMens(mens);
    //authors[authors.length - 1].fill();
  }

  public void editElement(Scanner scanner){
    System.out.print("Enter element index : ");
    Man[] mens = collection.getMens();
    mens[scanner.nextInt()].fill(scanner);
    collection.setMens(mens);
  }

  public void deleteElement(Scanner scanner){
    System.out.print("Enter element index : ");
    int deleteIndex = scanner.nextInt();
    Man[] mens = collection.getMens();
    Man[] tempArray = new Man[mens.length - 1];
    System.arraycopy(mens,0,tempArray,0,deleteIndex);
    System.arraycopy(mens,deleteIndex + 1,tempArray,deleteIndex,tempArray.length - deleteIndex);
    mens = new Man[tempArray.length];
    System.arraycopy(tempArray,0, mens,0, mens.length);
    collection.setMens(mens);
  }

  public void updateViews(){
    CollectionView.OutputCollection(collection.getMens());
  }
}
