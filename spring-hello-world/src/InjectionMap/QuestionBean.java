package InjectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionBean {

    private int qno;
    private String question;
    private Map<String, String> answer;

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(Map<String, String> answer) {
        this.answer = answer;
    }

    public void show() {
        System.out.print("Question." + qno + ":");
        System.out.println(question);
        Set<Entry<String, String>> set = answer.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();
        while (it.hasNext()) {
            Entry<String,String> entry = it.next();
            System.out.println("Answer: "+entry.getKey()+"\n"+"Posted By: "+entry.getValue());
        }
    }
}
