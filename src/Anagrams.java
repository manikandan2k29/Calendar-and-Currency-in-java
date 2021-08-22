

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
      b=b.toLowerCase();
      char[] A = a.toLowerCase().toCharArray();
      char[] B = b.toLowerCase().toCharArray();
      // you cant import java.util.Arrays in HackerRank so use this method
      java.util.Arrays.sort(A);
      java.util.Arrays.sort(B);
      
      boolean anagram = java.util.Arrays.equals(A,B);
      

      return anagram;
		}
    	
		
    	
    
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Manikandan";
		String b = "manikandan";
		System.out.println(isAnagram(a,b));
		
	}

}
