package linklist;

public class MergeTwoLL {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> l = new SinglyLinkedList<>();
        l.add(101);
        l.add(33);
        l.add(12);
        l.add(99);

        System.out.println("UnsortedLL: "+l.toString());
        SinglyLinkedList<Integer> s = new SinglyLinkedList<>(sortLL(l.getList()));
        System.out.println("SortedLL: "+s.toString());
    }

    public static SingleNode sortLL(SingleNode node){

        SingleNode currNode=null;
        SingleNode prevNode=null;
        SingleNode nextNode=null;

        for(SingleNode singleNode = node;singleNode!=null;singleNode=singleNode.getNext())
        {
           currNode=node;
           while (currNode!=null)
           {
               if((Integer)currNode.getData()<(Integer) currNode.getNext().getData())
               {

                   prevNode=currNode;
                   currNode=currNode.getNext();
                   nextNode=currNode.getNext();
                   currNode.setNext(prevNode);
                   prevNode=currNode;
                   prevNode.setNext(nextNode);
               }
           }
        }

        return prevNode;
    }

}
