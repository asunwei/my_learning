package com.learn.java;

import java.util.function.IntPredicate;

/**
 * 箭头函数
 * （Student1 o1, Student2 o2） -> o1.getMathScope().copare(o2.getMathScope())
 *        参数列表                                          箭头                             Lambda方法体
 *        
 *        
 * lambda基本语法： (parameter) -> (expression)
 * lambda主体也可以包含多行代码： (parameter) -> {statements;}
 *        
 * @author 孙威
 *
 */

public class LambdaTest {
	public static void main(String[] args) {
		
		Thread t = new Thread(() -> {System.out.println("hello");});
		t.start();
	    /*
	     * lambda 变量类型不用定义
	     * 在Java 7中，已经引入了 菱形运算符(<>)，Java可以利用泛型从上下文中推断出合适的类型参数的特性。
	     * 利用该特性，Java编译器同样可以在Lambda表达式中，结合函数式接口的声明，便可以推断出参数列表的参数类型，
	     * 从而可以写出更加简洁的Lambda表达式，如下：
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




