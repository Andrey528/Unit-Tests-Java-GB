package hw.sixth;

import hw.sixth.models.ListComparator;
import hw.sixth.models.SpecialList;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ListComparatorTest {
    private SpecialList list1;
    private SpecialList list2;
    private ListComparator comparator = new ListComparator();

    @Test
    void compareList1LargerList2Test() {
        list1 = new SpecialList(Arrays.asList(4, 7, 4, 2, 1));
        list2 = new SpecialList(Arrays.asList(1, 7, 4, 2, 1));

        assertThat(comparator.compareSpecialLists(list1, list2)).isEqualTo("Среднее значение 1го листа больше 2го");
    }

    @Test
    void compareList2LargerList1Test() {
        list1 = new SpecialList(Arrays.asList(1, 7, 4, 2, 1));
        list2 = new SpecialList(Arrays.asList(4, 7, 4, 2, 1));

        assertThat(comparator.compareSpecialLists(list1, list2)).isEqualTo("Среднее значение 2го листа больше 1го");
    }

    @Test
    void compareList1EqualsList2Test() {
        list1 = new SpecialList(Arrays.asList(1, 7, 4, 2, 1));
        list2 = new SpecialList(Arrays.asList(1, 7, 4, 2, 1));

        assertThat(comparator.compareSpecialLists(list1, list2)).isEqualTo("Средние значения равны");
    }
}
