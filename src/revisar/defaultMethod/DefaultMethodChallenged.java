package revisar.defaultMethod;

public class DefaultMethodChallenged {

	public static void main(String[] args) {
		Jofrey jofrey = new Jofrey() {
			@Override
			public void kill() {
				Jofrey.super.kill();
			}
		};
		
		jofrey.kill();

	}
	
	public interface Cercei {
		default void kill() {
			System.out.println("Cercei");
		}
	}
	
	interface Jofrey extends Cercei {
		default void kill() {
			System.out.println("Kill'em all!");
		}
	}

}

// https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html

