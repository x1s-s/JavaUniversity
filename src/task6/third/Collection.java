package task6.third;

import task6.third.Author;
import task6.third.MenuException;
import task6.third.Collection;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

  public void outputToFile(Scanner scanner){
    try {
      FileWriter fileWriter = new FileWriter(scanner.nextLine(),false);
      String str = "";
      str += authors.size();
      fileWriter.write(str);
      Iterator<Author> iterator = authors.iterator();
      while (iterator.hasNext()){
        Author temp = iterator.next();
        fileWriter.write("\nFIO:" + temp.getFIO());
        fileWriter.write("\nbirthDate:" + temp.getBirthDate().getTime());
        fileWriter.write("\nCountry:" + temp.getCountry());
      }
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public void inputFromFile(Scanner scanner){
    try {
      FileReader fileReader = new FileReader(scanner.nextLine());
      Scanner fileScanner = new Scanner(fileReader);
      int collectionSize = Integer.parseInt(fileScanner.nextLine());
      for (int i = 0; i < collectionSize; i++) {
        authors.add(new Author(fileScanner.nextLine(),fileScanner.nextLine(),fileScanner.nextLine()));
      }
      fileScanner.close();
      fileReader.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void outputElements(){
    Iterator<Author> iterator = authors.iterator();
    while (iterator.hasNext()){
      Author temp = iterator.next();
      System.out.println(temp);
    }
  }

}
