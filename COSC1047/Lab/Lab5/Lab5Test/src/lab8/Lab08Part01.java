package lab8;

import java.io.*;

public class Lab08Part01 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		int[] myNumbers = { 1, 2, 3, 4, 5 };

		try (
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("file2.dat"));) {
			output.writeObject(new java.util.Date());
			output.writeDouble(2.5);
			output.writeObject(myNumbers);
		}

		try (
				ObjectInputStream input = new ObjectInputStream(new FileInputStream("file2.dat"));) {
			java.util.Date myDate = (java.util.Date) (input.readObject());
			double myValue = input.readDouble();
			int[] myNewNumbers = (int[]) (input.readObject());

			System.out.println("Date: " + myDate);
			System.out.println("Double: " + myValue);
			System.out.print("Array: ");
			for (int i = 0; i < myNewNumbers.length; i++) {
				System.out.print(myNewNumbers[i] + " ");
			}
		}

	}

}