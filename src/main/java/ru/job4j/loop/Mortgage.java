package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double credit = amount + (amount * percent / 100);
        while (salary < credit) {
            credit = credit - salary;
            credit = credit + (credit * percent / 100);
            year++;
        }
        return year;
    }
}
