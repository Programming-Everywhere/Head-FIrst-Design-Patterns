class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new ChessePizza();
		}
		else if(type.equals("pepperni")) {
			pizza = new PeppernoniPizza();
		}
		else if(type.equals("calm")) {
			pizza = new CalmPizza();
		}
		else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}