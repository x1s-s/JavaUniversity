package task6.second;

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
