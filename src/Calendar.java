import java.time.LocalDate;
public class Calendar {
	
	static void calendar(int month,int day,int year) {
		//print the day using LocaleDate with a function getDayOfWeek()
		System.out.println(LocalDate.of(year,month,day).getDayOfWeek().name());
		
	}
	
public static void main(String[] args) {
	calendar(06,29,2000);
}
}
