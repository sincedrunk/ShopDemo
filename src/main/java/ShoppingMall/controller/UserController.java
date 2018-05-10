package ShoppingMall.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ShoppingMall.Service.UserService;
import ShoppingMall.entity.User;

@Controller
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/reg")
	public String reg() {
		return "reg";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/reg")
	public String register(@Valid @ModelAttribute User user, BindingResult bindingResult, String password1,
			Model model) {
		if (bindingResult.hasErrors()) {
			System.out.println("error");
			return "reg";
		} else if (!user.getPassword().equals(password1)) {
			System.out.println("不匹配");
			model.addAttribute("error", "输入密码不一致，请重新输入");
			return "reg";
		} else {
			System.out.println(user.toString());
			userService.create(user);
			return "redirect:/login";
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/buyinfo")
	public String buyinfo() {
		return "buyinfo";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/car")
	public String car() {
		return "car";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/prolist")
	public String prolist() {
		return "prolist";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/order")
	public String order() {
		return "order";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/success")
	public String success() {
		return "success";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/vip")
	public String vip() {
		return "vip";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vipOrder")
	public String vipOrder() {
		return "vipOrder";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vipAddress")
	public String vipAddress() {
		return "/vipAddress";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vipPwd")
	public String vipPwd() {
		return "/vipPwd";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vipXiaofei")
	public String vipXiaofei() {
		return "/vipXiaofei";
	}
	
}
