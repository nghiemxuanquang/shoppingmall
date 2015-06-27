package com.exp.shop;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






import org.springframework.web.bind.annotation.RequestParam;






import org.springframework.web.bind.annotation.ResponseBody;

import com.exp.model.Customer;
import com.exp.model.Emp_Roles;
import com.exp.model.Employee;
import com.exp.model.FAQs;
import com.exp.model.Person;
import com.exp.model.Supplier;
import com.exp.service.CategoryService;
import com.exp.service.CustomerService;
import com.exp.service.EmpRoleService;
import com.exp.service.EmployeeService;
import com.exp.service.FAQsService;
import com.exp.service.PersonService;
import com.exp.service.SupplierService;


@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	EmpRoleService roleService;
	@Autowired
	PersonService personService;
	@Autowired
	CustomerService customerService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	FAQsService faqService;
	@Autowired
	SupplierService supplierService;
	
	
	

	//---------------------Role management------------------------------
	@RequestMapping(value ="admin/roleList", method = RequestMethod.GET)
	public String getUserList(Model model){
		logger.info("Role List : " + roleService.getRoleList());
		List<Emp_Roles> roleList = roleService.getRoleList();
		model.addAttribute("roleList",roleList);
		return "admin/roleList";
	}
	
	@RequestMapping(value = "admin/roleAdd", method = RequestMethod.GET)
	public String roleAdd(){
		return "admin/addNewRole";
	}
	
	@RequestMapping(value="admin/roleAdd", method = RequestMethod.POST)
	public String roleInsert(Emp_Roles role){
		logger.info("userAdd controller invocked : " + role);
		roleService.addNewRole(role);
		return "redirect:roleList";
	}
	
	
	@RequestMapping(value="admin/modifyRole", method = RequestMethod.GET)
	public String modifyRole(Emp_Roles role, Model model){
		logger.info("modifyRole controller invoked : " + role.getRole_id());
		Emp_Roles modifyRole = roleService.getRoleByID(role.getRole_id());
		model.addAttribute("editRole",modifyRole);
		return "admin/modifyRole";
	}
	
	@RequestMapping(value="admin/modifyRole", method = RequestMethod.POST)
	public String modifyRole(Emp_Roles role){
		logger.info("modifyRole Post invoked : " +role);
		roleService.updateRole(role);
		return "redirect:roleList";
	}
	@RequestMapping(value="admin/removeRole", method = RequestMethod.GET)
	public String removeRole(Emp_Roles role, Model model){
		logger.info("deleteRole controller invoked : " + role.getRole_id());
		roleService.deleteRole(role);		
		return "redirect:roleList";
	}
	//---------------------------/\/\----------------------------------
	//--------------------------Person---------------------------------
	@RequestMapping(value ="admin/personList", method = RequestMethod.GET)
	public String getPersonList(Model model){
		logger.info(" Person List");
		List<Person> personList = personService.getPersonList();
		model.addAttribute("personList",personList);
		return "admin/personList";
		//return "../views/home/modifyPerson";
	}
	@RequestMapping(value = "admin/personAdd", method = RequestMethod.GET)
	public String personAdd(){
		return "admin/insertPerson";
	}
	
	@RequestMapping(value="admin/personAdd", method = RequestMethod.POST)
	public String personInsert(Person person){
		logger.info("person insert controller invocked : " + person);
		personService.addNewPerson(person);
		return "redirect:personList";
	}
	
	
	@RequestMapping(value="admin/modifyPerson", method = RequestMethod.GET)
	public String modifyPerson(Person person, Model model){
		logger.info("modifyRole controller invoked : " + person.getPerson_id());
		Person modifyPerson = personService.getPersonByID(person.getPerson_id());
		model.addAttribute("editPerson",modifyPerson);
		return "admin/editPerson";
	}
	
	@RequestMapping(value="admin/modifyPerson", method = RequestMethod.POST)
	public String modifyPerson(Person person){
		logger.info("modifyRole Post invoked : " +person.getPerson_id());
		//roleService.updateRole(role);
		personService.updatePerson(person);
		return "redirect:personList";
	}
	@RequestMapping(value="admin/removePerson", method = RequestMethod.GET)
	public String removePerson(Person person, Model model){
		logger.info("deleteRole controller invoked : " + person.getPerson_id());
		personService.deletePerson(person);
		return "redirect:personList";
	}
	
	@RequestMapping(value="admin/updatePerson", method = RequestMethod.GET)
	public String updatePerson(Person person, Model model){
		logger.info("modifyRole controller invoked : " + person.getPerson_id());
		Person modifyPerson = personService.getPersonByID(person.getPerson_id());
		model.addAttribute("editPerson",modifyPerson);
		return "admin/editPerson";
	}
	
	@RequestMapping(value="admin/updatePerson", method = RequestMethod.POST)
	public String updatePerson(Person person){
		logger.info("modifyRole Post invoked : " +person.getPerson_id());
		//roleService.updateRole(role);
		personService.updatePerson(person);
		return "redirect:customerFullList";
	}
	
	
	@RequestMapping(value="admin/deletePerson", method = RequestMethod.GET)
	public String deletePerson(Person person,Customer cust, Model model){
		logger.info("deletePerson controller invoked : " + person.getPerson_id());
		logger.info("deleteCustomer controller invoked : " + cust.getCustomer_id());
		//customerService.deleteCustomerByPersonID(person.getPerson_id());
		customerService.deleteCustomer(cust);
		personService.deletePerson(person);
		
		return "redirect:customerFullList";
	}
	
	//---------------------------/\/\----------------------------------
	//---------------------------Employee------------------------------
	@RequestMapping(value ="admin/employeeList", method = RequestMethod.GET)
	public String getEmployeeList(Model model){
		logger.info(" Employee List"+ employeeService.getEmployeeList() );
		/*ArrayList<HashMap<String, String>> employeeList = employeeService.getEmployeeList();
		model.addAttribute("employeeList",employeeList);*/
		List<Employee> employeeList = employeeService.getEmployeeList();
		model.addAttribute("employeeList",employeeList);
		return "admin/employeeList";
	}
	@RequestMapping(value ="admin/employeeFullList", method = RequestMethod.GET)
	public String getEployeeFullList(Model model){
		logger.info(" Employee List"+ employeeService.getEmployeeList1() );
		ArrayList<HashMap<String, String>> employeeList = employeeService.getEmployeeList1();
		model.addAttribute("employeeList",employeeList);
		return "admin/employeeDetail";
	}
	
	@RequestMapping(value="admin/deleteEmployee", method = RequestMethod.GET)
	public String deleteEmployee(Person person,Employee emp, Model model){
		logger.info("deletePerson controller invoked : " + person.getPerson_id());
		logger.info("deleteEmployee controller invoked : " + emp.getEmployee_id());
		//customerService.deleteCustomerByPersonID(person.getPerson_id());
		employeeService.deleteEmployee(emp);
		personService.deletePerson(person);
		return "redirect:employeeFullList";
	}
	
	@RequestMapping(value="admin/updateEmployee", method = RequestMethod.GET)
	public String updateEmployee(Person person, Model model){
		logger.info("modifyRole controller invoked : " + person.getPerson_id());
		Person modifyPerson = personService.getPersonByID(person.getPerson_id());
		model.addAttribute("editPerson",modifyPerson);
		return "admin/updateEmployee";
	}
	@RequestMapping(value="admin/updateEmployee", method = RequestMethod.POST)
	public String updateEmployee(Person person){
		logger.info("modifyRole Post invoked : " +person.getPerson_id());
		//roleService.updateRole(role);
		personService.updatePerson(person);
		return "redirect:employeeFullList";
	}
	@RequestMapping(value = "admin/createNewEmployee", method = RequestMethod.GET)
	public String createEmployee(){
		return "admin/addNewEmployee";
	}
	
	@RequestMapping(value="admin/createNewEmployee", method = RequestMethod.POST)
	public String insertEmployee(Person person,@RequestParam("role_id") int role_id){

		logger.info("person insert controller invocked : " + person);
		String name =person.getName();
		personService.addNewPerson(person);
		Person person1 = personService.getPersonID(name);
		int person_id = person1.getPerson_id();
		System.out.println(person1.getPerson_id());
		employeeService.createEmployee(person_id, role_id);		
		return "redirect:employeeFullList";
	}
	
	
	//---------------------------/\/\----------------------------------
	//---------------------------Customer------------------------------
	@RequestMapping(value ="admin/customerList", method = RequestMethod.GET)
	public String getCustomerList(Model model){
		logger.info(" Customer List"+ customerService.getCustomerList() );
		List<Customer> customerList = customerService.getCustomerList();
		List<Person> personList = personService.getPersonList();
		model.addAttribute("personList",personList);
		model.addAttribute("customerList",customerList);
		return "admin/customerList";
	}
	
	@RequestMapping(value ="admin/customerFullList", method = RequestMethod.GET)
	public String getCustomerFullList(Model model){
		logger.info(" Customer List"+ customerService.getCustomerList2() );
		ArrayList<HashMap<String, String>> customerList = customerService.getCustomerList2();
		model.addAttribute("customerList",customerList);
		return "admin/customerDetailList";
	}
	
	@RequestMapping(value = "admin/registerCustomer", method = RequestMethod.GET)
	public String customerRegister(){
		return "admin/registerCustomer";
	}
	
	@RequestMapping(value="admin/registerCustomer", method = RequestMethod.POST)
	public String customerInsert(Person person){
		logger.info("person insert controller invocked : " + person);
		String name =person.getName();
		personService.addNewPerson(person);
		Person person1 = personService.getPersonID(name);
		System.out.println(person1.getPerson_id());
		customerService.registerCustomer(person1.getPerson_id());
		return "redirect:customerFullList";
	}
	
	//---------------------------/\/\/\--------------------------------
	//---------------------------Category------------------------------
	@RequestMapping(value ="admin/categoryFullList", method = RequestMethod.GET)
	public String getCateeFullList(Model model){
		logger.info(" Category List"+  categoryService.getListCate());
//		List<Category> cateList = categoryService.getListCate();
//		List<Category> parentList = categoryService.getParentList();
//		model.addAttribute("cateList",cateList);
//		model.addAttribute("parentList",parentList);
		ArrayList<HashMap<String, String>> cateList = categoryService.getCategoryList();
		model.addAttribute("cateList",cateList);
		return "admin/categoryFullList";
	}
	
	
	
	//--------------------------/\/\/\--------------------------------
	
	//-------------------------Supplier-------------------------------
	
	@RequestMapping(value ="admin/supplierList", method = RequestMethod.GET)
	public String getSupplierList(Model model){
		logger.info(" Supplier List"+ supplierService.getListSupplier() );
		List<Supplier> supplierList = supplierService.getListSupplier();
		model.addAttribute("supplierList",supplierList);		
		return "admin/supplierList";
	}
	
	@RequestMapping(value = "admin/supplierAdd", method = RequestMethod.GET)
	public String supllierAdd(){
		return "admin/addNewSupplier";
	}
	
	@RequestMapping(value="admin/supplierAdd", method = RequestMethod.POST)
	public String supplierInsert(Supplier supp){
		logger.info("Supplier Add controller invocked : " + supp);
		supplierService.createNewSupplier(supp);
		return "redirect:supplierList";
	}
	
	
	@RequestMapping(value="admin/modifySupplier", method = RequestMethod.GET)
	public String modifySupplier(Supplier supp, Model model){
		logger.info("modify supplier controller invoked : " + supp.getSupplier_id());
		Supplier supplier = supplierService.getSupplierByID(supp.getSupplier_id());
		model.addAttribute("editSupplier",supplier);
		return "admin/modifySupplier";
	}
	
	@RequestMapping(value="admin/modifySupplier", method = RequestMethod.POST)
	public String modifySupplier(Supplier supp){
		logger.info("modify supplier Post invoked : " +supp);
		supplierService.updateSupplier(supp);
		return "redirect:supplierList";
	}
	@RequestMapping(value="admin/deleteSupplier", method = RequestMethod.GET)
	public String removeSupplier(Supplier supp, Model model){
		logger.info("delete Supplier controller invoked : " + supp.getSupplier_id());
		supplierService.deleteSupplier(supp);
		return "redirect:supplierList";
	}
	
	
	
	
	//---------------------------.\.\.\.\-----------------------------
	
	//--------------------------FAQs----------------------------------

	@RequestMapping(value ="admin/faqList", method = RequestMethod.GET)
	public String getFAQList(Model model){
		logger.info(" FAQ List"+ faqService.getfaqList() );
		List<FAQs> faqList = faqService.getfaqList();
	
		model.addAttribute("faqList",faqList);
	
		return "admin/faqList";
	}
	
	@RequestMapping(value = "admin/faqAdd", method = RequestMethod.GET)
	public String faqAdd(){
		return "admin/addNewFAQ";
	}
	
	@RequestMapping(value="admin/faqAdd", method = RequestMethod.POST)
	public String faqInsert(FAQs faq){
		logger.info("faq insert controller invocked : " + faq);
		faqService.addNewFAQ(faq);
		return "redirect:faqList";
	}
	@RequestMapping(value="admin/getFAQ",method=RequestMethod.GET)
	public @ResponseBody String getFAQ(Model model,@RequestParam String id)
	{		
		int myid =Integer.parseInt(id);
		FAQs myFAQ = faqService.getFAQByID(myid);
		String question = myFAQ.getQuestion();
		String answer = myFAQ.getAnswer();
		String result = question +"|"+answer;
		return result;
	}
	
	@RequestMapping(value="admin/modifyFAQ", method = RequestMethod.GET)
	public String modifyFAQ(FAQs faq, Model model){
		logger.info("modifyRole controller invoked : " + faq.getFaqs_id());
		FAQs modifyFAQ = faqService.getFAQByID(faq.getFaqs_id());
		model.addAttribute("editFAQ",modifyFAQ);
		return "admin/editFAQ";
	}
	
	@RequestMapping(value="admin/modifyFAQ", method = RequestMethod.POST)
	public String modifyFAQ(FAQs faq){
		logger.info("modify FAQ Post invoked : " +faq);
		faqService.updateFAQ(faq);
		return "redirect:faqList";
	}
	
	@RequestMapping(value ="admin/faqDetele", method = RequestMethod.GET)
	public String deleteFAQ(FAQs faq,Model model){
		logger.info("delete FAQ controller invoked : " + faq.getFaqs_id());
		faqService.deleteFAQ(faq);
		return "redirect:faqList";
	
	
	}
	
	//--------------------------/\/\/\--------------------------------
	
	//--------------------------Admin Page-----------------------------
	@RequestMapping(value ="admin/index", method = RequestMethod.GET)
	public String adminpage(Model model) {
		
		return "admin/adminMainPage";
		//return "../jsp/hello";
	}
	
	@RequestMapping(value="admin/backtoMain", method = RequestMethod.GET)
	public String backtoMain(){
		return "admin/adminMainPage";
	}
	
	
	
}
