package mappingcardi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Answer a = new Answer(1, "John");
        // Question q = new Question(1, "What is your name?", a);

        // session.save(q);
        // session.save(a);
        // tx.commit();

        // Question q = session.get(Question.class, 1);
        // System.out.println(q.getQuestion() + " " + q.getAnswer().getAnswer());

        List<Answer> listofanswers = new ArrayList();

        Question q = new Question();
        q.setQuestionid(1);
        q.setQuestion("What are your skills?");

        Answer a1 = new Answer(2, "JAVA", q);
        Answer a2 = new Answer(3, "PHP", q);
        listofanswers.add(a1);
        listofanswers.add(a2);

        q.setAnswer(listofanswers);

        session.save(a1);
        session.save(a2);
        session.save(q);

        tx.commit();

        session.close();
        factory.close();
    }
}
