class EchoShow implements Observer {
	private double battery;
	//private boolean hasScreen;
	public void update(double battery) {
		this.battery = battery;
		speak();
		display();
	}
	public void speak() {
		System.out.println("Your current battery percentage is: " + battery);
	}
	public void display() {
		System.out.println("Your current battery percentage is: " + battery);
	}
}