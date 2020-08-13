class EchoDot implements Observer {
	private double battery;
	//private boolean hasScreen;
	public void update(double battery) {
		this.battery = battery;
		speak();
	}
	public void speak() {
		System.out.println("Your current battery percentage is: " + battery);
	}

}