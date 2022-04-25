import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner question = new Scanner(System.in);
		System.out.println("1 or 2");
		int oneortwo = question.nextInt();
		if (oneortwo == 1) {
			LocalDate date= LocalDate.now();
		    System.out.println("Date=" + date);
		}else if (oneortwo ==2) {
		    LocalTime time = LocalTime.now();
			System.out.println("Time=" + time);
		}
	}
}
