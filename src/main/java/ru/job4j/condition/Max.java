package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return  first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = fourth;
        if (first >= second && first >= third && first >= fourth) {
            result = first;
        }
        if (second >= first && second >= third && second >= fourth) {
            result = second;
        }
        if (third >= first && third >= second && third >= fourth) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int msg = Max.max(18, 21);
        System.out.println(msg);
    }
}