package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else if (symbol != input.charAt(i) && counter == 1) {
                result.append(symbol);
                symbol = input.charAt(i);
            } else {
                result.append(symbol).append(counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        if (counter == 1) {
            result.append(symbol);
        } else {
            result.append(symbol).append(counter);
        }
        return result.toString();
    }
}
