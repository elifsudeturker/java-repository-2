package day19passbyvaluemethodoverloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {
        add(3,5);
    }

    private static void add(int a, int b) {
        System.out.println(a+b);
    }

    private static void add(double a, double b) {
        System.out.println(a+b);
    }

    private static void add(double a, int b) {
        System.out.println(a+b);
    }

    private static void add(int a, double b) {
        System.out.println(a+b);
    }

    private static void add(int a, int b, int c) {
        System.out.println(a+b);
    }
}


