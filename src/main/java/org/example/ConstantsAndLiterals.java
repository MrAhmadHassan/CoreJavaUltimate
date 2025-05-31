package org.example;

public class ConstantsAndLiterals {

    public static void main(String[] args) {
        System.out.println("Literals in Java \n" +
                "A literal is a fixed value that is assigned to variable\n" +
                "\uD83D\uDCCC Example: in file");
        int age = 25;            // 25 is an integer literal
        float pi = 3.14f;        // 3.14f is a float literal
        char grade = 'A';        // 'A' is a char literal
        String name = "John";    // "John" is a string literal
        boolean isValid = true;  // true is a boolean literal

        System.out.println("Constants in java are those variables whose values cannot be changed.");
        final int MAX_USERS = 100;
//        MAX_USERS = 200;  // ❌ Error: cannot assign a value to final variable
}
}
