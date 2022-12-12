package org.example;

public class Main {
    public static void main(String[] args) {
        String textUnion = "Произвольный текст";

        if (textUnion == null || textUnion.length() <= 1) {
            System.out.println("текст разделить нельзя");
        } else {
            String text1 = textUnion.substring(0, textUnion.length() / 2);
            String text2 = textUnion.substring( textUnion.length() / 2);
            System.out.println(textUnion);
            System.out.println(text1);
            System.out.println(text2);
        }
    }
}