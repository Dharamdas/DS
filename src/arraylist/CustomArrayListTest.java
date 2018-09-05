package arraylist;

public class CustomArrayListTest {
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        customArrayList.add(10);
        customArrayList.add(60);
        customArrayList.add(50);
        customArrayList.add(0);
        customArrayList.add(5);
        customArrayList.add(1);
        customArrayList.display();
    }
}
