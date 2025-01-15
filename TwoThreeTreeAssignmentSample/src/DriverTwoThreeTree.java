import java.util.Scanner;

public class DriverTwoThreeTree {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			TwoThreeTree<String> tttree = new TwoThreeTree<String>();
			// complete the rest as per the instruction
			// insert
			System.out.println("Enter 5 movie names to insert in the tree: ");
			String movie = input.nextLine();
			tttree.insert(movie);
			movie = input.nextLine();
			tttree.insert(movie);
			movie = input.nextLine();
			tttree.insert(movie);
			movie = input.nextLine();
			tttree.insert(movie);
			movie = input.nextLine();
			tttree.insert(movie);
			// retrieve
			System.out.println("\nEnter a movie name to search in the tree: ");
			movie = input.nextLine();
			System.out.println();
			tttree.retrieve(movie);
			// print
			System.out.println("\nPrinting the tree inorder: ");
			tttree.setInorder();
			System.out.println();
			System.out.println("\nPrinting the tree preorder: ");
			tttree.setPreorder();
			System.out.println();
			System.out.println("\nPrinting the tree postorder: ");
			tttree.setPostorder();
		}

	}
}