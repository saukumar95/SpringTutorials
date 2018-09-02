package SetDependentObject;

public class StudentBean {

    private int id;
    private String name;
    private int age;
    private AddressBean address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }
    
    public void show()
    {
        System.out.println("id"+id+"\n"+"name"+name+"\n"+"age"+age+"\n"+"address"+address);
    }
    
}
