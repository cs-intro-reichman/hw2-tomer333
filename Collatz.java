// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String VorC = args[1];
		int myPrintNumber = 0;
		int row = 1;
		int step = 1;
		while (row <= seed) {
			myPrintNumber = row;
			while (myPrintNumber != 1 || step == 1) {
				if (VorC.equals("v")) {System.out.print(myPrintNumber+" ");}
				if (myPrintNumber%2==0) {myPrintNumber /=2;}
				else {myPrintNumber = myPrintNumber*3 + 1;}
				step++;
			}
			if (VorC.equals("v")) {System.out.println(myPrintNumber+" ("+step+")");}
			step = 1;
			row++;
		}
		System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
	}
}
