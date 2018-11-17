package linklist;


import org.w3c.dom.NodeList;

public class SinglyLinkedList<E> {

    Integer i;
    private int initialCapacity;
    private SingleNode nodesList;

    private SingleNode getNodesList() {
        return nodesList;
    }

    private void setNodesList(SingleNode nodesList) {
        this.nodesList = nodesList;
    }

    public SinglyLinkedList(int initialCapacity){
      this.initialCapacity=initialCapacity;
  }

  public SinglyLinkedList(){
      //default Constructor
      SingleNode NodesList=null;
  }
    public SinglyLinkedList(SingleNode node){
        //default Constructor
        this.nodesList=node;
    }

  //Create Node with Given Data
  public SingleNode createNode(E data){
      SingleNode singleNode=  new SingleNode();
      singleNode.setData(data);
      singleNode.setNext(null);
      return singleNode;

  }

  public void reverseNode(){
        SingleNode current=nodesList;
        SingleNode nextNode =null;
        SingleNode tempNode=null;
          while(current!=null)
          {
              nextNode=current.getNext();
              current.setNext(tempNode);
              tempNode=current;
              current=nextNode;
          }
          nodesList=tempNode;
  }

  public SinglyLinkedList detectAndRemoveLoop(SinglyLinkedList linkedList){

        SingleNode node = linkedList.nodesList;
        if(node==null || node.getNext()==null)
            return null;
        SingleNode slow=node,fast=node;
        while (fast!=null && fast.getNext()!=null)
        {
            if(slow==fast)
                break;
            slow=slow.getNext();
            fast=fast.getNext().getNext();
        }
        //if loop exists
      if(slow==fast){
            slow=node;
            while (slow.getNext()!=fast.getNext()){
                slow=slow.getNext();
                fast=fast.getNext();
            }
            fast.setNext(null);
      }
      linkedList.setNodesList(node);
      return linkedList;

  }

  public boolean findIfNodeCircular(SinglyLinkedList linkedList){
        boolean flag=false;
        SingleNode fastPointer=linkedList.getNodesList();
        SingleNode slowPointer=linkedList.getNodesList();
        while (fastPointer.getNext()!=null)
        {
            slowPointer=slowPointer.getNext();
            fastPointer=fastPointer.getNext().getNext();

            if(slowPointer==fastPointer)
            {
                flag=true;break;
            }
        }


        return flag;
  }

  public int size(SinglyLinkedList linkedList){
        int count=0;
        SingleNode temp=linkedList.getNodesList();
        while (temp!=null)
        {
            temp=temp.getNext();
            count++;
           // if(count>40)break;
        }
        return count;
  }

  public SinglyLinkedList createCircularNode(SinglyLinkedList masterNode,SinglyLinkedList node2,SinglyLinkedList node3){

      SinglyLinkedList cucularList = new SinglyLinkedList();
          SingleNode temp = masterNode.getNodesList();
          SingleNode temp1 = temp;

          while (temp.getNext()!=null)
          {
              temp=temp.getNext();
          }
          temp.setNext(node2.getNodesList());
          while (temp.getNext()!=null)
          {
              temp=temp.getNext();
          }
          temp.setNext(node3.getNodesList());
          while (temp.getNext()!=null)
          {
              temp=temp.getNext();
          }
      temp.setNext(temp1);
      masterNode.setNodesList(temp);
      cucularList.setNodesList(masterNode.getNodesList());
      return cucularList;

  }

  public E findNthNodeFromEnd(int NthNode){
      SingleNode temp =nodesList;
      SingleNode nthNode = nodesList;
      for(int i=1;i<NthNode;i++)
      {
          if(temp!=null)
              temp=temp.getNext();
      }
      while(temp.getNext()!=null)
      {
         nthNode=nthNode.getNext();
         temp=temp.getNext();
      }

      return (E)nthNode.getData();
  }

  public E remove(E data)
  {
      if(nodesList.getNext()==null  && nodesList.getData().equals(data))
          return (E)nodesList.getData();
      else{
          SingleNode current=nodesList;
          while (current!=null)
          {
              if(current.getData()==data)
              {
                  return (E)current.getData();
              }
              current=current.getNext();
          }
      }
      return (E)new Integer(-1);
  }
    public E removeMiddleNode(){

        Object obj=null;
        if(nodesList==null)
        {
            System.out.println("Node is Empty");
        }else if(nodesList.getNext()==null){
            obj = nodesList.getData();
            nodesList=null;
        }else{

            SingleNode slowPointer=nodesList;
            SingleNode fastPointer=nodesList;
            SingleNode previous=null;

            while (fastPointer!=null && fastPointer.getNext()!=null)
            {
                previous=slowPointer;
                slowPointer=slowPointer.getNext();
                fastPointer=fastPointer.getNext().getNext();
            }

            previous.setNext(slowPointer.getNext());
            obj=slowPointer.getData();
        }

        return (E)obj;
    }
  public E removeFirstNode(){
      Object obj=null;
      if(nodesList==null)
      {
          System.out.println("Node is Empty");
      }else if(nodesList.getNext()==null){
           obj = nodesList.getData();
          nodesList=null;
      }else{
          SingleNode current=nodesList;
          obj=current.getData();
          nodesList=current.getNext();
          current=null;

      }

      return (E)obj;
  }

//default remove node from Last
  public E removeNode(){
      SingleNode currentNode=nodesList;
      SingleNode previousNode=null;
      if(nodesList==null)
      { System.out.println("List is Empty");
      }else{

          while(currentNode.getNext()!=null)
          {
              previousNode=currentNode;
              currentNode = currentNode.getNext();

          }
          previousNode.setNext(currentNode.getNext());

      }

      return (E)currentNode.getData();
  }

  public E findMiddleNode(){
      SingleNode slowPointer=nodesList;
      SingleNode fastPointer=nodesList;
      while(fastPointer!=null && fastPointer.getNext()!=null )
      {
          slowPointer=slowPointer.getNext();
          fastPointer=fastPointer.getNext().getNext();
      }
      return (E)slowPointer.getData();
  }
  public void insertNodeInMiddle(E data){
      if(nodesList==null)
      {
          nodesList=createNode(data);
      }else{
          SingleNode newNode = createNode(data);
          SingleNode slowPointer=nodesList;
          SingleNode fastPointer=nodesList;
          while(fastPointer!=null && fastPointer.getNext()!=null)
          {
              slowPointer=slowPointer.getNext();
              fastPointer=fastPointer.getNext().getNext();
          }
          newNode.setNext(slowPointer.getNext());
          slowPointer.setNext(newNode);
      }

  }

  public void insertNodeInBeging(E data){
      if(nodesList==null)
      {
          nodesList  = createNode(data);
      }else {
          SingleNode newNode = createNode(data);
          newNode.setNext(nodesList);
          nodesList=newNode;
      }
  }

  //default insert node in the last
  public void add(E data){

      if(nodesList==null) // No node created
      {
          nodesList = createNode(data); // creating first node
      }else
      {
          SingleNode temp = nodesList;
          SingleNode newNode = createNode(data);
          while(temp.getNext()!=null)
          {
              temp = temp.getNext();
          }
          temp.setNext(newNode);
      }
  }
  public SingleNode getList(){
        return nodesList;
  }

  private StringBuffer getprintList(){
      SingleNode singleNode = nodesList;
      StringBuffer sb = new StringBuffer();
      sb.append("[");
      //System.out.print("[");
      while(singleNode!=null)
      {
        // System.out.print(singleNode.getData()+" ,");
         sb.append(singleNode.getData());
        // sb.append(",");
         singleNode = singleNode.getNext();
         if(singleNode!=null)
          sb.append(",");

      }
      sb.append("]");
      return sb;

  }

    @Override
    public String toString() {
        return getprintList().toString();
    }
}

