class ForecastDisplay implements Observer, DisplayElement{
	private float currentPressure = 29.92f;
	private float lastPressure; 
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}
	public void display() {
		System.out.println("Forecast: ");
		if(currentPressure > lastPressure) {
			System.out.println("Improving wether on the way! ");
		}
		else if(currentPressure == lastPressure) {
			System.out.println("The same ");
		}
		else if(currentPressure < lastPressure) {
			System.out.println("Cooler ");
		}
	}
}