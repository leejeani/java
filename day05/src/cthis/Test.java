package cthis;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss");
		DecimalFormat currency_formater = new DecimalFormat("#,###.###");

		Calendar calendar =Calendar.getInstance();
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);

		System.out.println(currency_formater.format(100000));

	}

}
