package linklist;


public class SingleNode {

    private Object data;
    private SingleNode next;

    SingleNode(){
        //default Constructor
    }

    public SingleNode(Object data){
        this.data=data;
        this.next=null;

    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
