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
        if(head==null)
        {
            System.out.println("empty");
        }
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void Insertion(int data)
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
    public void DeletionAtBeg(){
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        Node temp=head;
        if(head==tail)
        {
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
    }
    public void DeletionAtEnd()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        Node temp=tail;
        if(head==tail)
        {
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
    }
}
class Main{
    public static void main(String args[])
    {
        DoublyLinkList ob=new DoublyLinkList();
        System.out.println("LinkListist before deletion: ");
        ob.Insertion(10);
        ob.Insertion(20);
        ob.Insertion(30);
        ob.Insertion(40);
        ob.print();
        ob.DeletionAtBeg();
        System.out.println("LinkList after deletion at beginning: ");
        ob.print();
        ob.DeletionAtEnd();
        System.out.println("LinkList after deletion at end: ");
        ob.print();
    }
}
