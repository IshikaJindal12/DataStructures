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
            System.out.println("Elements of the doubly linklist are: ");
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public void InsertAtBeg(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            tail=temp;
        }
        else{
            head.previous=temp;
        }
        temp.next=head;
        head=temp;
    }
    public void InsertAtEnd(int data)
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
        obj.InsertAtBeg(30);
        obj.InsertAtBeg(20);
        obj.InsertAtBeg(10);
        obj.InsertAtEnd(40);
        obj.print();
    }
}
