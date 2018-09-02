package InjectionDiffMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionBean {

    private int qno;
    private String question;
    private Map<AnswerBean,UserBean> answer;

    
    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(Map<AnswerBean,UserBean> answer) {
        this.answer = answer;
    }
    
    public void show()
    {
        System.out.print("Question."+getQno()+":");
        System.out.println(getQuestion());
        Set<Entry<AnswerBean,UserBean>> set = getAnswer().entrySet();   //to convert map to set interface and then iterate the values.
        Iterator<Entry<AnswerBean,UserBean>> it = set.iterator();  //iterate the entrySet
        while(it.hasNext())
        {
            Entry<AnswerBean,UserBean> entry = it.next(); // iterate until the value is true and store in the class objects
            AnswerBean ans = entry.getKey();  // store key of the answerbean
            UserBean user = entry.getValue(); //store values pf userbean
            
            System.out.println("Answer: "+ans);
            System.out.println("Posted By: "+user);
        }
    }

    public int getQno() {
        return qno;
    }

    public String getQuestion() {
        return question;
    }

    public Map<AnswerBean,UserBean> getAnswer() {
        return answer;
    }
}
