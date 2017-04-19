package com.weapp.web.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月7日 上午12:34:12
 * @version 1.0
 * @since  
 */
@Configuration//设置成配置类
@EnableWebMvc//启用 Spring MVC
@ComponentScan("com.weapp")//启用组建扫描
public class WebConfig extends WebMvcConfigurerAdapter {
	
	/**
	 * 配置JSP视图解析器
	 * @Title: viewResolver
	 * @Description: @return
	 * @return ViewResolver
	 * @throws
	 */
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	/**
	 * 配置静态资源的处理
	 */
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		//super.configureDefaultServletHandling(configurer);
		configurer.enable();
	}
	
	
}
