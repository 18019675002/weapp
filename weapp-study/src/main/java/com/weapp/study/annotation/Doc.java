package com.weapp.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月11日 下午10:29:52
 * @version 1.0
 * @since  
 */
public class Doc {
	
	/*
	注解的分类 ：
		按运行机制分：
			源码注解
			编译时注解	@Override 重写    @Deprecated 过时的方法 @Suppvisewarnings
			运行时注解	@Autowired
		按来源分：
			来自JDK的注解
			来自第三方的注解
			我们自定义的注解
		元注解   注解的注解叫元注解
	*/
	
	/*
	
	#自定义注解	定义及解析
	
		@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})//作用域 type：类，field:字段 ...
		@Retention(RetentionPolicy.RUNTIME)//生命周期：runtime:运行时
		@Inherited		//标识性的注解，表示允许子类继承
		@Documented		//生成javadoc时会包含该注解
		//以上四个就是元注解
		public @interface Description {     //使用 @interface 关键字来定义注解
			String desc();					//成员变量，成员变量以无参 无异常方式声明
			String author();
			int age() default 18;			//可以设置默认值 
			//成员类型是受限制的，合法的类型包括:八种基本数据类型 以及String，Class, Annotation,Enumeration
			//** 如果注解只有一个成员变量时，则成员变量名必须为value(),在使用时可以忽略成员名和赋值号(=) **
			//注解类可以没有成员，没有成员的注解称为标识注解
		}
	
	#自定义注解	使用的语法
		有多个成员时：
			@<注解名>(<成员名1>=<成员值1>,<成员名2>=<成员值2>,...)
		只有一个成员时：
			@<注解名>(<成员值1>)
		例：
		@Description(desc="I am color",author="mini boy", age=12)//多成员
		@MyData("tb_stu")//单成员
		public String Color(){
			return "yello";
		}
		
	#解析注解
		通过反射获取类、函数、字段上的*运行时*注解信息，从而实现动态控制程序运行的逻辑。
	
	
	 	*只有在类上应用的Annotation才能被继承，而实际应用时的结果是：除了类上应用的Annotation能被继承外，
	 	*没有被重写的方法的Annotation也能被继承。
		*要注意的是：当方法被重写后，Annotation将不会被继承。
		*
		*子类的类上能否继承到父类的类上的注解							能
		*子类方法，实现了父类上的抽象方法，这个方法能否继承到注解		否
		*子类方法，继承了父类上的方法，这个方法能否继承到注解			能
		*子类方法，覆盖了父类上的方法，这个方法能否继承到注解			否
	*/
	
	/*
	 学习总结：
	 1、注解的作用范围 @Target	    ：包、类、字段、方法、方法的参数、局部变量
	 2、注解的生命周期 @Retention  ：源文件 SOURCE 编译CLASS 运行 RUNTIME
	 3、要求能读懂注解
	 4、能在实际项目中使用注解，并能自定义注解及使用自定义注解解决问题
	 */
}
