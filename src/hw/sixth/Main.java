package hw.sixth;

import hw.sixth.models.ListComparator;
import hw.sixth.models.SpecialList;

import java.util.Arrays;

/***
 * Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
 * a. Рассчитывает среднее значение каждого списка.
 * b. Сравнивает эти средние значения и выводит соответствующее сообщение:
 * - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
 * - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
 * - ""Средние значения равны"", если средние значения списков равны.
 */

public class Main {
    public static void main(String[] args) {
        SpecialList list1 = new SpecialList(Arrays.asList(4, 7, 4, 2, 1));
        SpecialList list2 = new SpecialList(Arrays.asList(1, 7, 4, 2, 1));
        ListComparator comparator = new ListComparator();

        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(comparator.compareSpecialLists(list1, list2));
    }
}
