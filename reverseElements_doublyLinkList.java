class DoublyLinkList{
    class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void print(){
        Node current=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("Elements before reversing are: ");
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public void print1(){
        Node current=tail;
        if(tail==null)
        {
            System.out.println("List is empty");
        }
        else{
            System.out.println("\nElements of reversed Doubly linklist are: ");
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.previous;
            }
        }
    }
    public void Insert(int data)
    {
        Node temp=new Node(data);
        if(tail==null)
        {
            head=temp;
        }
        else{
            tail.next=temp;
            temp.previous=tail;
        }
        tail=temp;
    }
}
class Main{
    public static void main(String args[])
    {
        DoublyLinkList obj=new DoublyLinkList();
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.Insert(40);
        obj.print();
        obj.print1();
    }
}
