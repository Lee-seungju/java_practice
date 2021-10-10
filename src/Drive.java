class	Car {
	String	color;
	int	door;
	
	void	drive() {
		System.out.println("drive, Brrrr~");
	}
	void	stop() {
		System.out.println("stop!!!");
	}
}

class	FireEngine extends Car {	// 소방
	int	a;
	void	water() {	// 물을 뿌리는 기
		System.out.println("water!!!");
	}
}
public class Drive {
	public static void	main(String[] args) {
		
		Car	c = new Car();
		FireEngine	f2 = (FireEngine)c;
		f2.water();
	}
}
