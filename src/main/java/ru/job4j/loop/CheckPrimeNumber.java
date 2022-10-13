package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        for (int index = 1; index <= number; index++) {
            index++;
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
