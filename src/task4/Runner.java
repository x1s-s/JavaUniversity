package task4;

/*
Вариант 18

Задачи А:
7: Дана строка. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'
13: Дан текст. Заменить все цифры соответствующими словами
20: Найти, каких букв, гласных или согласных, больше в каждом предложении текста.

Задача B:
1: В сообщении, состоящем из одних русских букв и пробелов, каждую букву заменили ее порядковым номером
в русском алфавите (А — 1, Б — 2, ..., Я — 33), а пробел — '*'. Требуется по заданной последовательности цифр
найти зашифрованной сообщение

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
  public static void main(String[] args) {
    StringBuilder str1 = new StringBuilder("abc");
    StringBuilder str2 = new StringBuilder("sabc");
    StringBuilder str3 = new StringBuilder("Hello world");
    System.out.println(task7(str1));
    System.out.println(task7(str2));
    System.out.println(task7(str3));
    StringBuilder str4 = new StringBuilder("I have 5 apple's and 2 apricot's");
    System.out.println(task13(str4));
    String str5 = "уенааа."
        + "рпррпрпр."
        + "ооооооооооооооооннннннннннннннннннннннннннн."
        + "Преобразовать текст так, чтобы каждое предложение начиналось с заглавной буквы."
        + "Вывести предложения текста в порядке возрастания количества слов в каждом из них.";
    System.out.println(Arrays.toString(task20(str5)));
    System.out.println(taskB1("1 2 3 * 4 * 5"));
  }

  public static String task7(StringBuilder str) {
    if(str.indexOf("abc") == 0){
      str.replace(0,3,"www");
    } else {
      str.append("zzz");
    }
    return str.toString();
  }

  public static String task13(StringBuilder str){
    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)){
        case '0' -> str.replace(i,i + 1,"zero");
        case '1' -> str.replace(i,i + 1,"one");
        case '2' -> str.replace(i,i + 1,"two");
        case '3' -> str.replace(i,i + 1,"three");
        case '4' -> str.replace(i,i + 1,"four");
        case '5' -> str.replace(i,i + 1,"five");
        case '6' -> str.replace(i,i + 1,"six");
        case '7' -> str.replace(i,i + 1,"seven");
        case '8' -> str.replace(i,i + 1,"eight");
        case '9' -> str.replace(i,i + 1,"nine");
      }
    }
    return str.toString();
  }


  // true - больше согласных, false - больше гласных в предложение n
  public static boolean[] task20(String str){
    String[] strArray = split(str,'.');
    boolean[] booleans = new boolean[strArray.length];
    String vowels = "УЕЫАЭЯИЮОоуеыаэяию";
    String consonants = "ЦКНГШЩЗХФВПРЛДЖЧСМТБцкнгшщзхфвпрлджчсмтб";
    for (int i = 0; i < strArray.length; i++) {
      int numberOfVowels = 0;
      int numberOfConsonants = 0;
      for (int j = 0; j < strArray[i].length(); j++) {
        if(vowels.indexOf(strArray[i].charAt(j)) != -1){
          numberOfVowels++;
        }
        if(consonants.indexOf(strArray[i].charAt(j)) != -1){
          numberOfConsonants++;
        }
      }
      booleans[i] = numberOfVowels < numberOfConsonants;
    }
    return booleans;
  }

  public static String taskB1(String str){
    String[] strArray = split(str,' ');
    StringBuilder newStr = new StringBuilder();
    for (var temp: strArray){
      if(temp.charAt(0) == '*'){
        newStr.append(' ');
      } else {
        newStr.append((char)('а' - 1 + Integer.parseInt(temp)));
      }
    }
    return newStr.toString();
  }

  public static String[] split(String str,char splitChar){
    ArrayList<String> stringArrayList = new ArrayList<>();
    int position = str.indexOf(splitChar);
    if(position == -1){
      return new String[]{str};
    }
    int previousPosition = 0;
    while (position != -1){
      if(previousPosition == 0){
        stringArrayList.add(str.substring(previousPosition,position));
      } else {
        stringArrayList.add(str.substring(previousPosition + 1,position));
      }
      previousPosition = position;
      position = str.indexOf(splitChar,position + 1);
    }
    String[] strArray = new String[stringArrayList.size()];
    stringArrayList.toArray(strArray);
    return strArray;
  }
}
