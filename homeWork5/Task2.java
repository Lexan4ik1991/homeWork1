package homeWork5;

import java.util.*;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task2 {
    public static void main(String[] args) {
            Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
            //Map<String, ArrayList<Integer>> phoneBook = new TreeMap<>();
            String people1 = "Pavlov";
            Integer number1 = 1234567;
            String people2 = "Pavlov";
            Integer number2 = 345678;
            String people3 = "Petrov";
            Integer number3 = 9876543;
            String people4 = "Ivanov";
            Integer number4 = 964328;
            inputNumber(people1, number1, phoneBook);
            inputNumber(people2, number2, phoneBook);
            inputNumber(people3, number3, phoneBook);
            inputNumber(people4, number4, phoneBook);
            outputphBook(phoneBook);
        }
    public static void inputNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> alist = new ArrayList<>();
            alist.add(value);
            map.put(key, alist);
        }
    }
    public static void outputphBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    }