package p01_introductorio.static_field;

class EjercicioStaticField {

	public static void main(String[] args) {
		Chachi a = new Chachi();
		a = new Chachi();
		Chachi b = new Chachi();
		b.setChachi(5, 4);
		b = new Chachi();
		
	
	}
}

class Chachi {
	static int a=0;
	int b=0;
	
	public Chachi() {
		a++;
		b++;
		System.out.println(a+"\n"+b);
	}

	
	
	public void setChachi(int a, int b) {
		Chachi.a=a;
		this.b=b;
	}
}
	