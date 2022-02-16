/* this program does the calculation for a monthly
car payment.
including:
- car loan amount
- interest rate of the loan
- length of the loan in years
- down payment*/
//Brandon Eddy 2021

public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

	if (loanLength <= 0 || interestRate <= 0) {
    System.out.println("Error! You fucking must take out a valid car loan broke bitch");
  } 

  else if (downPayment >= carLoan) {
    System.out.println("You are rich buy the car cash money.");
  } 

  else {
    int remainingBalance = carLoan - downPayment;
    int months = loanLength * 12;
    int monthlyBalance = remainingBalance / months;
    int interest = monthlyBalance * interestRate / 100;
    int monthlyPayment = monthlyBalance + interest;
    System.out.println(monthlyPayment);
  }

	}
}