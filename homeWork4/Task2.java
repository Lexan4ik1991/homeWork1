package homeWork4;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {


        LinkedList<Integer> linkList = new LinkedList<>();
        int[] listArray = {1,2,3,4,5,6,7,8,9};
        ;

        for (Integer result : listArray) {
            linkList.add(result);
        }

        int result = 0;
        while(result != linkList.size() - 1) {
            linkList.add(linkList.size()-result, linkList.getFirst());
            linkList.removeFirst();
            result++;
        }


        System.out.println("linkList = " + linkList);


    }
}