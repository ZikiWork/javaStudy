package javaTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ȡʱ������
 * 
 * @author Administrator
 *
 */
public class TimeInterval {

	public String getTimeDistence(String startTime, String endTime) throws ParseException {
		// ���Լ���ʱ���ʽѡ���Ӧ��ת������
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ת����date����

		Date start = format1.parse(startTime);
		//System.out.println(start);
		Date end = format2.parse(endTime);
		// ��ȡ������
		Long startLong = start.getTime();
		Long endLong = end.getTime();
		// ����ʱ���,��λ����
		Long ms = endLong - startLong;
		// ʱ���ת��Ϊ \��\ʱ\��\��
		String time = longTimeToDay(ms);
		return time;
	}

	// ת�����������Է�װ�ɹ��÷���
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
			sb.append(day + "��");
		}
		if (hour > 0) {
			sb.append(hour + "Сʱ");
		}
		if (minute > 0) {
			sb.append(minute + "��");
		}
		if (second > 0) {
			sb.append(second + "��");
		}
		if (milliSecond > 0) {
			sb.append(milliSecond + "����");
		}
		return sb.toString();
	}
}
