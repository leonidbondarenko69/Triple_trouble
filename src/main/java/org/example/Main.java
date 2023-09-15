package org.example;

public class Main {
    public static void main(String[] args) {

        String one = "AbC";
        String two = "aBc";
        String three = "AbC";
        System.out.println(tripleTrouble(one, two, three));
    }

    public static String tripleTrouble(String one, String two, String three) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            sb.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }

        return sb.toString();
    }
}
