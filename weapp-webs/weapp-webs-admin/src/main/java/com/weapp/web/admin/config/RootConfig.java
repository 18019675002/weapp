package com.weapp.web.admin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月7日 上午12:50:04
 * @version 1.0
 * @since  
 */

@Configuration
@ComponentScan(basePackages={"weapp"},excludeFilters={@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class RootConfig {

}
