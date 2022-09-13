package task6.third;

import task6.third.Author;
import task6.third.MenuException;
import task6.third.Collection;

public class MenuException extends Exception{
  private int number;
  public int getNumber(){
    return  number;
  }
  public MenuException(String message, int number){
    super(message);
    this.number = number;
  }
}
