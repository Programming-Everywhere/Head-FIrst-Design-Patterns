class EchoDot {
	private int currentBattery, fullBattery;
	private double rate;

	public void update(int currentBattery, int fullBattery, double rate) {
		this.currentBattery = currentBattery;
		this.fullBattery = fullBattery;
		this.rate = rate;
		speak();
	}
	public void speak() {
		System.out.println("Speak: echoDot current battery rate is " + rate);
	}
}