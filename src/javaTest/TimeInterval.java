package javaTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取时间间隔！
 * 
 * @author Administrator
 *
 */
public class TimeInterval {

	public String getTimeDistence(String startTime, String endTime) throws ParseException {
		// 看自己的时间格式选择对应的转换对象
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 转换成date类型

		Date start = format1.parse(startTime);
		//System.out.println(start);
		Date end = format2.parse(endTime);
		// 获取毫秒数
		Long startLong = start.getTime();
		Long endLong = end.getTime();
		// 计算时间差,单位毫秒
		Long ms = endLong - startLong;
		// 时间差转换为 \天\时\分\秒
		String time = longTimeToDay(ms);
		return time;
	}

	// 转换函数，可以封装成公用方法
	public static String longTimeToDay(Long ms) {
		Integer ss = 1000;
		Integer mi = ss * 60;
		Integer hh = mi * 60;
		Integer dd = hh * 24;

		Long day = ms / dd;
		Long hour = (ms - day * dd) / hh;
		Long minute = (ms - day * dd - hour * hh) / mi;
		Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
		Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

		StringBuffer sb = new StringBuffer();
		if (day > 0) {
			sb.append(day + "天");
		}
		if (hour > 0) {
			sb.append(hour + "小时");
		}
		if (minute > 0) {
			sb.append(minute + "分");
		}
		if (second > 0) {
			sb.append(second + "秒");
		}
		if (milliSecond > 0) {
			sb.append(milliSecond + "毫秒");
		}
		return sb.toString();
	}
}
