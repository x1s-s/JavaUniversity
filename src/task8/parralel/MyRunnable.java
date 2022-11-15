package task8.parralel;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyRunnable implements Runnable {
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private String fileName;

    public MyRunnable(int[] array1, int[] array2, int[] array3, String fileName) {
        this.array1 = array1;
        this.array2 = array2;
        this.array3 = array3;
        this.fileName = fileName;
    }

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
