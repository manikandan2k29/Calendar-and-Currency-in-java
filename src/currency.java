import java.text.NumberFormat;
import java.util.Locale;
public class currency {

	static void printCurrency(double dbl) {
		
		Locale india = new Locale("en","IN");
	NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US); 
	NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
	NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	NumberFormat ind = NumberFormat.getCurrencyInstance(india);
	
	System.out.println(ind.format(dbl));
	System.out.println(us.format(dbl));
	System.out.println(china.format(dbl));
	System.out.println(france.format(dbl));
	}
	public static void main(String[] args) {
		printCurrency(12500.255);
		
	}
}
