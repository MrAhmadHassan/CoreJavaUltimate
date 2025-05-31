package org.example;

public class PrimitiveAndNonPrimitiveDataTypes {

    public static void main(String[] args) {
        System.out.println("Difference between primitive and non primitive datatypes");
        System.out.println("""
                                Primitive Data Types:
                                --------------------
                                These are the most basic data types.
                                They represent single values.
                                Typically, they are built into the language.
                                Stored in stack memory (in most languages).
                                Examples:
                                Integer types (int)
                                Floating-point types (float, double)
                                Character types (char)
                                Boolean (true / false)
                                Non-Primitive Data Types:
                                -------------------------
                                Also known as reference types.
                                These refer to objects or collections of values.
                                Created by the programmer or the language's standard library.
                                Stored in heap memory, referenced via pointers or references.
                                Examples:
                                Arrays
                                Strings
                                Classes
                                Interfaces
                                Lists, Maps, etc.
                                """);

        System.out.println("Default Values");
        System.out.println("""
                Primitive datatypes:
                --------------------
                byte	0
                short	0
                int	0
                long	0L
                float	0.0f
                double	0.0d
                char	'\\u0000' (null char)
                boolean	false
                """);
        System.out.println("All non primitive datatypes have null as default value");
        System.out.println(Math.pow(2,32));


    }
}
