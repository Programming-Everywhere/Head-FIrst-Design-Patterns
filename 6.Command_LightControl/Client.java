class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);

		invoker.setOnCommand(lightOnCommand, 0);
		invoker.setOffCommand(lightOffCommand, 1);

		invoker.onButtonPushed(0);
		invoker.offButtonPushed(1);
	}
}