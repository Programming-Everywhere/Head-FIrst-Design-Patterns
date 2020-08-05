class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		testDuck(duck);

		WildTurkey turkey = new WildTurkey();

		turkey.gobble();
		turkey.fly();
		turkey.fight();
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}