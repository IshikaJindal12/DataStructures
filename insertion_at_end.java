public class Insertion{

	 class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {   
	            this.data = data;    
	            this.next = null;    
	        }    
	    }   
	    public Node head = null;    
	    public void Printt() {       
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("EMPTY link list");    
	            return;    
	        }    
	        System.out.println("ELEMENTS of linked list are: ");    
	        while(current != null) {   
	            System.out.print(current.data + " ");   //elements of linked list are printed 
	            current = current.next;    
	        }}    
	    public void insertEnding(int data)
	    {
	        Node temp = new Node(data);
	        if(head == null) {    
	        	 head = temp; 
	        }
	        
	        else
	        {
	        	Node last = head;
	        	while (last.next != null) { 
	                last = last.next; 
	            } 
	            last.next = temp; 
	        }
	    }
	    
	public static void main(String[] args) {
		Insertion obj= new Insertion();
		obj.insertEnding(45);
		obj.insertEnding(50);
		obj.Printt();
	}}
