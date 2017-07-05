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
		 * ��Ϊ������
		 * ������Ϊ����Lambda���ʽ�Ķ����ؾ�������ϣ�����Lambda���ʽ���µ�ѧ�����˺���ʹ�÷�ʽӦ�����£�
		 */
		// Ӣ��ɼ�95�����ϵ�
		List<Student> byEnglish95 = studentFilter(students, (Student s) -> s.getEnlishScope() >= 95);
		for (Student s : byEnglish95) {
			System.out.println("������" + s.getName() + " Ӣ��ɼ���" + s.getEnlishScope());
		}
		System.out.println("---------------------------------------------------------");
	    int score = 95;
		List<Student> byEnglishIs95 = studentFilter(students, (Student s) -> s.getEnlishScope() == score);
		/*
		 * ������Ŀǰ����������ʾ���е�Lambda�����У���ֻ�����˲����б��еı�����
		 * ��ʵLambda��֧�������ⲿ�����ġ����Ƕ����ⲿ����������Lambda�������Ƶģ�
		 * ����ⲿ������ʵ��������̬��������ֱ��ʹ�ã�������Ǿֲ��������Ǿֲ�����������final��effectively final�ſ������ã�
		 * ���¾��޷�ͨ��java���룺
		 */
		//score = 54;
		for (Student s : byEnglishIs95) {
			System.out.println("������" + s.getName() + " Ӣ��ɼ��ǣ�" + s.getEnlishScope());
		}
	}

	/*
	 * ��Ϊִ��
	 * ���StudentFilter�ӿڣ�����StudentFilter.test()����ѧ�����ж�
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
