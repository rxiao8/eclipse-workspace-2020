import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Create question objects with the following attributes:
 * question
 * answer
 * three other options
 * feedback
 */
public class Question {

	public Question() {

	}

	private String question;
	private String correctAnswer;
	private String optionA;
	private String optionB;
	private String optionC;
	private String feedback;
	private String[] answerChoices = new String[] { "O", "O", "O", "O" };

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getAnswerChoices() {
		return Arrays.toString(answerChoices);
	}

//to sort the answer choices randomly in the array
	public void setAnswerChoices() {
		String[] arrayOptions = new String[] { correctAnswer, optionA, optionB, optionC };
		ArrayList<Integer> slots = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			slots.add(i);
		}
		Collections.shuffle(slots);
		System.out.println(slots.toString()); // everything here and up is guud

		// goal is to assign a random value from the slot's list, assign it the be the
		// value of the answer and choices

		for (int i = 0; i < 4; i++) {
			int position = slots.get(i);
			answerChoices[i] = arrayOptions[position];

		}

	}

	public static void main(String[] args) {
		Question one = new Question();
		one.setOptionA("you");
		one.setOptionB("succ");
		one.setOptionC("ass");
		one.setCorrectAnswer("Everybody kewl");
		one.setAnswerChoices();
		String answers = one.getAnswerChoices();
		System.out.println(answers);

	}

}
