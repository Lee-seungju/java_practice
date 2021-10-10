class Product {
	int	price;		// 제품가격
	int	bonusPoint;	// 보너스점수
}

class	Tv extends	Product {}
class	Computer extends	Product {}
class	Audio extends	Product {}

class	Buyer {	// 물건사는 사람
	int	money = 1000;	// 소유금액
	int	bonusPoint = 0;	// 보너스점수
//	void	buy(Tv t)
//	void	buy(Computer t)
//	void	buy(Audio t)
	void	buy(Product	p) {
		bonusPoint += p.bonusPoint;
	}
}

public class Buyman {

	public static void main(String[] args) {
		Buyer	b = new Buyer();
		
		Tv	tv = new Tv();
		Computer	com = new Computer();
		
		b.buy(tv);
		b.buy(com);
	}
}
