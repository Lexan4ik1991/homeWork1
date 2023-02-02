package homeWork3;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
    public static void main(String[] args) {


        fillArray();
<<<<<<< HEAD

=======
>>>>>>> origin/main
    }

    public static void fillArray() {

        List<Integer> aList = new ArrayList<>();
        int[] myArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);

        }
<<<<<<< HEAD
        System.out.println(Arrays.toString(myArray));


        for (int i = 0; i < myArray.length; i++) {
            aList.add(i, (int) (Math.random() * 10 + 1));
        }
        System.out.println("Unsorted ArrayList " + aList);
=======
            System.out.println(Arrays.toString(myArray));

            for (int i = 0; i < myArray.length; i++) {
                aList.add(i, (int) (Math.random() * 10 + 1));


            }
            System.out.println("Unsorted ArrayList "+aList);
>>>>>>> origin/main
        Collections.sort(aList);
        System.out.println("Sorted ArrayList " + aList);
        int max = aList.get(aList.size() - 1);
        int min = aList.get(0);
        System.out.println(min);
        System.out.println(max);
<<<<<<< HEAD
        double sum = 0;
        double result = 0;
        for (int i = 0; i < aList.size(); i++) {
            sum += aList.get(i);
            result = sum / aList.size();

        }
        System.out.println(result);
    }
}








=======
        private static double getAverage(); {
            long sum = 0;
            for (int i: aList) {
                sum += i;
            }
            return aList.size() > 0 ? (double) sum / aList.size() : 0;
        double avg = getAverage(aList);
        System.out.println(avg);



    }


}
>>>>>>> origin/main










