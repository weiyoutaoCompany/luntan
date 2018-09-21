package com.bjbls.luntan.web.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/jsp")
public class CustomerController {
	/*
	 * 张三丰，20180326
	 * 处理注销请求
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String username,String password){
		String url;
		if(username.equals("abc")&&password.equals("123")){
		url="jsp/customer/login_chenggong.jsp";
		}else {
			url="jsp/customer/login_shibai.jsp";
		}
		return url;


	}

}
