package Account;

import java.util.ArrayList;
import java.util.List;

public class SavingAccount {

    private int accNo;                // Account number
    private String custName;          // Customer name
    private List<Integer> deposits;   // List of deposits

    public SavingAccount() {
        this.deposits = new ArrayList<>();
    }

    public SavingAccount(int accNo, String custName) {
        this.accNo = accNo;
        this.custName = custName;
        this.deposits = new ArrayList<>();
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

    public List<Integer> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Integer> deposits) {
        this.deposits = deposits;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.deposits.add(amount);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive!");
        }
    }
}