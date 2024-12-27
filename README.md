# Quiz Management System

Welcome to the Quiz Management System repository! This project is a robust Java-based application for managing quizzes, questions, and answers with advanced functionalities such as editing, deleting, and rephrasing both questions and answers. It is designed for creating dynamic and interactive quizzes for educational or entertainment purposes.

---

## Features

### General Features
- **Interactive Menu**:
  - A command-line menu allows users to navigate through various options effortlessly.
  - Options to show questions, answers, and manage content dynamically.
- **Question and Answer Management**:
  - Add, edit, delete, and rephrase questions and answers.
  - Supports associating multiple answers with each question.
- **Validation**:
  - Checks for duplicate answers to maintain consistency.
  - Ensures at least one correct answer is always present.
- **Dynamic Question Order**:
  - Automatically adjusts answer order to ensure logical consistency.

### Question Features
- **Rephrase Questions**:
  - Modify question text easily while preserving associated answers.
- **Delete Questions**:
  - Remove a question and all its associated answers in one operation.
- **Dynamic Answer Adjustment**:
  - Automatically reorganizes answers to ensure consistency.

### Answer Features
- **Rephrase Answers**:
  - Modify answer text without affecting question associations.
- **Answer Validation**:
  - Prevents duplicate answers from being added.
- **Delete Answers**:
  - Remove individual answers while ensuring logical consistency of correct and incorrect answers.

### Interactive Quiz Creation
- **Test Creation**:
  - Dynamically create quizzes by selecting questions and answers.
  - Validate quiz integrity before starting.

---

## Project Structure

### Classes
- **`program`**:
  - Entry point for the application.
  - Manages the interactive menu and user input handling.
- **`Questions`**:
  - Represents a single question.
  - Manages associated answers and ensures consistency.
- **`Answers`**:
  - Represents a single answer with unique text.
  - Tracks the number of answers globally for reference.
- **`ansCheck`**:
  - Links answers to questions with a boolean value indicating correctness.

### Key Methods
#### In `program`:
- **`prinAllAns`**: Prints all available answers.
- **`printOnlyQuestions`**: Displays all questions without associated answers.
- **`addAnwer`**: Adds an answer to a specific question.

#### In `Questions`:
- **`addNewAnswer`**: Adds a new answer to a question and returns updated answer list.
- **`removeAns1`**: Deletes a specific answer from a question.
- **`deleteQuestion`**: Deletes a question and all associated answers.
- **`qOrder`**: Ensures logical consistency by adjusting answers' true/false states dynamically.

#### In `Answers`:
- **`deleteans`**: Deletes the answer text and decrements the global counter.

---

## How to Use

### Prerequisites
- **Java 8 or above** installed on your system.

### Running the Program
1. Clone the repository.
2. Compile the project using the following command:
   ```bash
   javac ArielHalevy_UriBarzilay/*.java
   ```
3. Run the program:
   ```bash
   java ArielHalevy_UriBarzilay.program
   ```

### Interactive Menu Options
1. **Show all questions and their answers**: Displays the full list of questions and their associated answers.
2. **Show all answers**: Lists all answers independently.
3. **Add answer**: Add a new answer to a selected question.
4. **Rephrase the question**: Modify the text of an existing question.
5. **Rephrase answer**: Modify the text of an existing answer.
6. **Remove answer from question**: Delete an answer associated with a question.
7. **Delete question and remove all its answers**: Completely remove a question and its associated answers.
8. **Delete answer**: Remove an answer from the global answer pool.
9. **Delete question and delete all its answers**: Same as option 7.
10. **Create a test**: Select questions to dynamically build a test.
11. **Exit**: Exit the program.

---

## Future Enhancements
- **Graphical User Interface (GUI)**:
  - Replace the command-line interface with a more user-friendly GUI.
- **Persistent Storage**:
  - Store questions and answers in a database or external file for long-term access.
- **Quiz Scoring System**:
  - Add functionality to evaluate quizzes and provide scores.
- **Randomized Tests**:
  - Enable random question selection for dynamic quizzes.

---


## Contributors
- **Ariel Halevy**: Design and development.
- **Uri Barzilay**: Design and development.

---

## Acknowledgments
Special thanks to programming communities and educational resources for inspiring the development of this project.

