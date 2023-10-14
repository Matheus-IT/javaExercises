package generics;


public final class App {
    public static <T extends Comparable <T>> T findGreater(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0)
            return b;
        else
            return a;
    }
    
    public static void main(String[] args) {
        System.out.println(findGreater(3, 2));
        System.out.println(findGreater(2, 3));
        System.out.println(findGreater(3, 3));

        System.out.println(findGreater("hello", "there"));
    }
}
