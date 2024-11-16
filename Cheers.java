// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0].toUpperCase();
                int times = Integer.parseInt(args[1]);
                String cheer2 = cheer;
                String inputCheck = "AEFHILMNORSX";
                while (cheer.length() > 0) {
                        if (inputCheck.indexOf(cheer.charAt(0)) != -1) {System.out.println("Give me an "+cheer.charAt(0)+": "+cheer.charAt(0)+"!");}
                        else{System.out.println("Give me a  "+cheer.charAt(0)+": "+cheer.charAt(0)+"!");}
                        cheer = cheer.substring(1);
                }
                System.out.println("What does that spell?");
                while (times > 0) { System.out.println(cheer2+"!!!"); times--;}
        }
}
