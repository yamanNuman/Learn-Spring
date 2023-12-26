package functional_programming_with_java;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1,2,3,4,6,7,8);
		printAllNumbersInListFunctional(List.of(1, 2, 3, 4, 5, 6, 7));
		//List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker","Kubernetes", "PCF");

		// Print All Courses
		// courses.stream().forEach(System.out::println);

		// Print Courses Containing the word "Spring"
		// courses.stream().filter(a ->
		// a.contains("Spring")).forEach(System.out::println);

		// Print Courses Whose Name has atleast 4 letters
		//courses.stream().filter(a -> a.length() > 4).forEach(System.out::println);
		
		//Mapping
		//numbers.stream().filter(a -> a % 2 == 0).map(a -> a * a).forEach(System.out::println);
		
		//Print the cubes of odd numbers
		//numbers.stream().filter(a -> a % 2 == 1).map(a -> a * a * a).forEach(System.out::println);
		
		
		
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		// Method Reference
		// Static Method => ClassName::MethodName
		// numbers.stream().forEach(FP01Functional::print);

//		numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);

		// Lambda Function
		// numbers.stream().filter(a -> a % 2 == 0).forEach(System.out::println);

		// Lambda Function Print Odd Number
		// numbers.stream().filter(a -> a % 2 == 1).forEach(System.out::println);

	}

//	private static void print(int number) {
//		System.out.println(number);
//	}

//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}
}
