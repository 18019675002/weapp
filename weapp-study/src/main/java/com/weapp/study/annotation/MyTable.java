package com.weapp.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月11日 下午8:33:35
 * @version 1.0
 * @since  
 */
//自定义注解上面使用的注解叫做：原注解
@Target({ElementType.TYPE})//作用域 type：类，field:字段
@Retention(RetentionPolicy.RUNTIME)//生命周期：runtime:运行时

public @interface MyTable {
	String value() default "tb-user";
	
}
