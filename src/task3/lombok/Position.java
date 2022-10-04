package task3.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@ToString
public enum Position{
  DIRECTOR(100),
  CHIEF_LIBERIAN(75),
  LIBERIAN(50);

  private final int salary;

}
