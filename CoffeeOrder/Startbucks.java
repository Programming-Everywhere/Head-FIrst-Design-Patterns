
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

		Beverage latte1 = new Latte();
		//latte1.setSize(Size.VENTI);
		latte1 = new Mocha(latte1);
		latte1 = new Mocha(latte1);
		latte1 = new Soy(latte1);
		latte1 = new Whip(latte1);
		System.out.println(latte1.getDescription() + " $" + latte1.cost());

	}
}