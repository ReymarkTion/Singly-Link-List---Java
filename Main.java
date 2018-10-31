package SinglyLinkList;

/**
 *     *******************************
 *     *                             *
 *     *  @author Reymark Molo Tion  *
 *     *                             *
 *     *******************************
 */
public class Main {
	
	static SinglyLinkList sll = new SinglyLinkList();

	public static void main(String[] args) {
		
		
		sll.insert(100, "sample 1");
		sll.insert(200, "sample 2");
		sll.insert(300, "sample 3");
		sll.insert(400, "sample 4");
		sll.insert(500, "sample 5");
		sll.insert(600, "sample 6");
		
		System.out.println("Datas:\n");
		sll.display();
		
		System.out.println("\n\n\nGet sample 1 value:\n");
		float data = sll.getData("sample 1");
		System.out.println("data: " + data);
		
	}
	
	
}
