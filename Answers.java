package ArielHalevy_UriBarzilay;

public class Answers {
	private String aText;
	private static int ansCounter = 1;

	public Answers(String text) {
		this.aText = text;

		ansCounter++;

	}

	public int ansAmount() {
		return ansCounter;
	}

	public boolean deleteans() {
		this.aText = null;
		ansCounter--;
		return true;
	}

	public String getText() {
		return aText;
	}

	public boolean setText(String newatext) {
		this.aText = newatext;
		return true;
	}

	public String toString() {
		return aText;
	}

}
