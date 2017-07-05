package com.learn.java;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest2 {
	public static void main(String[] args) {
		Student s1 = new Student(95, "zhangsan");
		Student s2 = new Student(97, "lisi");
		Student s3 = new Student(90, "wangwu");
		Student s4 = new Student(95, "erha");
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		/*
		 * 行为参数化
		 * 传递行为正是Lambda表达式的独门秘诀，我们希望结合Lambda表达式，新的学生过滤函数使用方式应该如下：
		 */
		// 英语成绩95分以上的
		List<Student> byEnglish95 = studentFilter(students, (Student s) -> s.getEnlishScope() >= 95);
		for (Student s : byEnglish95) {
			System.out.println("姓名：" + s.getName() + " 英语成绩：" + s.getEnlishScope());
		}
		System.out.println("---------------------------------------------------------");
	    int score = 95;
		List<Student> byEnglishIs95 = studentFilter(students, (Student s) -> s.getEnlishScope() == score);
		/*
		 * 在我们目前遇到的所有示例中的Lambda主体中，都只是用了参数列表中的变量，
		 * 其实Lambda是支持引用外部变量的。但是对于外部变量的引用Lambda是有限制的，
		 * 如果外部变量是实例变量或静态变量可以直接使用，但如果是局部变量，那局部变量必须是final或effectively final才可以引用，
		 * 如下就无法通过java编译：
		 */
		//score = 54;
		for (Student s : byEnglishIs95) {
			System.out.println("姓名：" + s.getName() + " 英语成绩是：" + s.getEnlishScope());
		}
	}

	/*
	 * 行为执行
	 * 结合StudentFilter接口，改用StudentFilter.test()用于学生的判断
	 */
	public static List<Student> studentFilter(List<Student> students, StudentFilter filter) {
		List<Student> filtered = new ArrayList<Student>();
		for (Student s : students) {
			if (filter.test(s)) {
				filtered.add(s);
			}
		}
		return filtered;
	}
}
