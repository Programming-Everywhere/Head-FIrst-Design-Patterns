class Main {
	public static void main(String[] args) {
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CricketData data = new CricketData(currentScoreDisplay, averageScoreDisplay);
		data.dataChanged();
	}
}