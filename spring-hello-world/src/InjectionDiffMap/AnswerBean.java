package InjectionDiffMap;

import java.util.Date;

public class AnswerBean {

private String answer;
private Date DatePosted;

    public AnswerBean()
    {}
    public AnswerBean(String answer, Date DatePosted) {
        super();
        this.answer = answer;
        this.DatePosted = DatePosted;
    }

    
    @Override
    public String toString() {
        return "AnswerBean{" + "answer=" + answer + ", DatePosted=" + DatePosted + '}';
    }

//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
//
//    public void setDatePosted(Date DatePosted) {
//        this.DatePosted = DatePosted;
//    }

   
    
}
