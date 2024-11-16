// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int terms = Integer.parseInt(args[0]);
		int num = 1;
		int mySign = 0;
		double myPi = 0;
		while(terms > 0){
			if (mySign%2==0) {myPi += 1/(double)num;}
			else{myPi -= 1/(double)num;}
			mySign++;
			num += 2;
			terms--;
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, aproximated:      "+myPi*(double)4);
	}
}
