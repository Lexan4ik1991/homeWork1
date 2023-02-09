package homeWork4;

import java.lang.constant.Constable;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
//. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task1 {

    public static void main(String[] args) {
        ArrayDeque<String> dequeArray = new ArrayDeque<>();
        while (true) {
            String msg = scanerText();
            if (msg.equalsIgnoreCase("print")) {
                for (String s : dequeArray) {
                    System.out.println(s);
                }

            }else if (msg.equalsIgnoreCase("revert")) {
                    dequeArray.removeFirst();
                System.out.println(dequeArray);

            }else if (msg.equalsIgnoreCase("exit")) {
                break;

            }else{
                    dequeArray.addFirst(msg);
                System.out.println(dequeArray);


                }
            }
        }

        private static String scanerText() {
        String msg = "";
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Введите текст");
        try {
            msg = lineScanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }
}
