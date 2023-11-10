package mappingcardi;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
// import javax.persistence.OneToOne;

@Entity
public class Question {
    @Id
    int questionid;
    String question;

    public Question(int questionid, String question, List<Answer> answer) {
        this.questionid = questionid;
        this.question = question;
        this.answer = answer;
    }

    public Question() {
    }

    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    // @Id
    // int questionid;
    // String question;

    // public Question(int questionid, String question, Answer answer) {
    // this.questionid = questionid;
    // this.question = question;
    // this.answer = answer;
    // }

    // public Question() {

    // }

    // @OneToOne
    // Answer answer;

    // public int getQuestionid() {
    // return questionid;
    // }

    // public void setQuestionid(int questionid) {
    // this.questionid = questionid;
    // }

    // public String getQuestion() {
    // return question;
    // }

    // public void setQuestion(String question) {
    // this.question = question;
    // }

    // public Answer getAnswer() {
    // return answer;
    // }

    // public void setAnswer(Answer answer) {
    // this.answer = answer;
    // }

}
