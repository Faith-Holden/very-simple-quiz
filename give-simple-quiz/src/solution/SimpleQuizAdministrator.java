package solution;

import textio.TextIO;

public class SimpleQuizAdministrator {
    static int[] firstNums = new int[10];
    static int[] secondNums = new int[10];
    static int[] responses = new int[10];
    public static void main (String [] Args){
        administrateQuiz();
    }

    static void createQuiz(){
        int questionCoutner = 0;
        while (questionCoutner<10){
            firstNums[questionCoutner]=((int)(Math.random()*10));
            secondNums[questionCoutner]=((int)(Math.random()*10));
            questionCoutner++;
        }
    }

    static void administrateQuiz(){
        createQuiz();
        int questionCounter = 0;
        System.out.println("I'm going to give you a short quiz to test your basic addition skills. There will be 10 questions.");
        System.out.println("Here's your first question.");
        while(questionCounter<10){
            System.out.println("What is "+firstNums[questionCounter]+" + " +secondNums[questionCounter] + "?");
            responses[questionCounter]= TextIO.getlnInt();
            questionCounter++;
        }
        gradeQuiz();
    }

    static void gradeQuiz(){
        int questionCounter=0;
        int scoreCounter = 0;
        while (questionCounter<10){
            System.out.println("___________________________________________");
            if(responses[questionCounter]==(firstNums[questionCounter]+secondNums[questionCounter])){
                System.out.println("Your answer for question " + (questionCounter+1)+" was correct!");
                System.out.println("The question was:");
                System.out.println("What is "+firstNums[questionCounter]+" + " +secondNums[questionCounter] + "?");
                System.out.println("Your response was " + responses[questionCounter]+".");
                scoreCounter+=10;
            }else{
                System.out.println("Sorry, your response for question "+ (questionCounter+1)+" was incorrect.");
                System.out.println("The question was:");
                System.out.println("What is "+firstNums[questionCounter]+" + " +secondNums[questionCounter] + "?");
                System.out.println("Your response was " + responses[questionCounter]);
                System.out.println("The correct response was "+ (firstNums[questionCounter]+secondNums[questionCounter])+".");
            }
            questionCounter++;
        }
        System.out.println("___________________________________________");
        System.out.println("Your total score was "+ scoreCounter +".");

    }


}
