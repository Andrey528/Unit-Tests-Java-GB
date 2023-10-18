package hw.sixth.models;

import java.util.List;
import java.util.OptionalDouble;

public class SpecialList {
    private List<Integer> list;
    private double average;

    public SpecialList(List<Integer> list) {
        this.list = list;
        this.average = calculateAverage();
    }

    private double calculateAverage() {
        OptionalDouble average = list.stream().mapToInt(a -> a).average();

        return average.isPresent() ? average.getAsDouble() : 0;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "SpecialList{" +
                "list=" + list +
                ", average=" + average +
                '}';
    }
}