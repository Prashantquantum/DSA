package cc;

public class SCNode {
	private int data;
	private SCNode next;
	
	public SCNode(int data)
	{
		super();
		this.data=data;
		this.next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SCNode getNext() {
		return next;
	}

	public void setNext(SCNode next) {
		this.next = next;
	}

	
	
	

}
