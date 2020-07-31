public class Insertion {

    static class LinkList {
        public int data;
        public LinkList next;

        public LinkList(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class LinkList1 {
        public LinkList head;

        public LinkList1() {
            this.head = null;
        }
      
    }

    public static void printLinkList1(LinkList node, String sep, BufferedWriter writer) throws IOException {
        while (node != null) {
            writer.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                writer.write(sep);
            }
        }
    }
    public static LinkList insertNodeAtTail(LinkList head, int data) 
    {
        LinkList cnode=new LinkList(data);
        cnode.data=data;
        cnode.next=null;
        LinkList current=head;
        
        if(head==null)
        {
            head=cnode;
        }
        
        else
        {
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=cnode;
        }
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        LinkList1 lst = new LinkList1();

        int lstCnt = scanner.nextInt();
        for (int i = 0; i < lstCnt; i++) {
          
            int lstItem = scanner.nextInt();
          LinkList lst_head = insertNodeAtTail(lst.head, lstItem);
          lst.head = lst_head;   }
        printLinkList1(lst.head, "\n", writer);
        writer.newLine();

        writer.close();

        scanner.close();
    }}
