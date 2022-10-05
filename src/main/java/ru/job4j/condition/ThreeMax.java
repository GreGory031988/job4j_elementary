package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (third > first && second < third) {
            result = third;
        }
        if (first == second && second > third) {
            result = first;
        }
        if (first < second && second == third) {
            result = second;
        }
        if (first == second && second == third) {
            result = first;
        }
        return result;
    }

    public static void main(String[] args) {
        int ret = ThreeMax.max(11, 24, 15);
        System.out.println(ret);
    }
}