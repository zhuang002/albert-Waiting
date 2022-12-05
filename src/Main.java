import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String sTime1 = sc.nextLine();
		String sTime2 = sc.nextLine();
		
		String[] time1 = sTime1.split(":");
		int hour1 = Integer.parseInt(time1[0]);
		int minute1 = Integer.parseInt(time1[1]);
		int second1 = Integer.parseInt(time1[2]);
		
		String[] time2 = sTime2.split(":");
		int hour2 = Integer.parseInt(time2[0]);
		int minute2 = Integer.parseInt(time2[1]);
		int second2 = Integer.parseInt(time2[2]);
		
		System.out.println((hour2-hour1)*3600+(minute2-minute1)*60+second2-second1);
				
	}

}
