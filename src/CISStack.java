import java.util.ArrayList;
import java.util.LinkedList;

public class CISStack {
    public CISStack() {
        this.head = null;
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
            this.next=null;
        }
    }
    private Node head;
    private int size;
    public void push(int num){
        Node node=new Node(num);
        node.next=head;
        head=node;
        size++;
    }
    public int pop(){
        int val=head.value;
        Node newHead=head.next;
        head.next=null;
        head=newHead;
        size--;
        return val;
    }

    public boolean isEmpty(){
        if(head==null)return true;
        return false;
    }

    public int size() {
        return size;
    }

    public String toString(){
        Node current=head;
        String s="CISStack{stack=[";
        ArrayList<Integer>temp=new ArrayList<>();
        while(current!=null){
            temp.add(0,current.value);
            current=current.next;
        }
        while(!temp.isEmpty()){
            s+=Integer.toString(temp.get(0));
            temp.remove(0);
            if(!temp.isEmpty())s+=", ";
        }
        s+="], size=";
        s+=Integer.toString(size());
        s+="}";
        System.out.println(s);
        return s;
    }

    // Linked list property.

    // Size property.

    // Constructor.

    // Push. This method pushes a value onto the top of the stack.

    // Pop. This method pops a value from the top of the stack.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2}

}
