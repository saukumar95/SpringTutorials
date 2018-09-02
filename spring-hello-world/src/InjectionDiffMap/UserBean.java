package InjectionDiffMap;

public class UserBean {
    
    private String name;
    private String email;

    public UserBean()
    {}
    public UserBean(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }
    

    @Override
    public String toString() {
        return "UserBean{" + "name=" + name + ", email=" + email + '}';
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
////    }
    
    
}
