package homeWork3;

import java.util.*;

//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class Task1 {
    public static void main(String[] args) {
        fillArray();
    }
        public static void fillArray() {
            List<Integer> aList = new ArrayList<>();
            int[] myArray = new int[10];
            Random random = new Random();
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(10);

            }
            System.out.println(Arrays.toString(myArray));

            for (int i = 0; i < myArray.length; i++) {
                aList.add(i, (int) (Math.random() * 10 + 1));


            }
            System.out.println(aList);

        for (Iterator<Integer> iterator = aList.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println(number);
                iterator.remove();
            }
        }

        }
}
