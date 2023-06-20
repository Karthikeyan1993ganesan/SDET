package mandatoryHomeWork.week4.day1;


public class LinkedList {
	
class Node{
	int data;
	Node next;
}
	
   Node head;
   
   public void insert(int data)
   {
	   Node node = new Node();
	   node.data=data;
	   
	   if(head==null)
	   {
		   head=node;
	   }
	   else
	   {
		   Node n = head;
		   while(n.next!=null)
		   {
			   n=n.next;
		   }
		   n.next=node;
	   }
   }

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.show();
		list.get(2);
		list.indexOf(7);

	}

	private void indexOf(int i) {
		// TODO Auto-generated method stub
		Node n = head;
		int count=0;
		while(n!=null)
		{
		if(i==n.data)
		{
			System.out.println(count);
		}
		count++;
		n=n.next;
		}
		
	}

	private void get(int i) {
		// TODO Auto-generated method stub
		 Node n = head;
	        int count = 0; 
	        while (n != null)
	        {
	            if (count == i)
	                System.out.println(n.data);
	            count++;
	            n = n.next;
	        }
	}

	private void show() {
		// TODO Auto-generated method stub
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}



}
