package com.learn.java;

import java.util.function.IntPredicate;

/**
 * ��ͷ����
 * ��Student1 o1, Student2 o2�� -> o1.getMathScope().copare(o2.getMathScope())
 *        �����б�                                          ��ͷ                             Lambda������
 *        
 *        
 * lambda�����﷨�� (parameter) -> (expression)
 * lambda����Ҳ���԰������д��룺 (parameter) -> {statements;}
 *        
 * @author ����
 *
 */

public class LambdaTest {
	public static void main(String[] args) {
		
		Thread t = new Thread(() -> {System.out.println("hello");});
		t.start();
	    /*
	     * lambda �������Ͳ��ö���
	     * ��Java 7�У��Ѿ������� ���������(<>)��Java�������÷��ʹ����������ƶϳ����ʵ����Ͳ��������ԡ�
	     * ���ø����ԣ�Java������ͬ��������Lambda���ʽ�У���Ϻ���ʽ�ӿڵ�������������ƶϳ������б�Ĳ������ͣ�
	     * �Ӷ�����д�����Ӽ���Lambda���ʽ�����£�
	     */
		//Person p = (int x, int y) ->  x + y;
		Person p = ( x,  y) ->  x + y;
		int sum = p.calc(2, 3);	
		System.out.println(sum);
		
		IntPredicate in = i -> i>5;
		boolean b = in.test(4);
		System.out.println(b);
		
	}
}




