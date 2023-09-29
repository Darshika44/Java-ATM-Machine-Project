import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 54321;
        int atmpin = 789;
        System.out.println("\n!!! Welcome To ATM Machine !!!\n");
        System.out.print("Enter Your ATM Number : ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter Pin : ");
        int pin = sc.nextInt();

        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            System.out.println("\nValidation Done :)\n");
            while (true) {
                System.out.println(
                        "\n1. View Available Balance\n2. Withdraw Amount\n3. Deposite Amount\n4. View Mini Statement\n5. Exit");
                System.out.print("\nEnter Choice : ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    op.viewBalance();

                } else if (ch == 2) {
                    System.out.print("Enter Amount to be Withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (ch == 3) {
                    System.out.print("Enter Amount to Deposite : ");
                    double depositeAmount = sc.nextDouble();
                    op.depositeAmount(depositeAmount);

                } else if (ch == 4) {
                    op.viewMiniStatement();

                } else if (ch == 5) {
                    System.out.println("Collect Your ATM Card");
                    System.out.println("\n!!! Thank you for using ATM Machine !!!");
                } else {
                    System.out.println("Please enter correct choice");
                }
            }
        } else {
            System.out.println("Incorrect ATM Number or Pin !!");
            System.exit(0);
        }

        sc.close();
    }
}
