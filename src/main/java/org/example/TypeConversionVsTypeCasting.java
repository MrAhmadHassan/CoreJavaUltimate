package org.example;

public class TypeConversionVsTypeCasting
{
    public static void main(String[] args) {
        System.out.println("Type Conversion - implicit conversion/widening conversion");
        System.out.println("""
                conversion from a smaller to a larger data type
                """);
        int x = 10;
        double y = x;  // int to double: implicit conversion
        System.out.println(y);  // Output: 10.0

        System.out.println("""
                Widening Order:
                byte → short → int → long → float → double
                               ↑
                           char
                
                """);


        System.out.println("Type Casting - explicit conversion/narrowing conversion");
        System.out.println("conversion from a larger to a smaller data type");
        double a = 10.5;
        int b = (int) a;  // Explicit cast: double to int
        System.out.println("Type Casting :"+b);  // Output: 10 (fractional part lost)

        System.out.println("🔍 Special Case: char and int");
        char c = 'A';
        int i = c;  // implicit: Unicode value of 'A' (65)
        System.out.println(i);  // Output: 65

        int z = 66;
        char ch = (char) z;  // explicit cast required
        System.out.println(ch);  // Output: B
    }
}
