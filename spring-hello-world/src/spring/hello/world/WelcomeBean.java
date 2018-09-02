package spring.hello.world;

public class WelcomeBean {

    private int id;
    private String name;
    private String city;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void show() {
        System.out.print("Your ID: " + id + "\n" + "Your Name: " + name + "\n" + "Your City: " + city + "\n" + "Message: " + message);
    }

}
