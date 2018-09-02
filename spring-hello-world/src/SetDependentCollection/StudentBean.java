package SetDependentCollection;

import java.util.Iterator;
import java.util.List;

public class StudentBean {
    
    private int id;
    private String name;
    private List<String> subject;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public void show()
    {
        System.out.println("Your ID: "+id);
        System.out.println("Your Name: "+name);
        System.out.println("Your Subjects: ");
        Iterator<String> it = subject.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
    
    
}
