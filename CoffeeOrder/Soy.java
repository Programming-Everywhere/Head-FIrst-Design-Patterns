
class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		double cost = beverage.cost();
		if(getSize() == Size.TALL) {
			cost += 0.1;
		}
		if(getSize() == Size.GRANDE) {
			cost += 0.15;
		}
		if(getSize() == Size.TALL) {
			cost += 0.20;
		}
		return cost;
	}
}