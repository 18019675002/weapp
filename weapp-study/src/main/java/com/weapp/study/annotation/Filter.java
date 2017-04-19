package com.weapp.study.annotation;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月11日 下午8:29:42
 * @version 1.0
 * @since  
 */
//@MyTable	//使用默认值
@MyTable("tb_student")
public class Filter {
	@MyColumn("name")
	private String name;
	@MyColumn("age")
	private int age;
	@MyColumn("phone_num")
	private String phoneNum;
	@MyColumn("hobby")
	private String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
	
}
