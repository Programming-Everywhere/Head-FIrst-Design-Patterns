class CricketData {
	int runs, wickets;
	float overs;
	CurrentScoreDisplay currentScoreDisplay;
	AverageScoreDisplay averageScoreDisplay;

	public CricketData(CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {
		this.currentScoreDisplay = currentScoreDisplay;
		this.averageScoreDisplay = averageScoreDisplay;
	}

	//get from stadium
	private int getLatestRuns() {
		return 90;
	}
	private int getLatestWickets() {
		return 2;
	}
	private float getLatestOvers() {
		return (float)10.2;
	}

	//我们定义一个方法
	public void dataChanged() {
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();

		currentScoreDisplay.update(runs, wickets, overs);
		averageScoreDisplay.update(runs, wickets, overs);
	}

}
