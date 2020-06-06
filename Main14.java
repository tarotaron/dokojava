// 日付
// ・long型（基準時間1970年1月1日0時0分0秒からの経過したm秒）
// System.currentTimeMillis()現在日常を取得

// public class Main {
// 	public static void main (String[] args) {
// 		long start = System.currentTimeMillis();
// 		long end = System.currentTimeMillis();
// 		System.out.println("処理にかかった時間は・・・" + (end-start) + "m秒でした");
// 	}
// }

// ・Date型
// Date d = new Date();現在時刻
// Date d = new Date(long値);long値の日時

// import java.util.Date;
// public clacc Main {
// 	Date now = new Date();
// 	System.out.println(now);
// 	System.out.println(now.getTime());
// 	Date past = new Date(1316622225035L);
// 	System.out.println(past);
// }

// Clender c = Calender.getinstance();
// c.set(年、月、日、時、分、秒);または c.set(Calender.〜,値);
// Date d = c.getTime();

// import java.util.Calender;
// import java.util.Date;
// public class Main{
// 	public static void main(String[] args) {
// 		Date now = new Date();
// 		calender c = Calender.getInstance();
// 		c.setTime(now);
// 		int y = c.get(Calender.YEAR);
// 		System.out.println("今年は" + y + "年です");
// 		c.set(2010,8,22,1,23,45);
// 		c.set(Calender.YEAR, 2011);
// 		Date past = c.getTime();
// 	}
// }

// SimpleDateFormat f = new SimpleDateFormat(書式文字列);
// String s = f.format(d);

// SimpleDateFormat f = new SimpleDateFormat(書式文字列);
// Date.d = f.parse;

// import java.text.SimpleDateFormat;
// import java.util.Date;
// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		Date now = new Date();
// 		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
// 		String s = f.format(now);
// 		System.out.println(s);
// 		Date d = f.parse("2011/09/22 01:23:45");
// 	}
// }

import java.text.SimpleDateFormat;
import java.util.Calender;
import java.util.Date;
public class Main14{
	public static void main(String[] args) {
		Date now = new Date();
		calender c = Calender.getInstance();
		c.setTime(now);
		int day = c.get(Calender.DAY_OF_MONTH);
		day += 100;
		c.set(Calender.DAY_OF_MONTH, day)
		Date past = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		System.out.println(f.format (future));
	}
}

public class Account {
	String accountNumber;
	int balance;
}

public String toString() {
	return "¥¥" + this.balance + "(口座番号=" + this.accountNumber + ")";
}

public boolean equals (object o) {
	if(this == o) {
		return true;
	}
	if(o instanceof Account) {
		Account a = (Account) o;
		String an1 = this.accountNumber.trim();
		String an2 = a.accountNumber.trim();
		if(an1.equals(an2)) {
			return true;
		}
	}
	return false;
}