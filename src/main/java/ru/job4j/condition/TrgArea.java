package ru.job4j.condition;

    public class TrgArea {
        public static double area(double a, double b, double c) {
            double p = a + b + c;
            double one = p - a;
            double two = p - b;
            double three = p - c;
            double four = p * one * two * three;
            double s = Math.sqrt(four);
            return s;
        }

        public static void main(String[] args) {
            double s = TrgArea.area(2, 2, 2);
            System.out.println("area (2, 2, 2) = " + s);
        }
}
