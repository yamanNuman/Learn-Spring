package functional_programming_with_java;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumbersInListStructured(List.of(1,2,3,4,5,6,7));
	}

	private static void printAllNumbersInListStructured(List<Integer> of) {
		for(int number : of) {
			System.out.println(number);
		}
		
	}
}
