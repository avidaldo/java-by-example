package p02_basic_syntax.goto_;

public class Goto {

	public static void main(String arng[]) {
		int num, i, sum = 0;
		go : {
			System.out.println("Enter a number");
					break go;
			
		}
		System.out.println("Sum of odd number:" + sum);
	}

}
