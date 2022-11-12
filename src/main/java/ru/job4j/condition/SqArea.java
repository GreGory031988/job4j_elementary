package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        double result1 = SqArea.square(12, 2);
        System.out.println(" p = 12, k = 2, s = 8, real = " + result1);
        double result2 = SqArea.square(20, 1.5);
        System.out.println(" p = 20, k = 1.5, s = 24, real = " + result2);
        }
}
