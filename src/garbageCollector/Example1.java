package garbageCollector;

import org.openjdk.jol.info.GraphLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        Integer integer = 10;
        Long longVar = 10L;
        int[] intArray = new int[1000];
        Integer[] integerArray = new Integer[1000];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        String string = "Hello world!";
        /*
        for(int x = 0; x < 1000;x++){
            intArray[x] = x;
            integerArray[x] = x;
            arrayList.add(x);
            linkedList.add(x);
            hashSet.add(x);
            hashMap.put(x, x);
        }
        */

        IntStream.range(0, 1000).forEach(x -> {
            intArray[x] = x;
            integerArray[x] = x;
            arrayList.add(x);
            linkedList.add(x);
            hashSet.add(x);
            hashMap.put(x, x);
        });

        System.out.println("Integer : " + integer);
        System.out.println(GraphLayout.parseInstance(integer).toPrintable());

        System.out.println("Long : " + longVar);
        System.out.println(GraphLayout.parseInstance(longVar).toPrintable());

        System.out.println("int[1000]");
        System.out.println(GraphLayout.parseInstance((Object) intArray).toFootprint());

        System.out.println("Integer[1000]");
        System.out.println(GraphLayout.parseInstance((Object) integerArray).toFootprint());

        System.out.println("ArrayList<Integer>");
        System.out.println(GraphLayout.parseInstance(arrayList).toFootprint());

        System.out.println("LinkedList<Integer>");
        System.out.println(GraphLayout.parseInstance(linkedList).toFootprint());

        System.out.println("HashSet<Integer>");
        System.out.println(GraphLayout.parseInstance(hashSet).toFootprint());

        System.out.println("HashMap<Integer, Integer>");
        System.out.println(GraphLayout.parseInstance(hashMap).toFootprint());

        System.out.println("String : " + string);
        System.out.println(GraphLayout.parseInstance(string).toPrintable());

    }
}
