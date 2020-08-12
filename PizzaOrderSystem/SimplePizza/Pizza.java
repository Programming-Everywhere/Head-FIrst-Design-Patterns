public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList<>();

	void prepare() {
		System.out.println("Preparing " + name);
	}
}