package com.exp.shop;


import java.text.DateFormat;

import java.util.Date;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exp.service.CategoryService;
import com.exp.service.EmpRoleService;
import com.exp.model.Category;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	CategoryService categoryService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@Autowired
	
	EmpRoleService roleService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home/home";
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
	
		return "home/loginPage";
	}
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
	
		return "home/registerPage";
	}
	

	//--------------------Category Page----------------------------
	@RequestMapping(value = "category", method = RequestMethod.GET)
	public String category(Locale locale, Model model) {
		
		logger.info(" Category List"+  categoryService.getListCate());
//		List<Category> cateList = categoryService.getListCate();
//		List<Category> parentList = categoryService.getParentList();
//		model.addAttribute("cateList",cateList);
//		model.addAttribute("parentList",parentList);
		List<Category> cateList = categoryService.getListCate();
		//model.addAttribute("cateList",cateList);
		logger.info(cateList.get(1).getCategory_name());
		return "";
	}
	@RequestMapping(value = "category1", method = RequestMethod.GET)
	public String category1(Locale locale, Model model) {
		
		
		return "home/categoryPage";
	}
	
	//-------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
}
