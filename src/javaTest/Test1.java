package javaTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间！
 * 
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowDate = dateFormat.format(date);
		System.out.println(nowDate);

		TimeInterval time = new TimeInterval();
		String timeInterval = null;
		try {
			timeInterval = time.getTimeDistence("2018-12-31 00:00:00", nowDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("时间间隔为： " + timeInterval);
	}
}
