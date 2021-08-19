import java.time.LocalDate;
public class Calendar {
	
	static void calendar(int month,int day,int year) {
		System.out.println(LocalDate.of(year,month,day).getDayOfWeek().name());
		
	}
	
public static void main(String[] args) {
	calendar(06,29,2000);
}
}
