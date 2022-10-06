package task11.part2;

import task3.progressed.Author;
import task3.progressed.Book;
import task3.progressed.PublishingHouse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException {
        Object[] objects = new Object[]{
                new Book(),
                new Author(),
                new PublishingHouse()
        };
        Stream.of(myMethod(Object.class.getMethod("toString"),objects,null)).forEach(System.out::println);
        Stream.of(getMethods(Object.class,"void")).forEach(System.out::println);
    }

    public static Object[] myMethod(Method method, Object[] objects, Object[] parameters){
        if(parameters != null){
           return Stream.of(objects).map(x -> {
                try {
                    return method.invoke(x, parameters);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                return null;
            }).toArray();
        } else {
            return Stream.of(objects).map(x -> {
                try {
                    return method.invoke(x);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                return null;
            }).toArray();
        }
    }

    public static Method[] getMethods(Class clazz, String methodReturn){
        return Stream.of(clazz.getDeclaredMethods()).filter(x -> x.getReturnType().getName().equals(methodReturn)).toArray(Method[]::new);
    }
}
