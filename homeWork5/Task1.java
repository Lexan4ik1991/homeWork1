package homeWork5;

import java.util.*;


//Пусть дан список сотрудников:Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина....
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности
//

public class Task1 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String people = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] resultArray = people.split(" ");
        System.out.printf(Arrays.toString(resultArray));
        for (int i = 0; i < resultArray.length; i += 2) {
            if (map.containsKey(resultArray[i])) {
                map.replace(resultArray[i], map.get(resultArray[i]) + 1);
            } else {
                map.put(resultArray[i], 1);
            }
        }
        System.out.println(map);
        TreeMap<String, Integer> tMap = new TreeMap<>();
        //Решил попробовать TheeMap,но потом только узнал что он сортируется только по ключам,нагуглил компаратор ValueSort(), поэтому код получился большим.
        int max = 1;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                if (map.get(key) == i) {
                    tMap.put(key, map.get(key));
                }
            }
        }
        System.out.println(tMap);


        Map sortedMap = valueSort(map);

        Set set = sortedMap.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry mp = (Map.Entry)i.next();
            System.out.print(mp.getKey() + ": ");
            System.out.println(mp.getValue());
        }
    }


    public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
    {
        Comparator<K> valueComparator = new Comparator<K>() {
            public int compare(K k1, K k2)
            {
                int comp = map.get(k2).compareTo(
                        map.get(k1));
                if (comp == 0)
                    return 1;
                else
                    return comp;
            }

        };
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }
}












