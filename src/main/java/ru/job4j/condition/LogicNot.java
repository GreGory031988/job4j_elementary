package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean result1 = LogicNot.isEven(4);
        System.out.println("isEven -" + " " + result1);
        boolean result2 = LogicNot.isPositive(-5);
        System.out.println("isPositive -" + " " + result2);
        boolean result3 = LogicNot.notEven(3);
        System.out.println("notEven -" + " " + result3);
        boolean result4 = LogicNot.notPositive(-9);
        System.out.println("notPositive -" + " " + result4);
        boolean result5 = LogicNot.notEvenAndPositive(8);
        System.out.println("notEvenAndPositive -" + " " + result5);
        boolean result6 = LogicNot.evenOrNotPositive(2);
        System.out.println("evenOrNotPositive -" + " " + result6);
    }
}
