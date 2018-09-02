package SetIndepedentCollection;

import java.util.Iterator;
import java.util.List;

public class QuestionClass 
{
   private int qno;
   private String question;
   private List<AnswerClass> answer;

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(List<AnswerClass> answer) {
        this.answer = answer;
    }
   
    public void show()
    {
        System.out.print("Question."+qno+":");
        System.out.println(question);
        Iterator it = answer.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
   
    
}
