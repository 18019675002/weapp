package com.weapp.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月11日 下午8:41:52
 * @version 1.0
 * @since  
 */

@Target({ElementType.FIELD})//作用域 type：类，field:字段
@Retention(RetentionPolicy.RUNTIME)//生命周期：runtime:运行时

public @interface MyColumn {
	String value();
}
