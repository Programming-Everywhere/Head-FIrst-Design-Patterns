class Main {
	public static void main(String[] args) {
		EchoDot echodot  = new EchoDot();
		EchoShow echoshow = new EchoShow();

		BatteryData battery = new BatteryData();
		battery.registerObserver(echodot);
		battery.registerObserver(echoshow);

		battery.dataChanged();
		System.out.println();
		battery.unregisterObserver(echodot);
		battery.dataChanged();
	}
}