package javaTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射就是把java类中的各种成分映射成一个个的Java对象
 * 
 * @author Administrator
 *
 */
public class Reflect {

	public static void main(String[] args) throws ClassNotFoundException, Exception, Exception {

		// 获取Class对象
		Class<?> student = Class.forName("com.laotan.day9.Student");
		System.out.println("************获取所有公有的字段********************");
		Field[] fieldArray = student.getFields();
		for (Field f : fieldArray) {
			System.out.println(f);
		}
		System.out.println("************获取对象所有的字段(包括私有、受保护、默认的)**************");
		fieldArray = student.getDeclaredFields();
		for (Field f : fieldArray) {
			System.out.println(f);
		}
		System.out.println("*************获取对象公有字段****************");
		Field f = student.getField("name3");
		System.out.println(f);

		/**获取类中的私有字段，并为其赋值  start*/
		System.out.println("**************获取对象私有字段*并为其赋值***************");
		f = student.getDeclaredField("name");
		f.setAccessible(true);// 暴力反射，解除私有限定
		Student stuName = new Student();
		f.set(stuName, "Tom");
		System.out.println(stuName.getName());
		/**获取类中的私有字段，并为其赋值  end*/
		
		System.out.println("-------获取对象所有的公有方法---------");
		// 获取方法：
		Method[] methods1 = student.getMethods();
		for (Method method : methods1) {
			System.out.println(method);
		}
		System.out.println("-------获取所有的方法（包括私有的）---------");
		Method[] methods2 = student.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}

		Method methods3 = student.getDeclaredMethod("do1");// 通过反射获取方法！
		methods3.setAccessible(true);
		Student stu = new Student();// 创建实例！
		methods3.invoke(stu);
		System.out.println(stu.toString());// 直接调用！
		// 通过反射去调用！
		Method methods4 = student.getDeclaredMethod("toString");
		System.out.println(methods4.invoke(stu));
	}

}
