package task8.parralel;

import lombok.AllArgsConstructor;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import static task2.ArrayTask.Runner.createRandomArray;
import static task2.ArrayTask.Runner.numberOfTrue;
@AllArgsConstructor
public class MyRunnable implements Runnable {
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private String fileName;

    @Override
    public void run() {
        try{
            writeToFile(fileName);
            readFormFile(fileName);
            Arrays.sort(array1);
            Arrays.sort(array2);
            Arrays.sort(array3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFormFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        Scanner fileScanner = new Scanner(fileReader);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = fileScanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            array2[i] = fileScanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = fileScanner.nextInt();
        }
        fileReader.close();
    }
    public void writeToFile(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write("");
        for(var temp: array1){
            fileWriter.write(temp + " ");
        }
        fileWriter.write("\n");
        for(var temp: array2){
            fileWriter.write(temp + " ");
        }
        fileWriter.write("\n");
        for(var temp: array3){
            fileWriter.write(temp + " ");
        }
        fileWriter.close();
    }
}
