class Startbucks {
	public static void main(String[] args) {
		Beverage espresson = new Espresso();
		System.out.println(espresson.getDescription() + " $" + espresson.cost());

		Beverage latte0 = new Latte();
		System.out.println(latte0.getDescription() + " $" + latte0.cost());

		Beverage latte = new Latte();
		latte = new Mocha(latte);
		latte = new Mocha(latte);
		latte = new Soy(latte);
		latte = new Whip(latte);
		System.out.println(latte.getDescription() + " $" + latte.cost());

	}
}