package p02_basic_syntax.bloques;

public class ScopeBloques {

	public static void main(String[] args) {

		{
			int a = 6;
		}
		//System.out.println(a);

		
		
		for (int num = 5; num <= 10; num++)
			for (/*int*/ num = 5; num <= 10; num++);

		for (int num = 5; num <= 10; num++);

	}

}
