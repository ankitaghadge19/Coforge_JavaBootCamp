package OneToManyUsingAnnotations.Account;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "saving_account")
public class SavingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accNo")
    private int accNo;

    @Column(name = "custName", nullable = false)
    private String custName;

    @OneToMany(mappedBy = "savingAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Deposit> deposits = new HashSet<>();

    public SavingAccount() {}

    public SavingAccount(int accNo, String custName) {
        this.accNo = accNo;
        this.custName = custName;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Set<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(Set<Deposit> deposits) {
        this.deposits = deposits;
    }

    public void addDeposit(Deposit deposit) {
        this.deposits.add(deposit);
        deposit.setSavingAccount(this);
    }
}
