package TestingProject;

import java.util.Random;

public class Exam {
    private int fromQuestion;
    private int toQuestion;
    private int NUMBER_OF_QUESTIONS_FOR_EXAM = 5;
    private Question[]  allQuestions = new Question[NUMBER_OF_QUESTIONS_FOR_EXAM];
    private Question[] questionsSelected;
    
    public Exam(int fromQuestion , int toQuestion) {
        this.fromQuestion = fromQuestion;
        this.toQuestion = toQuestion;
        
        //Questions:
        allQuestions[0] = new Question("What is my first name?", "Ahmed",new String[]{"Abdi Hilib Ari" , "Farah Ciyaal Suuq", "Madaxburuus", "Gaar Dheere"});
        allQuestions[1] = new Question("What is my favorite color?", "Blue", new String[]{"Red" , "Green", "White", "Purple"});
        allQuestions[2] = new Question("What am I studying in college?" , "Computer Science", new String[]{"Business Administration", "Finance", "Physics", "Math"});
        allQuestions[3] = new Question("What is your favorite thing about college so far?" ,"Everything", new String[]{"Athletics" , "Studying", "Nothing at all", "I have never liked school"});
        allQuestions[4] = new Question("What is the one thing I'll remember from college? " ,"The whole experience", new String[] {"Meeting new people", "The professors", "Absolutely nothing", "I have never liked school"});
        
        ExtractQuestionsForExam();
        
    }
    public Question[] questionsForExam() {
        return questionsSelected;
    }
    public static int randomNumberRange(int min, int max) {
        Random rand = new Random();
        int randomNum;
        randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public void swapElementsInArrayRandomly(Question[] myArray) {
        for(int i = 0; i < myArray.length; i++) {
            int randNum1 = randomNumberRange (0, (myArray.length - 1)); 
            Random random = new Random();
            int randNum2 = random.nextInt(myArray.length);
            
            Question temp = myArray[randNum1];
            myArray[randNum1] = myArray[randNum2];
            myArray[randNum2] = temp;
           
        }
        }
    public Question[] ExtractQuestionsForExam() {
        questionsSelected = new Question[toQuestion - fromQuestion + 1];
        for(int i = (fromQuestion - 1), j = 0; i < toQuestion && j < questionsSelected.length; i++, j++) {
        questionsSelected[j] = new Question(allQuestions[i].getQuestion() , allQuestions[i].getRightAnswer(), allQuestions[i].getWrongAnswers());
    }
        swapElementsInArrayRandomly(questionsSelected);
        return questionsSelected;
    }
    }

