package com.lijie.controller;

import java.util.Date;

import com.lijie.domain.Result;
import com.lijie.domain.YsUser;
import com.lijie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ys")
public class YsUserController {
	@Autowired
	private TestService ts;
	
	@RequestMapping("/user/{name}")
	@ResponseBody
	public Result getCatList(@PathVariable String name) {
		YsUser user = new YsUser(name, true, new Date(), "重庆 ");
		ts.addUser(user);
		return new Result("成功", 0, user, true);
	}
}
