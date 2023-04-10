package ArielHalevy_UriBarzilay;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		int qNum;
		char ch;
		Answers[] allAnswers = new Answers[4];
		allAnswers[0] = new Answers("Neil Armstrong");// correct
		allAnswers[1] = new Answers("Buzz Aldrin");
		allAnswers[2] = new Answers("Yuri Gagarin");
		allAnswers[3] = new Answers("Alan Shepard");
		Questions[] allQuestions = new Questions[7];

		Questions q1 = new Questions("What is the capital of France?");
		allAnswers = q1.addNewAnswer("London", true, allAnswers);
		allAnswers = q1.addNewAnswer("Berlin", false, allAnswers);
		allAnswers = q1.addNewAnswer("Paris", true, allAnswers);
		allAnswers = q1.addNewAnswer("Madrid", false, allAnswers);

		Questions q2 = new Questions("Who is the main character in the Harry Potter series?");

		allAnswers = q2.addNewAnswer("Hermione Granger", false, allAnswers);
		allAnswers = q2.addNewAnswer("Ron Weasley", false, allAnswers);
		allAnswers = q2.addNewAnswer("Paris", false, allAnswers);
		allAnswers = q2.addNewAnswer("Harry Potter", false, allAnswers);

		Questions q3 = new Questions("Which planet is closest to the sun?");

		allAnswers = q3.addNewAnswer("Venus", false, allAnswers);
		allAnswers = q3.addNewAnswer("Mars", false, allAnswers);
		allAnswers = q3.addNewAnswer("Mercury", true, allAnswers);
		allAnswers = q3.addNewAnswer("Saturn", false, allAnswers);

		Questions q4 = new Questions("Who was the first person to walk on the moon?");

		Answers a4_1 = new Answers("Neil Armstrong");// correct
		Answers a4_2 = new Answers("Buzz Aldrin");
		Answers a4_3 = new Answers("Yuri Gagarin");
		Answers a4_4 = new Answers("Alan Shepard");

		Questions q5 = new Questions("What is the largest continent in the world?");
		Answers a5_1 = new Answers("North America");
		Answers a5_2 = new Answers("South America");
		Answers a5_3 = new Answers("Europe");
		Answers a5_4 = new Answers("Asia");// correct

		Questions q6 = new Questions("In what year did World War II end?");
		Answers a6_1 = new Answers("1945");// correct
		Answers a6_2 = new Answers("1950");
		Answers a6_3 = new Answers("1939");
		Answers a6_4 = new Answers("2000");

		Questions q7 = new Questions("What is the largest animal on earth?");
		Answers a7_1 = new Answers("Elephant");
		Answers a7_2 = new Answers("Blue Whale");// correct
		Answers a7_3 = new Answers("Hippotamus");
		Answers a7_4 = new Answers("Girrafe");

		allQuestions[0] = q1;
		allQuestions[1] = q2;
		allQuestions[2] = q3;
		allQuestions[3] = q4;
		allQuestions[4] = q5;
		allQuestions[5] = q6;
		allQuestions[6] = q7;

		Scanner s = new Scanner(System.in);
		int num = 0;
		while (num != 11) {
			System.out.println("Welcome to Ariel & Uri homework: ");
			System.out.println("1) Show all questions and thier answers");
			System.out.println("2) Show all answers");
			System.out.println("3) Add answer");
			System.out.println("4) Rephrase the question");
			System.out.println("5) Rephrase answer");
			System.out.println("6) Remove answer from question");
			System.out.println("7) Delete question and remove all of her answers");
			System.out.println("8) Delete answer");
			System.out.println("9) Delete question and delete all of her answers");
			System.out.println("10) Create a test");
			System.out.println("11) EXIT");
			num = s.nextInt();
			switch (num) {
			case 1:
				for (int i = 0; i < allQuestions.length; i++)
					System.out.println((i + 1) + ") " + allQuestions[i].toString());
				break;
			case 2:
				prinAllAns(allAnswers);
				break;
			case 3:

				allAnswers = addAnwer(allQuestions, allAnswers);
				break;

			case 4:
				printOnlyQuestions(allQuestions);
				qNum = 0;
				ch = 'N';
				while ((ch != 'y') && (ch != 'Y')) {
					System.out.println("Enter question number:");
					qNum = s.nextInt();
					System.out.println(allQuestions[qNum - 1].toString() + "\n" + "is this the question?(y/n)");
					ch = s.next().charAt(0);
				}
				String newQText;

				System.out.println("Rephrase the question");
				s.nextLine();
				newQText = s.nextLine();
				allQuestions[qNum - 1].setQtext(newQText);

				break;
			case 5:
				prinAllAns(allAnswers);
				int aNum = 0;
				ch = 'N';
				while ((ch != 'y') && (ch != 'Y')) {
					System.out.println("Enter answer number?");
					aNum = s.nextInt();
					System.out.println(allAnswers[aNum - 1].toString() + "\n" + "Is this the answer?(y/n)");
					ch = s.next().charAt(0);
				}
				String newAText;

				System.out.println("Rephrase the answer");
				s.nextLine();
				newAText = s.nextLine();
				allAnswers[aNum - 1].setText(newAText);

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;

			default:
				System.out.println("Invalid number- please try again");
				break;
			}
		}
		System.out.println("Good bye");

	}

	public static void prinAllAns(Answers[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ") " + arr[i].toString());
		}

	}

	public static void printOnlyQuestions(Questions[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ") " + arr[i].getQtext());
		}
	}

	public static Answers[] addAnwer(Questions[] allQuestions, Answers[] allAnswers) {
		Scanner s = new Scanner(System.in);
		int qNum = 0;
		char ch = 'N';
		while ((ch != 'y') && (ch != 'Y')) {
			if (ch == 'n' || ch == 'N') {
				do {
					System.out.println("Enter question number?");
					qNum = s.nextInt();
					if ((qNum - 1 > allQuestions.length) || (qNum - 1 < 0)) {
						System.out.println("INVALID OPTIONS- Try again (y/n)");
					}
				} while ((qNum - 1 > allQuestions.length) || (qNum - 1 < 0));

				System.out.println(allQuestions[qNum - 1].toString() + "\n" + "Is this the question?(y/n)");
				ch = s.next().charAt(0);
			} else {

				System.out.println("INVALID OPTIONS- Try again (y/n)");
				ch = s.next().charAt(0);
			}

		}
		String newAns;
		boolean right;
		System.out.println("Enter new answer");
		newAns = s.next();
		boolean res = allQuestions[qNum - 1].ansIsExist(newAns);
		if (res) {
			System.out.println("Your new answer is exist already");
		} else {

			int ansIndex = ansIsExistIndex(newAns, allAnswers);
			if (ansIndex == -1) {
				System.out.println("Enter true or false");
				right = s.nextBoolean();
				allAnswers = allQuestions[qNum - 1].addNewAnswer(newAns, right, allAnswers);

			} else {
				System.out.println("Enter true or false");
				right = s.nextBoolean();
				ansCheck ans = new ansCheck(allAnswers[ansIndex], right);
				allQuestions[qNum - 1].addAnsCheck(ans);
			}

		}
		return allAnswers;

	}

	public static int ansIsExistIndex(String ansText, Answers[] allAnswers) {

		for (int i = 0; i < allAnswers.length; i++) {
			if (ansText.equalsIgnoreCase(allAnswers[i].getText())) {
				return i;

			}

		}
		return -1;
	}
}
