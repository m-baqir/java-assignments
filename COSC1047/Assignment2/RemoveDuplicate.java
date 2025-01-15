import java.util.*;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			int num = myObj.nextInt();
			if (!myList.contains(num)) {
				myList.add(num);
			}
		}
		System.out.print("The distinct integers are ");
		for (int j = 0; j < myList.size(); j++) {
			System.out.print(myList.get(j) + " ");
		}
	}
}