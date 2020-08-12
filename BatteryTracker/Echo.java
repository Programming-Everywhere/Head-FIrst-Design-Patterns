class Echo {
	private int currentBattery, fullBattery;
	private double rate;

	public void update(int currentBattery, int fullBattery, double rate) {
		this.currentBattery = currentBattery;
		this.fullBattery = fullBattery;
		this.rate = rate;
		speak();
		display();
	}
	public void speak() {
		System.out.println("Speak: Echo current battery rate is " + rate);
	}
	public void display() {
		System.out.println("Display: Echo current battery rate is " + rate);
	}
}