import java.util.Scanner;
import java.util.regex.*;




public class PatternSyntaxChecker {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases>0) {
			String regex = in.nextLine();
			try {
			Pattern.compile(regex);
			System.out.println("Valid");
			}
			catch (PatternSyntaxException e) {
				// TODO: handle exception
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}
