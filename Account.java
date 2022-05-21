public abstract class Account {
    private String name;
    private String accountType;

    //Need to implement a primary key 'Name' usage
    abstract boolean isSavings();
    abstract boolean isStudent();
    abstract boolean isFixedDeposit();
    abstract boolean isLoanAccount();

    abstract void deposit();

    abstract void withdraw();

    abstract void requestLoan();

    abstract void query();
}

class Savings extends Account{
    private int deposit;

    @Override
    boolean isSavings() {
        return true;
    }

    @Override
    boolean isStudent() {
        return false;
    }

    @Override
    boolean isFixedDeposit() {
        return false;
    }

    @Override
    boolean isLoanAccount() {
        return false;
    }

    @Override
    void deposit() {

    }

    @Override
    void withdraw() {

    }

    @Override
    void requestLoan() {

    }

    @Override
    void query() {

    }
}

class StudentAccount extends Account{
    private int deposit;

    @Override
    boolean isSavings() {
        return false;
    }

    @Override
    boolean isStudent() {
        return true;
    }

    @Override
    boolean isFixedDeposit() {
        return false;
    }

    @Override
    boolean isLoanAccount() {
        return false;
    }

    @Override
    void deposit() {

    }

    @Override
    void withdraw() {

    }

    @Override
    void requestLoan() {

    }

    @Override
    void query() {

    }
}

class FixedDeposit extends Account{
    private int deposit;

    @Override
    boolean isSavings() {
        return false;
    }

    @Override
    boolean isStudent() {
        return false;
    }

    @Override
    boolean isFixedDeposit() {
        return true;
    }

    @Override
    boolean isLoanAccount() {
        return false;
    }

    @Override
    void deposit() {

    }

    @Override
    void withdraw() {

    }

    @Override
    void requestLoan() {

    }

    @Override
    void query() {

    }
}

class LoanAccount extends Account{
    private int loanAmount;

    @Override
    boolean isSavings() {
        return false;
    }

    @Override
    boolean isStudent() {
        return false;
    }

    @Override
    boolean isFixedDeposit() {
        return false;
    }

    @Override
    boolean isLoanAccount() {
        return true;
    }

    @Override
    void deposit() {

    }

    @Override
    void withdraw() {

    }

    @Override
    void requestLoan() {

    }

    @Override
    void query() {

    }
}
