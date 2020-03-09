public class QueueMain {
    public static void main(String[] args) {
        Queue_Implement Qu = new Queue_Implement();
        Qu.enqueue(10);
        Qu.enqueue(20);
        Qu.enqueue(30);
        Qu.display();
        Qu.dequeue();
        Qu.display();
    }
}
