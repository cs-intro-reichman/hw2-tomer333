public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours*60) + minutes + minutesToAdd;
        int newHours = (totalMinutes/60)%24;
        int newMinutes = totalMinutes-(totalMinutes/60)*60;
		String Sminutes;
		if (newMinutes < 10) {Sminutes = "0"+newMinutes;}
		else{Sminutes = ""+newMinutes;}
		if (newHours < 10) {System.out.print("0"+newHours+":"+Sminutes);}
		else {System.out.print(newHours+":"+Sminutes);}
    }
}
