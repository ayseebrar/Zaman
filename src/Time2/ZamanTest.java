package Time2;

import java.util.Scanner;

public class ZamanTest {

	public static void main(String[] args) {
		int hour;
		int minute;
		 int second;
		 int count = 0 ;
		 Scanner input= new Scanner(System.in);
		 System.out.println("Saati giriniz :");
		  hour= input.nextInt();
		  System.out.println("Dakikayi  giriniz   :");
		  minute = input.nextInt();
		  System.out.println("Saniyeyi giriniz    :");
		  second = input.nextInt();
		  time2 z= new time2(hour, minute,second);
		  time2 z1 =new time2(hour,minute,second);
		  System.out.println(z.display());
		  z.setHour(11);
		  System.out.println(z.display());
		  z.setsaat(25, 33, 45);
		  System.out.println(z.display());
		  time2.say();
		  time2 z2 = new time2(hour, second, count);
		  time2 z3= new time2(hour);
		  System.out.println(z1.display());
		  System.out.println(z2.display());
		  System.out.println(z3.display());
	}

}
