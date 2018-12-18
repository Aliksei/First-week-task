package com.it.academy.task1;

public class PhoneNumber {

    public static String process(byte... arr) {
        if (arr.length > 10) {
            return "Ooops";
        } else {
            StringBuilder result = new StringBuilder();
            String s = arrAsString(arr);
            result.append("(")
                    .append(s, 0, 3)
                    .append(") ")
                    .append(s, 3, 6)
                    .append("-")
                    .append(s, 6, 10);
            return result.toString();
        }
    }

    private static String arrAsString(byte[] arr) {
        StringBuilder result = new StringBuilder();
        for (byte b : arr) {
            result.append(b);
        }
        return result.toString();
    }
}
