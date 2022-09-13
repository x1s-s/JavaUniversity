package task6.second;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Collection {
  private ArrayList<Author> authors;

  public Collection(){
    authors = new ArrayList<>();
  }

  public void addElement(){
    authors.add(new Author("",new Date(0),""));
    //authors.get(authors.size() - 1).fill();
  }

  public void editElement(Scanner scanner){
    System.out.print("Enter element index : ");
    authors.get(scanner.nextInt()).fill(scanner);
  }

  public void deleteElement(Scanner scanner){
    System.out.print("Enter element index : ");
    authors.remove(scanner.nextInt());
  }

  public void outputElements(){
    Iterator<Author> iterator = authors.iterator();
    while (iterator.hasNext()){
      Author temp = iterator.next();
      System.out.println(temp);
    }
  }

}
