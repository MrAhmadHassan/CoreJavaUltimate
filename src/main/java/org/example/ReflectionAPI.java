package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class ReflectionAPI {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        /*
        Mastering Reflection API in Java
        The Reflection API is a powerful feature in Java that allows you to inspect and manipulate classes,
        interfaces, fields, methods, and constructors at runtime.

        Key Classes in Reflection API
            Class: Represents classes and interfaces
            Field: Represents fields (member variables)
            Method: Represents methods
            Constructor: Represents constructors
            Modifier: Provides information about class/member access modifiers

         */
        //Getting Class Objects
        // Three ways to get Class object
        Class<?> clazz1 = ReflectionAPI.class;           // Using class literal
        Class<?> clazz2 = Class.forName("MyClass"); // Using fully qualified name
        ReflectionAPI reflectionAPI = new ReflectionAPI();
        Class<?> clazz3 = reflectionAPI.getClass();           // From an object instance

        //Inspecting Class Structure

        // Get class name
        String className = clazz1.getName();
        // Get superclass
        Class<?> superClass = clazz1.getSuperclass();
        // Get interfaces
        // Class<?>[] interfaces = clazz1.getInterfaces();
        // Get modifiers
        int modifiers = clazz1.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);


        //        Working with Fields
        // Get all public fields (including inherited)
        Field[] fields = clazz1.getFields();

        // Get all declared fields (only this class)
        Field[] declaredFields = clazz1.getDeclaredFields();

        // Access private fields
        Field privateField = clazz1.getDeclaredField("fieldName");
        privateField.setAccessible(true); // Bypass access control

        // Get all public methods
        Method[] methods = clazz1.getMethods();

        // Get specific method
        //Method method = clazz1.getMethod("methodName", parameterTypes);

        // Invoke method
        //Object result = method.invoke(objectInstance, args);

        // Access private methods
        //Method privateMethod = clazz.getDeclaredMethod("methodName", parameterTypes);
        //privateMethod.setAccessible(true);

        System.out.println("Common Interview Problems & Solutions");

        System.out.println("Problem 1: Create an instance of a class whose name is given as a string");


    }
        //    Problem 1: Create an instance of a class whose name is given as a string
            public Object createInstance(String className) throws Exception {
                Class<?> clazz = Class.forName(className);
                return clazz.getDeclaredConstructor().newInstance();
            }

        //    Problem 2: Call a private method of a class
        public Object callPrivateMethod(Object obj, String methodName,
                                        Class<?>[] paramTypes, Object[] args) throws Exception {
            Method method = obj.getClass().getDeclaredMethod(methodName, paramTypes);
            method.setAccessible(true);
            return method.invoke(obj, args);
        }

        //    Problem 3: Get all field names and values of an object
        public Map<String, Object> getFieldValues(Object obj) throws Exception {
            Map<String, Object> fieldMap = new HashMap<>();
            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                fieldMap.put(field.getName(), field.get(obj));
            }

            return fieldMap;
        }

        //Problem 4: Copy all fields from one object to another (similar classes)
        public void copyFields(Object source, Object target) throws Exception {
            Class<?> clazz = source.getClass();
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(source);
                field.set(target, value);
            }
        }
}
