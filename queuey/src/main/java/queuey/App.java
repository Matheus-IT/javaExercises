package queuey;


public final class App {
    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out is " + numberQueue.dequeue());

        Queuey queuey = new Queuey();
        queuey.enqueue("there");
        queuey.enqueue("hi");

        System.out.print(queuey.dequeue() + " ");
        System.out.println(queuey.dequeue() + "! ");
    }
}
