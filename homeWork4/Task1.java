package homeWork4;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        while(true){
            String msg = scanerText();
            if (msg.equalsIgnoreCase("print")){
                for (int i=alist.size()-1; i>=0;i--){
                    System.out.println(alist.get(i));
                }

            }if (msg.equalsIgnoreCase("revert")){
                alist.remove(alist.size()-2);

            }if (msg.equalsIgnoreCase("exit")){
                break;

            }else {
                alist.add(msg);
                System.out.println(alist);

            }
        }



    }
    private static String scanerText(){
        String msg="";
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Введите текст");
        try{
            msg = lineScanner.nextLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        return msg;
    }
}
