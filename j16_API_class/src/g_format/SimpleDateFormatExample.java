package g_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		// java 1.0
		// 시간의 정보를 저장하는 객체 Date
		Date date = new Date();
		System.out.println(date);
		
		date = new Date(0);
		System.out.println(date);
		
		int year = date.getYear();
		int month = date.getMonth()+1;
		int day = date.getDate();
		System.out.println(year+"년"+month+"월"+day+"일");
		
		// java.text.*
		SimpleDateFormat sdf = new SimpleDateFormat();
		String result = sdf.format(date);
		System.out.println(result);
		
		
		
	}

}