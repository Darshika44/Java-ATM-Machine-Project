import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {

    ATM atm = new ATM();

    // hash map for mini statement
    Map<Double, String> ministmt = new HashMap<>();

    public void viewBalance() {
        System.out.println("\nAvailable Balance is : " + atm.getBalance());
    }

    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("\n Insufficient Balance !!!");
            }
        } else {
            System.out.println("\n*** Please enter the amount in multiple of 500 ***");
        }
    }

    public void depositeAmount(double depositeAmount) {
        ministmt.put(depositeAmount, " Amount Deposited");
        System.out.println(depositeAmount + " Deposited Successfully");
        atm.setBalance(atm.getBalance() + depositeAmount);
        viewBalance();
    }

    public void viewMiniStatement() {
        for (Map.Entry<Double, String> m : ministmt.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
