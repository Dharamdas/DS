package thread.synchronizedkeyworduses.with;

public class TrainLineDemo {
    public static void main(String[] args) {

        Line1 line = new Line1();

        Train train = new Train(line);
        train.setName("Train-1");
        Train taTrain1 = new Train(line);
        taTrain1.setName("Train-2");
        Train train2 = new Train(line);
        train2.setName("Train-3");

        train.start();
        taTrain1.start();
        train2.start();

    }
}
