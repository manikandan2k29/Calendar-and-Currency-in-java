import java.util.Scanner;

public class StringTokens {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.

        if(s.length() > 0){
                           String[] arr = s.split("[ !,._'?\\@]+");

         System.out.println(arr.length);
        for(String n: arr){
          System.out.println(n);
          }
        }else{
          System.out.println(0);
        }
                scan.close();

    }
}
