package spring.jdbc;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveEmployee(EmployeeBean e) {
        String query = "insert into employee values('" + e.getPfid() + "','" + e.getEname() + "','" + e.getEsalary() + "')";
        return jdbcTemplate.update(query);
    }
    public int updateEmployee(EmployeeBean e)
    {
        String query = "update employee set salary='"+e.getEsalary()+"'where id='"+e.getPfid()+"'";
        return jdbcTemplate.update(query);
    }
    
    public int deleteEmployee(EmployeeBean e)
    {
         String query = "delete from employee where id='"+e.getPfid()+"'";
         return jdbcTemplate.update(query);
    }
    
    public List<EmployeeBean> selectEmp(EmployeeBean e)
    {
        String query = "select * from employee where id='"+e.getEname()+"'";
        return jdbcTemplate.queryForList(query, EmployeeBean.class);
    }

}
