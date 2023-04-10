package ArielHalevy_UriBarzilay;


public class ansCheck {
	private Answers answer;
	private boolean check;
	public ansCheck(Answers answer, boolean check) {
		super();
		this.answer=answer;
		this.check=check;
	}
	public Answers getAnswer() {
		return answer;
	}
	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	
	public boolean isTrue() {
		return check;
	}
	public void setFalse() {
		this.check = false;
	}
	public void setTrue() {
		this.check = true;
	}
	public boolean removeAns() {
		answer=null;
		check=false;
		return true;
	}
	
	public String toString() {
		return answer.toString()+" "+(check?" (true)":"(false)") ;
	}
	
	
	

}

