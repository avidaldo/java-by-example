//https://www.geeksforgeeks.org/g-fact-79/
//https://dzone.com/articles/the-hidden-synchronized-keyword-with-a-static-bloc
package p02_basic_syntax.staticBlocks;

import java.time.LocalDateTime;

public class StaticBlocks {
	private static final String currentTimeString;
	private static String lastUsedTimeString;
	
	static {
		//final String currentTimeString = LocalDateTime.now().toString(); // Duda
		currentTimeString = LocalDateTime.now().toString();
		System.out.println("Static block executed at time "+ currentTimeString);
	}
	
	
	public static synchronized void main(String[] args) {
		lastUsedTimeString = LocalDateTime.now().toString();
		System.out.println("Last used time updated to " + lastUsedTimeString);
	}
	
}
