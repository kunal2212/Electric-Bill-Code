import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kunal
 *
 */
public class CalculateElectricity {
	static long unit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc1 = new Scanner(System.in);
		System.out.println("Enter the number of Units:");
		unit = Sc1.nextLong();
		double UserBillPayAmount = 0;
		if (unit <= 100) {
			UserBillPayAmount = unit * 1;
		}

		else if (unit <= 300) {
			UserBillPayAmount = 100 + (unit * 2);
		} else if (unit > 500) {
			UserBillPayAmount = 500 + (unit * 3);
		}

		System.out.println("User Has TO Pay The Bill for Unit: " + UserBillPayAmount);

	}
}
