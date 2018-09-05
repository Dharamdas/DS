package linklist;

public class SingllyLinkedListTest {

    public static void main(String...args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(20);
        list.add(30);
        list.add(70);
        list.add("String");
        list.insertNodeInBeging(5);
        list.insertNodeInMiddle(90);
        list.insertNodeInBeging(4);
        list.insertNodeInBeging(2);
        System.out.println("\n Circular Node: "+list.findIfNodeCircular(list));
       // System.out.println("Middle Element: "+list.findMiddleNode());
       // list.getList();
      //  System.out.println("\n"+"Removed Node From Last "+list.removeNode());
        //System.out.println("Removed First Node "+list.removeFirstNode());
    //    System.out.println("\n"+"Removed First Node "+list.removeMiddleNode());
        //System.out.println("\n"+"Element Removed "+list.remove(10));
        //System.out.println("\n Nth Node From Last "+list.findNthNodeFromEnd(2));
        //System.out.println("\n Reverse the Node");
       // list.reverseNode();
        //list.getList();

        SinglyLinkedList<Integer> node1 = new SinglyLinkedList<Integer>();
        node1.add(10);
        node1.add(30);
        node1.add(5);
        node1.add(60);
        SinglyLinkedList<Integer> node2 = new SinglyLinkedList<Integer>();
        node2.add(0);
        node2.add(35);
        node2.add(5);
        node2.add(70);
        SinglyLinkedList<Integer> node3 = new SinglyLinkedList<Integer>();
        node3.add(15);
        node3.add(20);
        node3.add(5);
        node3.add(90);
        SinglyLinkedList node= node1.createCircularNode(node1,node2,node3);

        System.out.println("\n Circular Node: "+node.findIfNodeCircular(node));



    }
}
