package task6.first;

import java.util.Date;
import java.util.Scanner;

public class Collection {
  private Author[] authors;

  public Collection(){
    authors = new Author[0];
  }

  public void addElement(){
    Author[] tempArray = authors.clone();
    authors = new Author[authors.length + 1];
    authors[authors.length - 1] = new Author("",new Date(0),"");
    System.arraycopy(tempArray,0,authors,0,tempArray.length);
    //authors[authors.length - 1].fill();
  }

  public void editElement(Scanner scanner){
    System.out.print("Enter element index : ");
    authors[scanner.nextInt()].fill(scanner);
  }

  public void deleteElement(Scanner scanner){
    System.out.print("Enter element index : ");
    int deleteIndex = scanner.nextInt();
    Author[] tempArray = new Author[authors.length - 1];
    System.arraycopy(authors,0,tempArray,0,deleteIndex);
    System.arraycopy(authors,deleteIndex + 1,tempArray,deleteIndex,tempArray.length - deleteIndex);
    authors = new Author[tempArray.length];
    System.arraycopy(tempArray,0,authors,0,authors.length);
  }

  public void outputElements(){
    for (int i = 0; i < authors.length; i++) {
      System.out.println(i + ". " + authors[i]);
    }
  }

}
