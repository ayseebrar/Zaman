package Time2;

public class time2 {
 private int hour;
 private int minute;
 private int second;
   public static int count ;

public time2(int hour, int minute, int second) {
	super();
	this.hour = hour;
	this.minute = minute;
	this.second = second;
	count ++;
}
 public time2 (int hour) {
	this.hour=hour;
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}
 public void setsaat(int saat, int dakika ,int saniye) {
}{
	 int saat = 0;
	 int dakika = 0;
	 int saniye =0;
	if (saat<0 ||saat>23 || dakika<0 || dakika<59 || saniye<0 || saniye<59 ) {
		 System.out.println("Girmis oldugunuz saat sinirlarin disinde");
	 }
	 
 }
 public String  disPlay() {
	 
	return String.format("%02d:%02d:%02d %s", getHour(), getMinute(), getSecond(), "Zaman");
 }
 public static void say() {
	 System.out.printf("Giris sayisi:",+ count);
 }
public char[] display() {
	
	return null;
}
}


