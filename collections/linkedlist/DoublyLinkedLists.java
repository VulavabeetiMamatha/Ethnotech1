package collections.linkedlist;

public class DoublyLinkedLists {

    private Node head;
    private Node tail;
    int size;

    void addFirst(int value)
    {
        Node nn=new Node(value);
        nn.next=head;
        if(head!=null)
           head.prev=nn;
        head=nn;
        if(tail==null)
        {
            tail=nn;
        }
        size++;

    }

    void addLast(int value)
    {
        if(tail==null)
        {
            addFirst(value);
            return;
        }
        Node nn=new Node(value);
        tail.next=nn;
        nn.prev=tail;
        tail=nn;
        size++;
    }

    void addAny(int index,int value)
    {
        if(index==0)
        {
            addFirst(value);
            return;
        }
        if(index==size)
        {
            addLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node nn=new Node(value);
        nn.next=temp.next;
        nn.prev=temp;
        temp.next.prev=nn;
        temp.next=nn;
        size++;

    }

    int deleteFirst()
    {
        if(head==null)
        {
            return -1;
        }
        int val=head.value;
        head=head.next;
        if(head!=null)
          head.prev=null;
        size--;
        return val;
    }

    int deleteLast()
    {
        if(size<=1)
        {
            return deleteFirst();

        }
        int val=tail.value;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    int deleteAny(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        if(size-1==index)
        {
            return deleteLast();

        }
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        int val=temp.next.value;
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;
        return val;
    }

    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"<->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node
    {
        private Node prev;
        private int value;
        private Node next;

        Node(int value)
        {
            this.value=value;
        }

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedLists dl=new DoublyLinkedLists();
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addFirst(4);
        dl.display();
        dl.addLast(8);
        dl.addLast(9);
        System.out.println("Size:"+dl.size);
        dl.display();
        dl.addAny(3,25);
        System.out.println("Size:"+dl.size);
        dl.display();
        System.out.println("deleted value:"+dl.deleteFirst());
        System.out.println("Size:"+dl.size);
        dl.display();
        System.out.println("deleted value:"+dl.deleteLast());
        System.out.println("Size:"+dl.size);
        dl.display();
        System.out.println("deleted value:"+dl.deleteAny(1));
        System.out.println("Size:"+dl.size);
        dl.display();
    }
}
