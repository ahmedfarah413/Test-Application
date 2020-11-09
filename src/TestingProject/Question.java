package TestingProject;

public class Question {
    private String question;
    private String rightAnswer;
    private String[] wrongAnswers;   // Minimum of 3 
    
    public Question(String question , String rightAnswer, String[] wrongAnswers) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.wrongAnswers = new String[wrongAnswers.length];
        for(int i =0; i < wrongAnswers.length; i++) {
            this.wrongAnswers[i] = wrongAnswers[i];
            
        }
    }
    // getters and setters
    
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getRightAnswer() {
        return rightAnswer;
    }
    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    public String[] getWrongAnswers() {
        return wrongAnswers;
    }
    public void setWrongAnswers(String[] wrongAnswers) {
        
    }
    
}
