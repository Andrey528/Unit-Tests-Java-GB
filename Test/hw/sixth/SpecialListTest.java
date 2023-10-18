package hw.sixth;

import hw.sixth.models.SpecialList;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class SpecialListTest {
    private SpecialList list;

    @BeforeEach
    void initList() {
        list = new SpecialList(Arrays.asList(4, 2, 5, 7, 6, 6));
    }

    @Test
    void calculateAverageTest() {
        assertThat(list.getAverage()).isEqualTo(5.0);
    }

    @Test
    void toStringTest() {
        assertThat(list.toString()).isEqualTo("SpecialList{list=[4, 2, 5, 7, 6, 6], average=5.0}");
    }
}
