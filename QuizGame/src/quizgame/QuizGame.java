/*
 *  This is a small quiz game where a user is given 3 lifelines
 * for every wrong answer a lifeline is deduced,
 * game gets over on consumption of all life lines.
 * we make use of static method and variables here .
 */
package quizgame;

import java.util.Scanner;

public class QuizGame {

    static int lifeline = 3;                                //static variable to hold player's lifeline during lifetime of gameplay

    public static int getLifeline() {                       //returns currentlifline count
        return lifeline;
    }

    public static void setLifeline(int lifeline) {          // set playerlifeline to whatever passed
        QuizGame.lifeline = lifeline;
    }

    public static void main(String[] args) {
        int result;                                                             // result variable to store result of overall gameplay
        QuestionInventory kbc = new QuestionInventory();
        String answer[] = new String[3];                                        // string array to hold answer for each question asked
        Scanner scan = new Scanner(System.in);                                  // take user input using Scanner class

        for (int index = 0; index < 3; index++) {                               // for loop to ask questions and store user input
            System.out.print(kbc.getQuestion(index));
            answer[index] = scan.next();

            if (answer[index].equalsIgnoreCase(kbc.getAnswer(index))) {         // if user input match the index of  answer array declared in class ( case insensitive)
                setLifeline(QuizGame.lifeline);                                 // keep lifeline intact( as is)
            } else {                                                            // otherwise deduce by one 
                setLifeline(QuizGame.lifeline -= 1);

            }
        }
        result = QuizGame.getLifeline();                                          // finally store lifeline to result         
        if (result == 3) {                                                      // based on lifeline left figure out how fairly player played the game
            System.out.println("You got everything right, Kudos");
        } else if (result > 0 && result < 3) {
            System.out.println("Well, you got some right");
        } else {
            System.out.println("Hard Luck, Try Again");
        }

    }

}

class QuestionInventory extends QuizGame {

    String question[] = {"  Where did Rani Durgavati Die ?", "What is 2* 289347 ? ", "When will you die ?"};    // array variable to hold 3 Questions
    String answer[] = {"jabalpur", "578694", "noidea"};                                                         // array variable to hold 3 answers

    public String getQuestion(int index) {                                                                  // getter to get question at current index
        return question[index];
    }

    public String getAnswer(int index) {                                                                    //  getter to get answer at current index
        return answer[index];
    }

}
