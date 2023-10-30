public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;

    private String email;

    private String phoneNumber;

    public Account(){

        this("56789", 100.0, "Default name", "Default address", "Default Phone");

        System.out.println("Empty constructor called");

    }

    public Account(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNumber){

        System.out.println("Account Constructor with Parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = customerEmail;
        phoneNumber = customerPhoneNumber;

    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){

        accountBalance += depositAmount;

        System.out.println("Total After Deposit is "+ accountBalance );

    }

    public void withdraw(double withDrawAmount){

        if(accountBalance - withDrawAmount < 0){

            System.out.println("With Draw Not allowed");
        }
        else System.out.println("Balance After With Draw "+ (accountBalance - withDrawAmount));

    }
}
