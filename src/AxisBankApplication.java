import java.util.Scanner;

public class AxisBankApplication {
	static int balance = 0;
	static Scanner Sc1 = new Scanner(System.in);

	public static void main(String[] args) {

		int menu;

		System.out.println(" 1. Print balance");
		System.out.println(" 2. Deposit");
		System.out.println(" 3. Withdraw");
		System.out.println(" 4. Do you want to exit from the application??");
		boolean quit = false;
		do {
			System.out.print("Please enter your choice: ");
			menu = Sc1.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Your Total Balance in your Account is Rs" + balance);
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				quit = true;
				break;
			}
		} while (!quit);
	}

	public static void deposit() {
		int depositAmount;
		System.out.println("Enter an amount to deposit:");
		depositAmount = Sc1.nextInt();
		if (depositAmount < 0) {
			System.out.print("Invalid Amount!");
		}
		balance = balance + depositAmount;
		System.out.println("Total New Updated Balance in your Account is Rs " + balance);
	}

	public static int withdraw() {
		int withdrawAmount;
		System.out.println("Your Current Balance in Account is Rs " + balance);
		System.out.println("Enter amount to withdraw: ");
		withdrawAmount = Sc1.nextInt();
		if (withdrawAmount > balance) {
			System.out.println("You do not have a sufficient balance to withdraw this amount!");
			// return withdrawAmount;
		}
		if (withdrawAmount < 0) {
			System.out.println("Invalid Amount!");
			// return 1;
		}
		balance = balance - withdrawAmount;
		System.out.println("Total Remaining Balance in your Account is Rs " + balance);
		return withdrawAmount;

	}

}
