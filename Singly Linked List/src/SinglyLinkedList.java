
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
    	this.head = null;
    	}
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public Boolean length() {
    	if (this.head == null) {
    		return true;
    	}
    	else { return false;}
    }
    public Integer remove() {
    	 if (length()) {return null;}
    	 else if (head.next ==null) {
    		int  val = head.value;
    		head = null;
    		return val;
    	 }
    	 else { 
    		 Node temp = head.next;
    		 while (temp.next.next !=null) {
    			 temp = temp.next;
    		 }
    		 int  val = head.value;
    		 val = temp.value;
    		 temp.next = null;
    		 return val;
    	 }
    }
    public void printValues() {
    	Node temp = head.next;
    	System.out.println(head.value);
    	while (temp.next != null) { 
    		System.out.println(temp.value);
    		temp = temp.next;
    	}
    	System.out.println(temp.value);
    }
    	
}
    
