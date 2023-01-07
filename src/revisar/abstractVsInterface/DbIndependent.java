package revisar.abstractVsInterface;

public abstract class DbIndependent {

	public String encryptPassword(String pass) {
		return null;
		// Implement the same default behavior here
		// that is shared by all subclasses.
	}

	// Each subclass needs to provide their own implementation of this only:
	public abstract void checkDBforUser();
}