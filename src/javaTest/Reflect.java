package javaTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ������ǰ�java���еĸ��ֳɷ�ӳ���һ������Java����
 * 
 * @author Administrator
 *
 */
public class Reflect {

	public static void main(String[] args) throws ClassNotFoundException, Exception, Exception {

		// ��ȡClass����
		Class<?> student = Class.forName("com.laotan.day9.Student");
		System.out.println("************��ȡ���й��е��ֶ�********************");
		Field[] fieldArray = student.getFields();
		for (Field f : fieldArray) {
			System.out.println(f);
		}
		System.out.println("************��ȡ�������е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)**************");
		fieldArray = student.getDeclaredFields();
		for (Field f : fieldArray) {
			System.out.println(f);
		}
		System.out.println("*************��ȡ�������ֶ�****************");
		Field f = student.getField("name3");
		System.out.println(f);

		/**��ȡ���е�˽���ֶΣ���Ϊ�丳ֵ  start*/
		System.out.println("**************��ȡ����˽���ֶ�*��Ϊ�丳ֵ***************");
		f = student.getDeclaredField("name");
		f.setAccessible(true);// �������䣬���˽���޶�
		Student stuName = new Student();
		f.set(stuName, "Tom");
		System.out.println(stuName.getName());
		/**��ȡ���е�˽���ֶΣ���Ϊ�丳ֵ  end*/
		
		System.out.println("-------��ȡ�������еĹ��з���---------");
		// ��ȡ������
		Method[] methods1 = student.getMethods();
		for (Method method : methods1) {
			System.out.println(method);
		}
		System.out.println("-------��ȡ���еķ���������˽�еģ�---------");
		Method[] methods2 = student.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}

		Method methods3 = student.getDeclaredMethod("do1");// ͨ�������ȡ������
		methods3.setAccessible(true);
		Student stu = new Student();// ����ʵ����
		methods3.invoke(stu);
		System.out.println(stu.toString());// ֱ�ӵ��ã�
		// ͨ������ȥ���ã�
		Method methods4 = student.getDeclaredMethod("toString");
		System.out.println(methods4.invoke(stu));
	}

}
