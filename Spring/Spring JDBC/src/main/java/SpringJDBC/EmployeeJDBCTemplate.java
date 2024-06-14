package SpringJDBC;

import java.util.List;
import javax.sql.DataSource;

import SpringJDBC.Models.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String empname, Integer pincode) {
        String SQL = "insert into Employee (empname, pincode) values (?, ?)";
        jdbcTemplateObject.update(SQL, empname, pincode);
        System.out.println("Created Data with Name = " + empname + " Pincode = " + pincode);
    }

    public Employee getEmployee(Integer SID) {
        String SQL = "select * from Employee where EID = ?";
        Employee emp = jdbcTemplateObject.queryForObject(SQL, new Object[]{SID}, new EmployeeMapper());
        return emp;
    }

    public List<Employee> listEmployees() {
        String SQL = "select EID, EMPNAME, PINCODE from Employee";
        List<Employee> employees = jdbcTemplateObject.query(SQL, new EmployeeMapper());
        return employees;
    }

    public void delete(Integer EID) {
        String SQL = "delete from Employee where EID = ?";
        jdbcTemplateObject.update(SQL, EID);
        System.out.println("Deleted Data with ID = " + EID);
    }

    public void update(Integer EID, Integer pincode) {
        String SQL = "update Employee set pincode = ? where EID = ?";
        jdbcTemplateObject.update(SQL, pincode, EID);
        System.out.println("Updated Data with ID = " + EID);
    }
}
