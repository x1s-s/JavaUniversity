package task3.progressed;

import java.util.Locale;

public enum Genre {
  FANTASY,
  SCIENCE_FICTION,
  DYSTOPIAN,
  MYSTERY,
  HORROR;

  @Override
  public String toString() {
    return "Genre{" + this.name().toLowerCase(Locale.ROOT) + "}";
  }
}
