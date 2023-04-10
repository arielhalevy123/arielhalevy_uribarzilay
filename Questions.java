package ArielHalevy_UriBarzilay;

import java.util.Arrays;

public class Questions {
	private String qtext;
	private static int counter=1;
	private ansCheck[] answers=new ansCheck [10];
	private int ansCount=2;
	
	
	public Questions(String qtext) {
		super();
		this.qtext = qtext;
		counter++;
		answers[0]=new ansCheck((new Answers("More than one answer is correct")),false);
		answers[1]=new ansCheck((new Answers("None of the question are correct")),true);
	}
	public String getQtext() {
		return qtext;
	}
	public void setQtext(String qtext) {
		this.qtext = qtext;
	}
	public static int getCounter() {
		return counter;
	}
	
	public  int getAnscount() {
		return ansCount;
	}
	public boolean addAnsCheck(ansCheck aC) {
		if (ansCount >= 10) {
			return false;
		} else {
		answers[ansCount] = aC;
		ansCount++;
		qOrder();
		return true;
		}
	}

	public String toString() {
		String str = qtext + "\n";
		for (int i = 0; i < ansCount; i++) {
			str += "    "+(i+1) + ") " + answers[i].toString() + "\n";
		}
		return str;
	}
		public Answers[] addNewAnswer(String aText, boolean check, Answers[] totAns) {
		if (ansCount >= 10) {
			return totAns;
		} else {
			Answers a1 = new Answers(aText);
			ansCheck aC = new ansCheck(a1, check);
			addAnsCheck(aC);
			Answers[] totAns1 = new Answers[totAns.length + 1];
			for (int i = 0; i < totAns.length; i++) {
				totAns1[i] = totAns[i];
			}
			totAns1[totAns.length] = a1;
			
			qOrder();
			return totAns1;
		}
	}
		public boolean removeAns1(int numOfAns) {
			if((numOfAns+1)>ansCount) {
				return false;
			}
			else {
				if(numOfAns+1<ansCount) {
				answers[numOfAns].removeAns();
				answers[numOfAns]=answers[ansCount-1];
				answers[ansCount-1].removeAns();
				ansCount--;
				qOrder();
			return true;
				}else {
			if(numOfAns+1==ansCount) {
				answers[numOfAns].removeAns();
				ansCount--;
				qOrder();
				return true;
			       }
				}
			}
			return false;
		}
		public void qOrder () {
			int counter=0;
			
			for (int i=2;i<ansCount;i++) {
				if(answers[i].isTrue()) {
					counter++;
				}
			}
			if(counter==0) {
				answers[1].setTrue();
				answers[0].setFalse();
			}
			if(counter>1) {
				answers[1].setFalse();
				answers[0].setTrue();
				
			}if(counter==1) {
				answers[1].setFalse();
				answers[0].setFalse();
				
			}
			
		}
		public boolean deleteQuestion() {
			qtext=null;
			for(int i=ansCount-1;i>=0;i--) {
				removeAns1(i);
				
			}
			return true;
		}
		public  boolean ansIsExist(String ansText) {

			for (int i = 0; i < ansCount; i++) {
				if (ansText.equalsIgnoreCase(answers[i].getAnswer().getText())) {
					return true;
					
				}

			}
			return false;
		
		
		
		
		}

}

