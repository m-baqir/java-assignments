import java.util.Scanner;

public class Lab8Q1alex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.println("Enter the number of columns in a square matrix:");
		int column = input.nextInt();

		// Create array
		double[][] matrix = new double[column][column];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (1 + Math.random() * 999);
			}
		}

		// Output
		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix[k].length; l++) {
				System.out.printf("%-5.0f ", matrix[k][l]);
			}
			System.out.println();
		}
		System.out.printf("The average of all values in the matrix: %.0f\n", average(matrix));
		System.out.printf("The sum of all values in the matrix is: %.0f\n", sum(matrix));
		System.out.printf("The largest value in the matrix is: %.0f\n", largest(matrix));
		System.out.printf("The smallest value in the matrix is: %.0f\n", smallest(matrix));
		System.out.printf("The mode of the matrix is: %.0f\n", mode(matrix));
	}

	// Average()
	public static double average(double matrix[][]) {
		double total = 0;
		double average = 0;
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
				count++;
			}
		}
		average = total / count;
		return average;
	}

	// sum()
	public static double sum(double matrix[][]) {
		double total = 0;
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
				count++;
			}
		}
		return total;
	}

	// largest()
	public static double largest(double matrix[][]) {
		double largest = 0;
		double current = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				current = matrix[row][column];
				largest = Math.max(largest, current);
			}
		}
		return largest;
	}

	// smallest()
	public static double smallest(double matrix[][]) {
		double smallest = matrix[0][0];
		double current = matrix[0][0];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				current = matrix[row][column];
				smallest = Math.min(smallest, current);
			}
		}
		return smallest;
	}

	// mode()
	public static double mode(double[][] matrix) {
		double[] values = new double[1001]; // To store the frequency of each possible value (1 to 1000).
		double mostFrequentValue = -1;
		double maxFrequency = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int value = (int) matrix[i][j];
				values[value]++;

				if (values[value] > maxFrequency) {
					mostFrequentValue = value;
					maxFrequency = values[value];
				}
			}
		}
		return mostFrequentValue;
	}

}
