import java.util.*;
class TurkeyTestDrive {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt(5));
		System.out.println();
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);


		for(int i = 0; i < 10; i++) {
			System.out.println("Duck " + i +  " says: ");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}