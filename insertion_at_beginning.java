public class Insertion {
	 class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }}    
	    public Node head = null; 
	   
	    public void Printt() {    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("EMPTY link list");    
	            return;    
	        }    
	        System.out.println("ELEMENTS of linked list: ");    
	        while(current != null) {      
	            System.out.print(current.data + " ");    
	            current = current.next;    //elements of link list are displayed
	        }}    
	    public void insertBeginning(int data){    
	        Node temp = new Node(data); // new node 
	        if(head == null) {    
	        	 head = temp; 
	        }
	        else
	        {
	        	temp.next=head;
	        	head = temp; 
	        }}
	public static void main(String[] args) {
		Insertion ob= new Insertion();
		ob.insertBeginning(2);
		ob.insertBeginning(23);
		ob.insertBeginning(20);
		ob.Printt();
	}}
