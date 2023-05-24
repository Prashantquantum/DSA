package cc;

public class SinglyCircularLinkedList {
	private SCNode head,tail;

	
	public SinglyCircularLinkedList()
	{
		this.head=null;
		this.tail=null;
	}


	public SCNode getHead() {
		return head;
	}


	public void setHead(SCNode head) {
		this.head = head;
	}


	public SCNode getTail() {
		return tail;
	}


	public void setTail(SCNode tail) {
		this.tail = tail;
	}
	
	public boolean Insertatlast(int v)
	{
		SCNode nn=new SCNode(v);
		if(nn==null)
			return false;
		if(head==null) {
			head=tail=nn;
			nn.setNext(head);}
		else {
			nn.setNext(head);
			tail.setNext(nn);
			tail=nn;
		}
		return true;
	}
	
	public void Display() {
		SCNode temp=head;
//		System.out.println("out while");
		while(temp!=head) {
			
			System.out.println(temp.getData());
			temp=temp.getNext();
				}
	}
	
}
