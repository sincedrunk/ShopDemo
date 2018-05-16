package ShoppingMall.controller;

import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ShoppingMall.Service.PersonalCenterService;
import ShoppingMall.Service.UserService;
import ShoppingMall.entity.PersonalCenter;
import ShoppingMall.entity.User;

@Controller
public class UserController {
	private final String filePath = "F:/upload";

	private UserService userService;
	private PasswordEncoder passwordEncoder;
	private PersonalCenterService personalCenterService;

	@Autowired
	public UserController(UserService userService, PasswordEncoder passwordEncoder,
			PersonalCenterService personalCenterService) {
		this.userService = userService;
		this.passwordEncoder = passwordEncoder;
		this.personalCenterService = personalCenterService;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/reg")
	public String register(@Valid @ModelAttribute User user, BindingResult bindingResult, String password1,
			Model model) {
		if (bindingResult.hasErrors()) {
			System.out.println("error");
			return "reg";
		} else if (!user.getPassword().equals(password1)) {
			model.addAttribute("error", "两次密码不一致");
			return "reg";
		} else {

			String encode = passwordEncoder.encode(user.getPassword());
			System.out.println(user.toString());
			user.setPassword(encode);
			userService.create(user);
			return "redirect:/login";
		}

	}

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/reg")
	public String reg() {
		return "reg";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/buyinfo")
	public String buyinfo() {
		return "buyinfo";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/car")
	public String car() {
		return "car";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/order")
	public String order() {
		return "order";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/success")
	public String success(@AuthenticationPrincipal(expression = "user") User curuser, Model model) {
		return "success";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/vip")
	public String vip(@AuthenticationPrincipal(expression = "user") User curUser, Model model) {
		PersonalCenter personalCenter = personalCenterService.findOneConterDetails(curUser.getId());
		model.addAttribute("personalCenter", personalCenter);
		return "vip";
	}

	@RequestMapping(method = RequestMethod.POST, value = "vip-update")
	public String vipUpdate(@AuthenticationPrincipal(expression = "user") User curUser,
			@ModelAttribute PersonalCenter personalCenter, String email) {
		if (personalCenter.getPortrait().getSize() != 0) {

			try {
				String fileName = System.currentTimeMillis() + personalCenter.getPortrait().getOriginalFilename();
				personalCenter.getPortrait().transferTo(new File(filePath, fileName));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (personalCenter.getId() == null)
			personalCenterService.createPersonalCenter(personalCenter);
		else
			personalCenterService.updatePersonalCenter(personalCenter);
		curUser.setEmail(email);
		userService.updateEmail(curUser);
		return "redirect:/vip";
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

	@RequestMapping(method = RequestMethod.GET, value = "/index")
	public String index() {
		return "/index";
	}
}
