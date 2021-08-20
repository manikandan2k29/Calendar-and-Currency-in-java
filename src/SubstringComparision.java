
public class SubstringComparision {
    public static String getSmallestAndLargest(String s, int k) {
    	String seq = s.substring(0, k);
        String smallest = seq;
        String largest = seq;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i = 0; i < s.length()-k+1; i++) {
			seq = s.substring(i, (i+k));
        	if(seq.compareTo(smallest)<0) {
        		smallest = seq;
        	}
        	if(seq.compareTo(largest)>0) {
        		largest = seq;
        	}
		}
        
        return smallest + "\n" + largest;
    }

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		System.out.println(s.length());
		System.out.println(getSmallestAndLargest(s, k));
	}
}
