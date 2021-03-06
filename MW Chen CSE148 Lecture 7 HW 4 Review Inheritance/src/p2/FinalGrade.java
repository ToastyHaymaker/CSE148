package p2;

public class FinalGrade extends GradeActivity {
	private int numberOfQuestions;
	private int numberOfQuestionsMissed;
	private double grammarScore;
	private double spellingScore;
	private double lengthScore;
	private double contentScore;

	private static final double MIDTERM_WEIGHT = 0.4;
	private static final double FINAL_WEIGHT = 0.6;

	public FinalGrade(int numberOfQuestions, int numberOfQuestionsMissed, double grammarScore, double spellingScore,
			double lengthScore, double contentScore) {
		super();
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfQuestionsMissed = numberOfQuestionsMissed;
		this.grammarScore = grammarScore;
		this.spellingScore = spellingScore;
		this.lengthScore = lengthScore;
		this.contentScore = contentScore;
		MidTermExam midTermExam = new MidTermExam(numberOfQuestions, numberOfQuestionsMissed);
		double midTermScore = midTermExam.getScore();
		FinalExam finalExam = new FinalExam(grammarScore, spellingScore, lengthScore, contentScore);
		double finalScore = finalExam.getScore();

		double totalScore = midTermScore * MIDTERM_WEIGHT + finalScore * FINAL_WEIGHT;
		setScore(totalScore);
	}

}
