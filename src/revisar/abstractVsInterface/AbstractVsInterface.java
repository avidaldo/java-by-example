package revisar.abstractVsInterface;

interface LoginAuthDbIndependent {
	public String encryptPassword(String pass);
	public void checkDBforUser();
}

class DBMySQL implements LoginAuthDbIndependent {

	@Override
	public String encryptPassword(String pass) { return null; }

	@Override
	public void checkDBforUser() {}
}

class DBOracle implements LoginAuthDbIndependent {

	@Override
	public String encryptPassword(String pass) { return null; }

	@Override
	public void checkDBforUser() {}
}

class DBAbc implements LoginAuthDbIndependent {

	@Override
	public String encryptPassword(String pass) { return null; }

	@Override
	public void checkDBforUser() {}
}
