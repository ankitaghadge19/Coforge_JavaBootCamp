package SpringJDBC.Models;

public class Employee {
    private Integer pincode	;
    private String empname;
    private Integer eid;

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
    public Integer getPincode() {
        return pincode;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEid(Integer eid) {
        this.eid = eid;
    }
    public Integer getEid() {
        return eid;
    }
}
