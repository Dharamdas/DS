package linklist;

public class CloneLinkedList {
    public static void main(String[] args) {
        CloneLinkedListPointingtoNextAndRandomNode orignalList = new CloneLinkedListPointingtoNextAndRandomNode();

        orignalList.addNode(30);
        orignalList.addNode(10);
        orignalList.addNode(60);
        orignalList.addNode(15);
        orignalList.addNode(25);
        orignalList.addNode(12);
        orignalList.addNode(90);
        orignalList.printList();
        orignalList.cloneListAndPointToRandomNodes();
        orignalList.printCloneList();
        System.out.println();

    }
}
