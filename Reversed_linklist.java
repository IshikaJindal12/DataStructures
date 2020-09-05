class LinkList{
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public void Insert(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else{
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=temp;
        }
    }
    public void print()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            System.out.println("Elements of reversed linklist are: ");
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    Node reverse(Node head){
        if(head==null)
        {
            return head;
        }
        Node previous=null;
        Node next=null;
        Node current=head;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
        return head;
    }
    public static void main(String args[])
    {
        LinkList obj=new LinkList();
        obj.head=new Node(10);
        obj.head.next=new Node(20);
        obj.head.next.next=new Node(30);
        obj.head.next.next.next=new Node(40);
        head=obj.reverse(head);
        obj.print();
    }
}
