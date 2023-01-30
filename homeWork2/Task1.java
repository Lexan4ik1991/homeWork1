package homeWork2;

import java.util.Scanner;
import java.util.*;
//. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
//public class Task1 {
//    public static void main(String[] args) {
//
//            Scanner iScanner = new Scanner(System.in);
//            System.out.print("Введите палиндром: ");
//            try {
//                String palString = iScanner.next();
//                boolean palindrome = true;
//                for (int i = 0; i < (palString.length() / 2); i++) {
//                    if (palString.charAt(i) != palString.charAt(palString.length() - i - 1)) {
//                        palindrome = false;
//                        break;
//                    }
//                }
//                System.out.println(palindrome ? "palindrome" : "not palindrome");
//            } catch (Exception e) {
//                System.out.println("Ошибка! ");
//                e.printStackTrace();
//
//
//            }
//        }
//    }



public class Task1 {
    public static boolean isPalindrome(String palMessage) {
        palMessage = palMessage.replaceAll("\\W", "");
        StringBuilder strBuilder = new StringBuilder(palMessage);
        strBuilder.reverse();
        String revPalMessage = strBuilder.toString();

        return palMessage.equalsIgnoreCase(revPalMessage);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Аргентина манит негра"));
    }
}