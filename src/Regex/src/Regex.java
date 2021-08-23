import java.util.Scanner;

public class Regex {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		while (scan.hasNext()) {
			String IP = scan.next();
			System.out.println(IP.matches(new MyRegex().pattern));
			
		}
	}
}
