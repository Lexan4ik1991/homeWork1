package homeWork3;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
    public static void main(String[] args) {


        fillArray();

    }
    public static void fillArray() {

        Random rnd = new Random();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = rnd.nextInt(-10, 10);
            aList.add(num);
        }
        System.out.println("Unsorted ArrayList " + aList);

            IntSummaryStatistics intSummaryStatistics
                    = new IntSummaryStatistics();
            Iterator<Integer> iterator = aList.listIterator();
            while (iterator.hasNext()) {
                intSummaryStatistics.accept(iterator.next());
            }
            System.out.println("The maximum of values is "
                    + intSummaryStatistics.getMax());
            System.out.println("The minimum of values is "
                    + intSummaryStatistics.getMin());
            System.out.println("The average of values is "
                    + intSummaryStatistics.getAverage());
        }
    }










