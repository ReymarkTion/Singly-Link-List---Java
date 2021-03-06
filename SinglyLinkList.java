package SinglyLinkList;

/**
 *     *******************************
 *     *                             *
 *     *  @author Reymark Molo Tion  *
 *     *                             *
 *     *******************************
 */
public class SinglyLinkList {
	
	public SinglyLinkList() {
		top = null;
	}

	/*
	 * singly Link List Node
	 */
	public class node {
		public float value;
		public String label;
		public node prev;
		
		public node() {
			value = 0;
			label = null;
			prev = null;
		}
		
		public node(float value, String l) {
			this.value = value;
			this.label = l;
			prev = null;
		}
	}
	
	private node top;
	
	public void insert(float v, String l) {
		if(top == null) {
			top = new node(v, l);
			top.prev = null;
		} else {
			node n = new node(v, l); 
			n.prev = top;
			top = n;
		}
	}
	
	
	public void display() {
		node temp = Main.sll.top;
		while(temp != null) {
			System.out.println(" label: "+temp.label);
			System.out.println(" value: "+temp.value);
			System.out.println("-------------------->>>");
			temp = temp.prev;
		}
	}
	
	public float getData(String label) {
		float value = 0;
		node temp = Main.sll.top;
		while(temp != null) {
			if(temp.label.equals(label)) {
				value = temp.value;
				break;
			}
			temp = temp.prev;
		}
		return value;
	}

}
