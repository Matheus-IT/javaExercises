package printarray;


public final class App {
    public static <E> void printArray(E[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        String[] words = {"casa", "carro", "bola", "dado"};
        Integer[] nums = {1, 2, 3, 4, 5};

        printArray(nums);
        printArray(words);
    }
}
