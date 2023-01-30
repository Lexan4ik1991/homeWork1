package homeWork2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String word = "TEST";
        String result = word.repeat(100);
        System.out.println(result);
        fileWrite(result);
    }

    public static void fileWrite(String result){
        try (FileWriter writer = new FileWriter("TEST1.txt")) {
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
