package app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();
        int[] array = {3, 1, 4, 1, 5, 9};

        int max = utils.findMax(array);
        int min = utils.findMin(array);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("\nInfo about methods:");
        Method[] methods = ArrayUtils.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class) && method.isAnnotationPresent(Author.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("Метод: " + methodInfo.name());
                System.out.println("Тип поверненого значення: " + methodInfo.returnType());
                System.out.println("Опис: " + methodInfo.description());
                System.out.println("Автор: " + author.firstName() + " " + author.lastName());
                System.out.println("----------------------------------");
            }
        }
    }}