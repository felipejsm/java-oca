public class Teste {
	public void m1 (String bla) {
		System.out.println(bla);
	}
	public void m2 () {
		System.out.println(bla);
	}
	public static void main (String [] args) {
		Teste t1 = new Teste();
		t1.m1("Hi there");
		Teste t2 = t1;
		t2.m2();
	}
}

