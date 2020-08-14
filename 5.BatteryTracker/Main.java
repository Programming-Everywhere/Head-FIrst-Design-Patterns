class Main {
	public static void main(String[] args) {
		Echo echo = new Echo();
		EchoDot echoDot = new EchoDot();

		BatteryData data = new BatteryData(echoDot, echo);
		data.dataChanged();
	}
}