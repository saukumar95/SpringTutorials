package springxconsole;

public class TopicService {

    Topic t;
    public void setTopic(Topic t)
    {
        this.t=t;
    }
    String askForTopic()
    {
        return t.getTopicName();
    }
}
