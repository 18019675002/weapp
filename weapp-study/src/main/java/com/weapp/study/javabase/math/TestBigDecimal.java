package com.weapp.study.javabase.math;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月19日 下午7:04:36
 * @version 1.0
 * @since  
 */
public class TestBigDecimal {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		BigDecimal b0 = new BigDecimal("5");
		System.out.println(b0);//5
		BigDecimal b1 = new BigDecimal(new BigInteger("62225"),3);
		System.out.println(b1);//5
		
		double dob1 = 123.456;
		BigDecimal b2 = new BigDecimal(dob1);
		System.out.println(b2);//123.4560000000000030695446184836328029632568359375
		BigDecimal b3 = new BigDecimal(Double.toString(dob1));
		System.out.println(b3);//123.456
		BigDecimal b4 = BigDecimal.valueOf(dob1);
		System.out.println(b4);//123.456
		double dob2 = 123.003;
		
		//获得小数的位数
		int b5 = new BigDecimal(Double.toString(dob2)).scale();
		System.out.println(b5);//3
		
		String s1 = "23.00056";
		BigDecimal b6 = new BigDecimal(s1);
		System.out.println(b6);
		BigDecimal b7 = b6.setScale(2,BigDecimal.ROUND_HALF_UP);
		System.out.println(b7.toString());
		
		System.out.println("********************格式化小数*******************");
		TestBigDecimal test = new TestBigDecimal();
		test.setScale();
		System.out.println("*******************算术运算********************");
		test.arithmetic();
		System.out.println("*******************各种不同的小数格式化********************");
		test.menageDecimal();
	}
	
	/**
	 * 
	 * @Title: setScale
	 * @Description: 使用 setScale() 方法格式化数字
	 * @return void
	 * @throws
	 */
	public void setScale(){
		String[] content = new String[8];
		content[0] = "0";
		content[1] = "0.0";
		content[2] = "0.0000";
		content[3] = "0.005";
		content[4] = "0.0045";
		content[5] = "23.0056";
		content[6] = "23.0050";
		content[7] = "23.0049";
		for (int i=0;i<content.length; i++) {
			BigDecimal b = new BigDecimal(content[i]);
			BigDecimal c = b.setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入
			System.out.println("content["+ i +"] = "+b + "	保留两位小数: "+c);
		}
	}
	
	/**
	 * 
	 * @Title: arithmetic
	 * @Description: + - * / 算术运算
	 * @return void
	 * @throws
	 */
	public void arithmetic(){
		BigDecimal a = BigDecimal.valueOf(20);
		BigDecimal b = BigDecimal.valueOf(7);
		BigDecimal resultAdd = a.add(b);
		BigDecimal resultSubtract = a.subtract(b);
		BigDecimal resultMultiply = a.multiply(b); 
		BigDecimal resultDivide =  a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("a + b → "+ a +" + "+ b +" = " + resultAdd);
		System.out.println("a - b → "+ a +" - "+ b +" = " + resultSubtract);
		System.out.println("a * b → "+ a +" * "+ b +" = " + resultMultiply);
		System.out.println("a / b → "+ a +" / "+ b +" = " + resultDivide);
		
		BigDecimal resultDivide2 = a.divide(b, 2, BigDecimal.ROUND_UP);
		System.out.println("设置精度后的除法值：" + a + " / " + b + " = " + resultDivide2);
		
		BigDecimal resultRemainder = a.remainder(b);
		System.out.println("a % b → "+ a +" % "+ b +" = " + resultRemainder);
		
		BigDecimal c = BigDecimal.valueOf(-7);
		BigDecimal resultRemainder_ = a.remainder(c);//如果c == 0的时候会报错 java.lang.ArithmeticException
		System.out.println("a % c → "+ a +" % "+ c +" = " + resultRemainder_);
		
		//此方法因计算结果是除不尽的小数，也没有设置舍入方式 会报错  java.lang.ArithmeticException
		//BigDecimal res2 = a.divide(b);
	}
	
	
	public void menageDecimal(){
		
		
//		BigDecimal.setScale()方法用于格式化小数点
//		setScale(1)表示保留一位小数，默认用四舍五入方式 
//		setScale(1,BigDecimal.ROUND_DOWN)直接删除多余的小数位，如2.35会变成2.3 
//		setScale(1,BigDecimal.ROUND_UP)进位处理，2.35变成2.4 
//		setScale(1,BigDecimal.ROUND_HALF_UP)四舍五入，2.35变成2.4
//		setScaler(1,BigDecimal.ROUND_HALF_DOWN)四舍五入，2.35变成2.3，如果是5则向下舍
		
		BigDecimal a = new BigDecimal("12.345");
		//System.out.println(a.setScale(2));
		//BigDecimal.ROUND_UP 直接删除多余的小数位
		System.out.println(a + " 保留1位小数 ROUND_UP： " + a.setScale(1, BigDecimal.ROUND_UP));
		//BigDecimal.ROUND_DOWN 直接删除多余的小数位
		System.out.println(a + " 保留2位小数 ROUND_DOWN： " + a.setScale(2, BigDecimal.ROUND_DOWN));
		//BigDecimal.ROUND_HALF_UP 标准的四舍五入算法
		System.out.println(a + " 保留2位小数 ROUND_HALF_UP： " + a.setScale(2, BigDecimal.ROUND_HALF_UP));
		//BigDecimal.ROUND_HALF_DOWN 四舍五入，如果是5则向下舍
		System.out.println(a + " 保留2位小数 ROUND_HALF_DOWN： " + a.setScale(2, BigDecimal.ROUND_HALF_DOWN));
		//BigDecimal.ROUND_HALF_DOWN 银行记数法
		System.out.println(a + " 保留2位小数 ROUND_HALF_EVEN： " + a.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		
	}

}
