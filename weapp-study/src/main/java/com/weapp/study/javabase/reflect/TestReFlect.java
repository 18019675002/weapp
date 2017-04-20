package com.weapp.study.javabase.reflect;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月21日 上午12:09:22
 * @version 1.0
 * @since  
 */
public class TestReFlect {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		TestReFlect test = new TestReFlect();
		test.reflectPersion();
	}
	
	public void reflectPersion() throws ClassNotFoundException{
		Person p1 = new Person();
		
		Class<?> cp1 = p1.getClass();
		Class<?> cp2 = Person.class;
		Class<?> cp3 = Class.forName("com.weapp.study.javabase.reflect.Person");
		
		System.out.println("cp1 = cp2 → " + (cp1 == cp2));
		System.out.println("cp1 = cp3 → " + (cp1 == cp3));
		System.out.println("cp2 = cp3 → " + (cp2 == cp3));
		
		try {
			Person p2 = (Person) cp1.newInstance();
			p2.setName("张三");
			p2.showName();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
