abstract class Unit {
	int	x, y;
	abstract void	move(int x, int y);
	void	Stop() {System.out.println("stop");}
}

interface Fightable {
	public void	move(int x, int y);
	public void attack(Fightable f);
}

class	Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"] move");
	}
	public void attack(Fightable f) {
		System.out.println(f+" attack");
	}
}

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Fighter	f = new Fighter();
			f.move(100, 200);
			f.attack(new Fighter());
			f.attack(new Fighter());
			f.Stop();
			Fightable f2 = new Fighter();
			f2.move(200, 400);
			f2.attack(new Fighter());
	}

}
