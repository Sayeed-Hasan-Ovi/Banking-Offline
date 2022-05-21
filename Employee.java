public abstract class Employee {
    abstract boolean isCashier();
    abstract boolean isManagingDirector();
    abstract boolean isOfficer();

    public void lookup(){
        return;
    }

    //Could change to boolean return type to ensure if loan approved or not
    public void approveLoan(){
        return;
    }

    //Could change to boolean return type to ensure if loan approved or not
    public void changeInterestRate(){
        return;
    }

    public void seeInternalFund(){
        return;
    }
}

class Cashier extends Employee{
    @Override
    boolean isCashier() {
        return true;
    }

    @Override
    boolean isManagingDirector() {
        return false;
    }

    @Override
    boolean isOfficer() {
        return false;
    }
}

class ManagingDirector extends Employee{
    @Override
    boolean isCashier() {
        return false;
    }

    @Override
    boolean isManagingDirector() {
        return true;
    }

    @Override
    boolean isOfficer() {
        return false;
    }
}

class Officer extends Employee{
    @Override
    boolean isCashier() {
        return false;
    }

    @Override
    boolean isManagingDirector() {
        return false;
    }

    @Override
    boolean isOfficer() {
        return true;
    }
}
