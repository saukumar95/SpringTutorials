package spring.jdbc;

public class EmployeeBean {

    private int pfid;
    private String ename;
    private int esalary;

    public EmployeeBean(){}
    
    public EmployeeBean(int pfid,String ename, int esalary)
    {
        this.pfid=pfid;
        this.ename=ename;
        this.esalary=esalary;
    }
    
    
    public void setPfid(int pfid) {
        this.pfid = pfid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }

    public int getPfid() {
        return pfid;
    }

    public String getEname() {
        return ename;
    }

    public int getEsalary() {
        return esalary;
    }
    
    
}
