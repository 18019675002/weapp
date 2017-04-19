package com.weapp.study.annotation;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月11日 下午8:44:34
 * @version 1.0
 * @since  
 */
public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filter f1 = new Filter();
		f1.setAge(22);//模拟查询age为22的用户
		f1.setName("jack");
		Filter f2 = new Filter();
		f2.setName("lucy");//模糊查询用户姓名
		Filter f3 = new Filter();
		f3.setHobby("play,sleep,eat");//查询包含以下任意一种爱好的用户
	
		String sql1 = query(f1);
		String sql2 = query(f2);
		String sql3 = query(f3);
		
		System.out.println(sql1);
		System.out.println(sql2);
		System.out.println(sql3);
	}
	
	
	@SuppressWarnings("unchecked")
	private static String query(Object f){
		StringBuilder sb = new StringBuilder();
		sb.append("select");
		//try {
			//1.获取到Class
			@SuppressWarnings("rawtypes")
			Class clazz = f.getClass();
			//2.获取到table的名字
			if(clazz.isAnnotationPresent(MyTable.class)){
				MyTable t = (MyTable) clazz.getAnnotation(MyTable.class);
				String tableName = t.value();
				sb.append("select * from " + tableName + " where 1 = 1");
				
			}else {
				return null;
			}
			//3.遍历所有字段，处理每个字段对应的sql
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				//4.拿到字段名→拿到字段值→拼装sql
				boolean exists = field.isAnnotationPresent(MyColumn.class);
				if(exists){
					
					String columnName = field.getAnnotation(MyColumn.class).value();
					//field.get(obj)
					String fieldName = field.getName();
					//拼装字段的get方法名
					String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
					
					Object fieldValue = null;
					try {
						Method method = clazz.getMethod(methodName);
						//取得字段的值
						fieldValue =  method.invoke(f);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					if(fieldValue == null || (fieldValue instanceof Integer && (Integer)fieldValue == 0)){
						continue;
					}
					if(fieldValue instanceof Integer){
						sb.append(" and " + columnName + " = " + fieldValue + "");
					}else{
						if(((String)fieldValue).contains(",")){
							sb.append(" and " + columnName + " in (" );
							String[] vs = ((String)fieldValue).split(",");
							for (String string : vs) {
								sb.append("'"+string+"', ");
							}
							//sb.deleteCharAt(sb.length()-2);
							sb.delete(sb.length()-2, sb.length());
							sb.append(")");
							
						}else{
							sb.append(" and " + columnName + " = '" + fieldValue + "'");
						}
					}
					//and 
				}
			}
			
	
		
		
		return sb.toString(); 
	}
	
	

}
