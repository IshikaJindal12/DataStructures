class LinkList{
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
    public void print()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("Empty");
        }
        System.out.println("\nElements: ");
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public void InsAtBeg(int data)
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
    public void DelAtPos(int pos)
    {
        if(head==null)
        {
            System.out.println("empty");
        }
         Node temp=head;
        if(pos==0)
        {
            head=head.next;
        }
        for(int i=0;temp!=null && i<pos-1;i++)
        {
            temp=temp.next;
        }
        if(temp==null || temp.next==null)
        return;
        Node n=temp.next.next;
        temp.next=n;
    }
}
class Main{
    public static void main(String args[])
    {
        LinkList obj=new LinkList();
        obj.InsAtBeg(50);
        obj.InsAtBeg(40);
        obj.InsAtBeg(30);
        obj.InsAtBeg(20);
        obj.InsAtBeg(10);
        obj.print();
        obj.DelAtPos(4);
        obj.print();
    }
}
