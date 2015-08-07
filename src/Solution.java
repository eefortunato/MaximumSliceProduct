import java.util.Scanner;

public class Solution {

	public static double solution(double[] array) {
		  
		  double currentMax = array[0];
		  double currentMin = array[0];
		  double totalProd = array[0];		  
		  
		for (int i = 1; i < array.length; i++) {
			double prevMin=currentMin;
			double prevMax=currentMax;
			currentMax= Math.max(Math.max(prevMax*array[i],array[i]), prevMin*array[i]);
			currentMin= Math.min(Math.min(prevMax*array[i],array[i]), prevMin*array[i]);
			totalProd= Math.max(totalProd, currentMax);
			if (totalProd >= 1000000000.0) {
				return 1000000000.0;
			}
		}
		return totalProd;
	}
	public static void main(String[] args) {

		System.out.println("Please enter number of elements: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfElements = scanner.nextInt();
		double[] solutionArray = new double[numberOfElements];

		for (int i = 0; i < numberOfElements; i++)
			solutionArray[i] = scanner.nextDouble();
		
		scanner.close();

		double result = solution(solutionArray);
		System.out.println(result);
	}
}
