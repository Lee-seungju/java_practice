class	A {
	int	value;
	
//	public boolean equals(Object obj) {
//		if (!(obj instanceof A)) return false;
//		return value == ((A)obj).value;
//	}
	A(int value) {
		this.value = value;
	}
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A	a = new A(10);
		A	b = new A(10);
		System.out.println(a.equals(b));
	}
}
