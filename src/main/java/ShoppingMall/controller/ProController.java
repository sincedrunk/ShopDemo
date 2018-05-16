package ShoppingMall.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ShoppingMall.Service.ProService;
import ShoppingMall.Service.SortService;
import ShoppingMall.entity.Pro;
import ShoppingMall.entity.Sort;

@Controller
public class ProController {
	@Autowired
	private ProService proService;
	@Autowired
	private SortService sortService;
	private String uploadDir = "F:/upload";

	@RequestMapping(method = RequestMethod.POST, value = "/product-new")
	public String createPro(@ModelAttribute Pro pro, @RequestParam(required = false) String sortId, Model model) {
		if (pro.getPrint().getSize() == 0 || pro.getPrint().getContentType().toLowerCase().startsWith("/image")) {
			String filename = System.currentTimeMillis() + pro.getPrint().getOriginalFilename();
			try {
				pro.getPrint().transferTo(new File(uploadDir, filename));
				pro.setPrintUrl(filename);
				System.out.println(pro);
				proService.createPro(pro, sortId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "redirect:/prolist";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/product")
	public String product(Model model) {
		List<Sort> sorts = sortService.findAll();
		model.addAttribute("sorts", sorts);
		return "vip-product";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/prolist")
	public String prolist(Model model) {
		List<Pro> pros = proService.findAll();
		model.addAttribute("pros", pros);
		return "prolist";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/buyinfo/{id}")
	public String detail(@PathVariable Long id, Model model) {
		Pro pro = proService.detail(id);
		model.addAttribute("pro", pro);
		return "buyinfo";
	}

}
