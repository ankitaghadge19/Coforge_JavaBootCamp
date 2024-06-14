package SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import SpringJDBC.Models.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setEid(rs.getInt("eid"));
        emp.setEmpname(rs.getString("empname"));
        emp.setPincode(rs.getInt("pincode"));
        return emp;
    }
}
