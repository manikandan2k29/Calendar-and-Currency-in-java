import java.util.Scanner;




public class StringReverse {
	
	
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	String A = scan.next();
	scan.close();
	StringBuilder B = new StringBuilder(A);
	String C = B.reverse().toString();
	System.out.println( A.equals(C)?"Yes":"No");
	

 }
}
