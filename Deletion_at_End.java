class Deletion{
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public void print(){
        Node current=head;
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        System.out.println("\nElements of LinkList are: ");
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public void InsertionAtBeg(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }
    public void DeletionAtEnd()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
}
class Main{
    public static void main(String args[])
    {
        Deletion obj=new Deletion();
        obj.InsertionAtBeg(10);
        obj.InsertionAtBeg(20);
        obj.InsertionAtBeg(30);
        obj.InsertionAtBeg(40);
        obj.InsertionAtBeg(50);
        obj.print();
        obj.DeletionAtEnd();
        obj.print();
    }
}
