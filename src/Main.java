public class Main {
    public static void main(String[] args) {



//        Account acc = new Account("12345", 1000000, "Dileep", "dkessireddy@gmail.com", "850-567-3546");

        Account acc = new Account();

        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getAccountBalance());
//        acc.setAccountNumber("12345");
//        acc.setCustomerName("Dileep");
//        acc.setPhoneNumber("806-778-1122");
//        acc.setEmail("dkessireddy@gmail.com");

        acc.setAccountBalance(1000);

        acc.withdraw(10000);

        acc.deposit(100);

        acc.withdraw(100);

        acc.deposit(200);

        Account dileepAccount = new Account("Sandeep", "dxk13470@gmail.com", "806-773-9944");

        System.out.println("AccountNo: "+ dileepAccount.getAccountNumber() + " AccountBAL: "+ dileepAccount.getAccountBalance());


//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());


//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());
//











    }
}