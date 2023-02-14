package homeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static homeWork6.laptop.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию
public class Main {


    public static void main(String[] args) {

        laptop laptop1 = new laptop(1, "Acer", "Nitro 5 AN515-57-57DF", "black", 16, 512);
        laptop laptop2 = new laptop(2, "Asus", "TUF Gaming F15 FX506HCB-US51", "black", 8, 512);
        laptop laptop3 = new laptop(3, "HP", "15-dy2046ms", "gray", 8, 128);
        laptop laptop4 = new laptop(4, "HP", "Pavilion 15-eg029ur", "white", 16, 256);
        laptop laptop5 = new laptop(5, "Asus", "Vivobook 16X M1603QA-MB252", "gray", 16, 512);
        laptop laptop6 = new laptop(6, "HP", " ProBook 450 G8 silver ", "gray", 32, 512);
        List<laptop> laptopList = List.of(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6);


        System.out.println("Выберите функцию:");
        System.out.println("1 - Сортировка по ОЗУ");
        System.out.println("2 - Сортировка по SSD");
        System.out.println("3 - Сортировка по цвету");
        //System.out.println("4 - Режим разработчика");

        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        try {
                if (choice == 1) {
                    for (laptop lap1 : laptopList) {
                        System.out.printf("Введите значение ОЗУ: ");
                        Integer ram = sc.nextInt();
                        if (ram >= 32 && ram <= 64) {
                            System.out.printf(laptopList.get(5).toString());
                        } else if (ram >= 16 && ram < 32) {
                            System.out.printf(laptopList.get(0).toString() + "%n" + laptopList.get(1).toString() + "%n" + laptopList.get(2).toString() + "%n" + laptopList.get(3).toString() + "%n" + laptopList.get(4).toString());
                        } else if (ram < 16 && ram == 8) {
                            System.out.printf(laptopList.get(1).toString());
                        } else System.out.println("Таких ноутбуков нет!");
                        break;
                    }

                } else if (choice == 2) {
                    for (laptop lap2 : laptopList) {
                        System.out.printf("Введите значение SSD: ");
                        Integer ssd = sc.nextInt();
                        if (ssd >= 512 && ssd <= 1024) {
                            System.out.printf(laptopList.get(0).toString() + "\n" + laptopList.get(1).toString() + "\n" + laptopList.get(4).toString() + "\n" + laptopList.get(5).toString() + "\n");
                        } else if (ssd < 512) {
                            System.out.printf(laptopList.get(2).toString() + "\n" + laptopList.get(3).toString());
                        } else if (ssd < 256) {
                            System.out.printf(laptopList.get(3).toString());
                        } else if (ssd < 128) {
                            System.out.printf(laptopList.get(2).toString());
                        } else System.out.println("Таких ноутбуков нет!");
                        break;
                    }

                } else if (choice == 3) {
                    for (laptop lap3 : laptopList) {
                        System.out.println("Введите цвет");
                        Scanner colorScaner = new Scanner(System.in);
                        String color = colorScaner.nextLine();
                        if (color.equals("black")) {
                            System.out.printf((laptopList.get(0).toString() + "\n" + laptopList.get(1).toString()));
                        } else if (color.equals("gray")) {
                            System.out.printf(laptopList.get(4).toString() + "\n" + laptopList.get(5).toString());
                        } else if (color.equals("white")) {
                            System.out.printf(laptopList.get(3).toString());
                        } else System.out.println("Таких ноутбуков нет!");
                        break;

                    }
//                }else if (choice == 4) {
//                    System.out.println("Вы в режиме разработчика,введите номер пункта");
//
//                    System.out.println("Введите id");
//                    Integer idChoice = sc.nextInt();
//                    laptop.setId(idChoice);
//
//                    System.out.println("Введите производителя");
//                    String manChoice = sc.next();
//                    laptop.setManufacturer(manChoice);
//
//                    System.out.println("Введите модель");
//                    String modelChoice = sc.next();
//                    laptop.setModel(modelChoice);
//
//                    System.out.println("Введите цвет");
//                    String colorChoice = sc.next();
//                    laptop.setColor(colorChoice);
//
//                    System.out.println("Введите значение RAM");
//                    Integer ramChoice = sc.nextInt();
//                    laptop.setRAM(ramChoice);
//
//                    System.out.println("Введите значение SSD");
//                    Integer ssdChoice = sc.nextInt();
//                    laptop.setSSD(ssdChoice);
//                    System.out.println(laptop.toString());
//                    laptopList.add(laptop);
//
                }
            } catch (Exception e) {
                System.out.println("Ошибка! ");
                e.printStackTrace();
            }
            sc.close();
    }
}






