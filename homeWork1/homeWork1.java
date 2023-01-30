package homeWork1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class homeWork1 {
    public static void main(String[] args) {


        //homeWork3();
        //homeWork1();
        homeWork2();
    }

    public static boolean homeWork2() {
        int year = -1;

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        do {
            try {
                year = iScanner.nextInt();
            } catch (Exception e) {
                System.out.printf("Ошибка!Введите число! %s!%n ");
//            e.printStackTrace();

            }
            iScanner.close();
        }while(year<=0);

        boolean yearChoice = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (yearChoice) {
            System.out.printf("Високосный год!");

        } else {
            System.out.printf("Невисокосный год!");
        }

        return yearChoice;
    }


    private static void homeWork1() {
        int[] myArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        int min = myArray[0];
        int max = myArray[myArray.length - 1];
        System.out.printf("Минимальное число массива, %s!%n", min);
        System.out.printf("Максимальное число массива, %s!%n", max);
    }
}


//    private static void homeWork3() {
//        int number = 3;
//        int[] myArray = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = random.nextInt(5);
//
//        }
//        System.out.println(Arrays.toString(myArray));
//        for (int i = 0; i < myArray.length; i++) {
//
//            for (int j = i + 1; j < myArray.length; j++) {
//                if (myArray[i] == number && myArray[j] != number) {
//
//                    int temp = myArray[i];
//                    myArray[i] = myArray[j];
//                    myArray[j] = temp;
//
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(Array));
//    }


