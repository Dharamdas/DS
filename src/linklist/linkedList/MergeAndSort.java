package linklist.linkedList;

public class MergeAndSort {
    public static void main(String[] args) {
        Node n11 = new Node(5);
        Node n12 = new Node(11);
        Node n13 = new Node(9);
        Node n14 = new Node(11);
        Node n15 = new Node(10);

        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;

        Node n21 = new Node(3);
        Node n22 = new Node(19);
        Node n23 = new Node(12);
        Node n24 = new Node(4);
        Node n25 = new Node(6);
        Node n26 = new Node(11);
        Node n27 = new Node(4);

        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;
        n25.next = n26;
        n26.next = n27;


    }
}
