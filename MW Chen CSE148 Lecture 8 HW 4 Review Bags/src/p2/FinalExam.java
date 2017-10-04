package p2;

public class FinalExam extends GradeActivity {
	private double grammar;
	private double spelling;
	private double length;
	private double content;

	private static final double GRAMMAR_WEIGHT = 0.3;
	private static final double SPELLING_WEIGHT = 0.2;
	private static final double LENGTH_WEIGHT = 0.2;
	private static final double CONTENT_WEIGHT = 0.3;

	public FinalExam(double grammar, double spelling, double length, double content) {
		super();
		this.grammar = grammar;
		this.spelling = spelling;
		this.length = length;
		this.content = content;
		setScore(grammar * GRAMMAR_WEIGHT + spelling * SPELLING_WEIGHT + length * LENGTH_WEIGHT
				+ content * CONTENT_WEIGHT);
	}

	@Override
	public String toString() {
		return "\tgrammar=" + grammar + ", spelling=" + spelling + ", length=" + length + ", content=" + content + "]";
	}

}
