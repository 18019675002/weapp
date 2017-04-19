package com.weapp.web.admin.controller.test;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;  
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;  



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.sun.glass.ui.View;
import com.weapp.web.admin.config.WebAdminInitializer;
import com.weapp.web.admin.controller.LoginController;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月7日 下午9:07:08
 * @version 1.0
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//注入java 类型的配置文件
@ContextConfiguration(classes = {WebAdminInitializer.class})
//注入.xml文件的配置文件
//@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext.mvc.xml"}) 

//do rollback  
//@TransactionConfiguration(defaultRollback = true)  
//@Transactional
public class LoginControllerTest {
	
	@Autowired
	private WebApplicationContext wactx;
	
	private MockMvc mockMvc;
	private MockHttpSession session;
	
	@Before
	public void setup(){
		//init applicationContext
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wactx).build();
		this.session = new MockHttpSession(); 
	}
	
	
	@Test
	public void testLoginPage() throws Exception{
		//LoginController loginController = new LoginController();
		// get using get  
//        this.mockMvc  
//                .perform((get("/login"))  
//                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))  
//                .andExpect(status().isOk())  
//                .andExpect(content().contentType("application/json;charset=UTF-8"))  
//                .andDo(print()); // print  
		//MockMvc mockmvc = StandaloneMockMvcBuilder
		
		LoginController loginController = new LoginController();
		this.mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
		mockMvc.perform(get("/"))
			.andExpect(view().name("login"));
		
	}
	
	
	
	/** 
     * 获取登入信息session 
     * @return 
     * @throws Exception 
     */  
   /* private HttpSession getLoginSession() throws Exception{  
        // mock request get login session  
        // url = /xxx/xxx/{username}/{password}  
        MvcResult result = this.mockMvc  
                                .perform((get("/user/userMsg/loginUser/loginUser")))  
                                .andExpect(status().isOk())  
                                .andReturn();  
        return result.getRequest().getSession();  
    } */ 
}
