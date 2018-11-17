package linklist;

public class ReverseLL {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
        ll.add(20);
        ll.add(50);
        ll.add(30);
        ll.add(10);
        ll.add(5);
        ll.add(66);
        System.out.println(ll.toString());

        SingleNode node =ll.getList();

        SinglyLinkedList<Integer> l = new SinglyLinkedList<>(reverseLL(node));
        System.out.println("After Reverse LL: "+l.toString());


    }

    public static SingleNode reverseLL(SingleNode node){

        SingleNode current=node;
        SingleNode temp=null;
        SingleNode nextNode=null;

        while (current!=null)
        {
            nextNode=current.getNext();
            current.setNext(temp);
            temp=current;
            current=nextNode;
        }
        node=temp;
        return node;
    }
}
