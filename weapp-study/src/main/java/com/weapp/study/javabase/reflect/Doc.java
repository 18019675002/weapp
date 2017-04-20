package com.weapp.study.javabase.reflect;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月18日 下午11:55:10
 * @version 1.0
 * @since  
 */
public class Doc {
	// Reflect 反射
	/*
	 Class类的使用
	 方法的反射
	 成员变量的反射
	 构造函数的反射
	 Java类加载机制
	 
	 #Class类
	 	1、在面向对象的世界里，万事万物皆对象
	 		但是在Java语言中，静态的成员、基本数据类型就不是对象
	 		* 类是对象，类是java.lang.Class类的实例对象
	 		* There is a class named Class	这里有一个类他的名字叫Class， 它的实例就是我们的每一个对象所属的类 
	 		* Class的构造函数是私有的，只要Java虚拟机可以访问， 得到Class的实例有三种方式
	 			1、Class c1 = People.class;
	 				实际上是在告诉我们，任何一个类都包含一个隐藏的静态成员变量class.
	 			2、People p1 = new People();
	 			   Class c2 = p1.getClass();
	 				已知该类的对象，通过getClass方法获得
	 			3、Class c3 = Class.forName("com.weapp.study.reflect.Persion")
	 			c1 == c2 == c3
	 			c1、c2 表示了People类的类类型（class type）
	 			我们完全可以通过类的类类型创建该类的对象实例 
	 			→ → → 通过c1/c2/c3创建Person的实例对象 
	 			→ → → Person p = (Persion)c1.newInstance();  //条件是需要有无参数的构造方法
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
	
	
}
