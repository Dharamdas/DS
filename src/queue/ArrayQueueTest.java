package queue;

public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);
        q.enQueue(70);
        q.enQueue(80);
        q.enQueue(90);
        q.getList();
        System.out.println(q.isFull());
    }
}
