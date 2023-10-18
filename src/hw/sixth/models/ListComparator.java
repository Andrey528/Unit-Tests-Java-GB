package hw.sixth.models;

public class ListComparator {
    public String compareSpecialLists(SpecialList list1, SpecialList list2) {
        if (list1.getAverage() > list2.getAverage())
            return "Среднее значение 1го листа больше 2го";
        else if (list1.getAverage() < list2.getAverage())
            return "Среднее значение 2го листа больше 1го";
        else return "Средние значения равны";
    }
}
