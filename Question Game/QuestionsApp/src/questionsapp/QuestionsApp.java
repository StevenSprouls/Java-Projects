package questionsapp;

import java.util.Scanner;
import java.util.ArrayList;

public class QuestionsApp {

    public static int score;
    
    public static void main(String[] args) {

      FillInQuestion first = new FillInQuestion();
      first.setText("The inventor of Java was _James Gosling_");
      first.setAnswer("James Gosling");
      
      FillInQuestion second = new FillInQuestion();
      second.setText("The CS136 professor is _Mohamed Elwakil_");
      second.setAnswer("Mohamed Elwakil");

      NumericQuestion third = new NumericQuestion();
      third.setText ("What is the value of pi to the nearest thousandth?");
      third.setAnswer ((float) 3.141);
      
      NumericQuestion fourth = new NumericQuestion();
      fourth.setText ("What is the value of the variable in 'e' in math to the 3rd decimal?");
      fourth.setAnswer ((float) 2.718);
      
      AnyCorrectChoiceQuestion fifth = new AnyCorrectChoiceQuestion();
      fifth.setText("The inventor of Python lived in:\n 1. Australia \n 2. The Netherlands \n 3. Denmark \n 4. United States \n there may be several correct answers.");
      fifth.setAnswer("2 4");
      
              
      AnyCorrectChoiceQuestion sixth = new AnyCorrectChoiceQuestion();
      sixth.setText("Mohamed Elwakil has lived in:\n 1. Egypt \n 2. Canada \n 3. Scotland \n 4. United States \n 5. France \n there may be several correct answers.");
      sixth.setAnswer("1 3 4");
      
      ChoiceQuestion seventh = new ChoiceQuestion();
      seventh.setText("In which country was the inventor of Java born?");
      seventh.addChoice("Australia", false);
      seventh.addChoice("Canada", true);
      seventh.addChoice("Denmark", false);
      seventh.addChoice("United States", false);

      
      ArrayList<Question>questions = new ArrayList<>();
      questions.add(first);
      questions.add(second);
      questions.add(third);
      questions.add(fourth);
      questions.add(fifth);
      questions.add(sixth);
      questions.add(seventh);
      
      
      questions.forEach((question) -> {
          presentQuestion(question);
        });

        System.out.println("Your score is: " + QuestionsApp.score);

    }
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
