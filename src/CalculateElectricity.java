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
		ElectricityBill("MHEP1", 6666, 3);
		ElectricityBill("MHEP2", 100, 55);
		ElectricityBill("MHEP3", 250, 120);

	}

	public static void ElectricityBill(String MeterName, int MonthEndUnit, int MonthStartUnit) {
		int unit = MonthEndUnit - MonthStartUnit;
		double UserBillPayAmount = 0;
		if (unit <= 100) {
			UserBillPayAmount = unit * 1;
		}

		else if (unit <= 300) {
			UserBillPayAmount = 100 + (unit * 2);
		} else if (unit > 500) {
			UserBillPayAmount = 500 + (unit * 3);
		}
		System.out.println("The total Bill for the"+ " "+ MeterName +" "+ "for" + " " + unit +" "+  "is"+" " + UserBillPayAmount);
	}

}
