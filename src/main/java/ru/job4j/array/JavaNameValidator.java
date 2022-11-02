package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        boolean valid = !name.isEmpty() && !Character.isUpperCase(name.charAt(0)) && !Character.isDigit(array[0]);
        if (valid) {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code) && isUpperLatinLetter(code) && isLowerLatinLetter(code) && Character.isDigit(i)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code < 65 || code > 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code < 97 || code > 122);
    }
}