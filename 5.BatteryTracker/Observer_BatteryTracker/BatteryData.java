import java.util.*;
class BatteryData implements Subject {
	/**
用继承主要一个不是为了省代码，试想一下，假如observer pattern里面，一个event需要通知好几个observer怎么办
所以把每个需要notify的东西 定义成一个共有的observer interface，你就可以用个for loop 触发每个observer
而且触发的部分不需要知道每个observer怎么工作的，只要call对function就行

	*/
	double batteryPercentage;
	// boolean hasDisplay;

	ArrayList<Observer> observerList;

	public BatteryData() {
		observerList = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}
	@Override
	public void unregisterObserver(Observer o) {
		observerList.remove(observerList.indexOf(o));
	}
	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observerList.iterator();
		while(it.hasNext()) {
			Observer o = it.next();
			o.update(batteryPercentage);
		}
	}
	private double getBattery() {
		return 0.50;
	}
	public void dataChanged(){
		batteryPercentage = getBattery();

		notifyObservers();
	}

}