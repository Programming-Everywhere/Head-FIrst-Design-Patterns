/**
1. Have a class with BatteryData.
     Two devices: EchoDot, Echo 
2. EchoDot: Speak() 
3. Echo: Speak() + Display()
4.(optional) main class 
*/

class BatteryData {
	int currentBattery;
	int fullBattery;
	//double batterRate;

	EchoDot echoDot;
	Echo echo;
	public BatteryData(EchoDot echoDot, Echo echo) {
		this.echoDot = echoDot;
		this.echo = echo;
	}

	private int getCurrentBattery() {
		return 50;
	}
	private int getFullBattery() {
		return 100;
	}
	
	public void dataChanged() {
		currentBattery = getCurrentBattery();
		fullBattery = getFullBattery();

		echoDot.update(currentBattery, fullBattery, (double)currentBattery/fullBattery);
		echo.update(currentBattery, fullBattery, (double)currentBattery/fullBattery);
	}

}