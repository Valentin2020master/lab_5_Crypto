package com.company;

public class Criptare {

    public static void main(String[] args) {
        int key = 10;

        String text = "Salut Valentin";

        System.out.println(text);

        char[] chars = text.toCharArray();

        for (char c : chars) {
            c += key;

            System.out.print(c);
        }
    }
}
