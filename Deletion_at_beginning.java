public class Deletion {
	 class Node{    
	        int data;    
	        Node next;       
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        } }    
	    public Node head = null;
	    public void Printt() { 
	        Node current = head;  //original value of head is not changed
	        if(head == null) {    
	            System.out.println("EMPTY list");    
	            return;    
	        }    
	        System.out.println("ELEMENTS of linked list are: ");    
	        while(current != null) {    
	            System.out.print(current.data + " ");    //elements of link list are printed
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    
	    
	    public void insertBeginning(int data)
	    {
	        Node temp = new Node(data);  
	        if(head == null) {    
	        	 head = temp; 
	        }
	        else
	        {
	        	temp.next=head;
	        	head = temp; 
	        }}  
	    public void deletionBeginning()
	    {
	    	if(head==null)
	    	{
	    		System.out.println("EMPTY LIST");
	    	}
	    	else
	    	{
	    		Node temp=head;
		    	head=head.next;
		    	temp=null;
	    	}}
	public static void main(String[] args) {
		Deletion obj= new Deletion();
		obj.insertBeginning(100);
		obj.insertBeginning(200);
		obj.Printt();
		obj.deletionBeginning();
		obj.Printt();
	}}
