package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authenticateService;
	
	@Autowired
	public LoginController(AuthenticationService authenticateService) {
		super();
		this.authenticateService = authenticateService;
	}

	@RequestMapping(value="login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password,ModelMap map) {
		
		if(authenticateService.authenticate(name, password)) {
			map.put("name",name);
			map.put("password",password);
			return "welcome";
		} else {
			map.put("errorMessage", "Invalid Credentials! Please try again !");
			return "login";
		}
		
	}
}
