package com.weapp.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月6日 下午11:51:33
 * @version 1.0
 * @since  
 */
@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String loginPage(){
		return "login";
		
	}
	
	@RequestMapping(value="add", method = RequestMethod.GET)
	@ResponseBody
	public String AddUser(){
		return "added";
		
	}
	
}
