package ProblemSet_2c;

public class Module {
	private static final String NAME = "COM1027";

	// Two lab (20% each) and 1 course work(60% each) assessments
	private Assessment assessment1 = null;
	private Assessment assessment2 = null;
	private Assessment assessment3 = null;

	public Module(Assessment a1, Assessment a2, Assessment a3) {
		this.assessment1 = a1;
		this.assessment2 = a2;
		this.assessment3 = a3;
	}

	public double calculateAverage() {
		double percent1 = (this.assessment1.getMark() / 100) * 0.2;
		double percent2 = (this.assessment2.getMark() / 100) * 0.2;
		double percent3 = (this.assessment3.getMark() / 100) * 0.6;

		return (percent1 + percent2 + percent3) * 100;
	}

	@Override
	public String toString() {
		return NAME + " (" + this.calculateAverage() + "%)";
	}
}
