//https://en.wikipedia.org/wiki/Fragile_base_class
package p01_introductorio.herencia;

class Super {
	@SuppressWarnings("unused")
	private int counter = 0;
	void inc1() {
		counter++;  // Modificación de esta linea por la siguiente
		// inc2();
	}
	void inc2() {
		counter++;
	}
}

class Sub extends Super {
	@Override
	void inc2() {
		inc1();
	}
}

/*
 * Calling the dynamically bound method inc2() on an instance of Sub will correctly increase the field
 * counter by one. If however the code of the superclass is changed, a call to the
 * dynamically bound method inc2() on an instance of Sub will cause an infinite recursion between itself
 * and the method inc1() of the super-class and eventually cause a stack overflow. This problem could
 * have been avoided, by declaring the methods in the superclass as final, which would make it impossible
 * for a sub-class to override them. However, this is not always desirable or possible. Therefore, it is
 * good practice for super-classes to avoid changing calls to dynamically-bound methods.
 */
