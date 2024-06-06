package OneToOne.Models;

import jakarta.persistence.*;

@Entity(name = "Account")
@Table(name = "ACCOUNT", uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer accountId;

    @Column(name = "ACCOUNT_NO", unique = true, nullable = false, length = 100)
    private String accountNo;

    @OneToOne(mappedBy = "account")
    private Employee employee;

    // Getters and Setters
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
