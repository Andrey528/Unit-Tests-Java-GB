package seminars.fifth.number;

import java.util.Collections;
import java.util.List;

public class MaxNumberModule {
    /***
     * Второй модуль находит максимальное число в этом списке
     */
    public int takeMaxNumber(List<Integer> asList) {
        return Collections.max(asList);
    }
}