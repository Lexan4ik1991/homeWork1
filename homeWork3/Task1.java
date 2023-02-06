package homeWork3;

import java.util.*;

import static java.lang.System.*;

//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class Task1 {
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
        System.out.println(aList);
        for (Iterator<Integer> iterator = aList.iterator(); iterator.hasNext(); ) {
                Integer number = iterator.next();
                if (number % 2 == 0) {
                    System.out.println(number);
                    iterator.remove();
                }
            }

        }
    }

