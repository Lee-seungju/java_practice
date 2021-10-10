class	Card {
	int	kind;
	char	c;
	
	Card() {
		kind = 1;
		c = 'a';
	}
	public String toString() {
		return "kind : " + kind + " c : " + c;
	}
}
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card	card = new Card();
		System.out.println(card.toString());
	}

}
