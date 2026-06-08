package collections.linkedlist;

public class LinkedLists {

    private Node head;
    private Node tail;
    private int size;

    void addFirst(int value)
    {
        Node nnode=new Node(value);
        nnode.next=head;
        head=nnode;
        if(tail==null)//if it is frist node we can update node as a head and tail
        {
            tail=head;
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
        Node nnode=new Node(value);
        nnode.next=null;
        tail.next=nnode;
        tail=nnode;
        size++;
    }

    void insert(int index,int value)
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
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        Node nn=new Node(value,temp.next);
        temp.next=nn;
        size++;

    }

    int deleteFirst()
    {
        if(size==0)
        {
            tail=null;
            return -1;
        }
        int val= head.value;
        head=head.next;
        size--;
        return val;
    }

    Node get(int index)
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    int deleteLast()
    {
        if(size<=1)
        {
            return deleteFirst();

        }
        int val=tail.value;
        Node temp=get(size-2);
        temp.next=null;
        temp=tail;
        size--;
        return val;
    }

    int delete(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        if(size-1==index)
        {
           return deleteLast();

        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        prev.next.next=null;
        size--;
        return val;
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedLists ll=new LinkedLists();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.display();

        ll.addLast(6);
        ll.addLast(7);
        ll.display();
        System.out.println(ll.size);

        ll.insert(3,25);
        ll.display();

        System.out.println(ll.deleteFirst());
        ll.display();

        System.out.println(ll.deleteLast());
        ll.display();

        System.out.println(ll.delete(3));
        ll.display();

    }

}
