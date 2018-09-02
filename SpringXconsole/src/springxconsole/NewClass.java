package springxconsole;

abstract class iphone
{
    abstract void model();
     abstract void biometrictouch();
    
}

class iphone6 extends iphone
{
    
    void model()
    {
        System.out.println("iphone6");
    }

    @Override
    void biometrictouch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class iphone7 extends iphone
{
    void model()
    {
        System.out.println("iphone7");
    }

    @Override
    void biometrictouch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void call() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void message() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class NewClass 
{

    public static void main(String [] args)
    {
       iphone7 ip = new iphone7();
       ip.call();
       ip.message();
       ip.model();
    }
}
