class AverageScoreDisplay implements Observer {
	private float runRate;
	private int predictedScore;

	public void update(int runs, int wickets, float overs) {
		this.runRate = (float) runs / wickets;
		this.predictedScore = (int)(this.runRate * 50);
		display();
	}
	public void display() {
		System.out.println("---Average score display: \n" + "Run rate: " + 
			runRate + "\nPredictedScore: " + predictedScore );
	}
}