import java.util.*;
class CricketData implements Subject {
	int runs;
	int wickets;
	float overs;
	ArrayList<Observer> observerList;

	public CricketData() {
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
			o.update(runs, wickets, overs);
		}
	}
	private int getLatestRuns() {
		return 30;
	}
	private int getLatestWickets() {
		return 2;
	}
	private float getLatestOveres() {
		return (float)10.2;
	}
	public void dataChanged(){
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOveres();

		notifyObservers();
	}
}