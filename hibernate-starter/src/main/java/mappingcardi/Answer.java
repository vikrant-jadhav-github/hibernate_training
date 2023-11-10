package mappingcardi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
    // public Answer(int answerid, String answer) {
    // this.answerid = answerid;
    // this.answer = answer;
    // }

    public Answer() {

    }

    @Id
    int answerid;
    String answer;

    @ManyToOne
    private Question question;

    public Answer(int answerid, String answer, Question question) {
        this.answerid = answerid;
        this.answer = answer;
        this.question = question;
    }

    public int getAnswerid() {
        return answerid;
    }

    public void setAnswerid(int answerid) {
        this.answerid = answerid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    // public int getAnswerid() {
    // return answerid;
    // }

    // public void setAnswerid(int answerid) {
    // this.answerid = answerid;
    // }

    // public String getAnswer() {
    // return answer;
    // }

    // public void setAnswer(String answer) {
    // this.answer = answer;
    // }

}
