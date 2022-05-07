package gettingStarted;
import java.util.Scanner;
public class CbsePercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int math= sc.nextInt();
		int sci= sc.nextInt();
		int sst= sc.nextInt();
		int evs= sc.nextInt();
		int hindi= sc.nextInt();
		int percentage = (math+sci+sst+evs+hindi)/5;
		System.out.println(percentage+"%");
		sc.close();
	}

}
