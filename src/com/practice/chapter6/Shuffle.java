package com.practice.chapter6;

public class Shuffle {
    static boolean isNumber(String words) {
        for (int i = 0; i < words.length(); i++) {
            if (!Character.isDigit(words.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "은 숫자 입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "은 숫자 입니까? " + isNumber(str));
    }
}
