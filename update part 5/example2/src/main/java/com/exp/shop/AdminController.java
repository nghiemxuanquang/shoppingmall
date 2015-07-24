package com.exp.shop;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.io.*;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;








import com.common.ImageUpload;
import com.common.SendEmail;
import com.exp.model.Category;
import com.exp.model.Customer;
import com.exp.model.Emp_Roles;
import com.exp.model.Employee;
import com.exp.model.FAQs;
import com.exp.model.Person;
import com.exp.model.Product;
import com.exp.model.Supplier;
import com.exp.service.CategoryService;
import com.exp.service.CustomerService;
import com.exp.service.EmpRoleService;
import com.exp.service.EmployeeService;
import com.exp.service.FAQsService;
import com.exp.service.PersonService;
import com.exp.service.ProductService;
import com.exp.service.SupplierService;


@Controller
@RequestMapping(value="/admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	ProductService productService;
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
	@Autowired
	private JavaMailSender mailsender;

	
	
	

	//---------------------Role management------------------------------
	@RequestMapping(value ="roleList", method = RequestMethod.GET)
	public String getUserList(Model model){
		logger.info("Role List : " + roleService.getRoleList());
		List<Emp_Roles> roleList = roleService.getRoleList();
		model.addAttribute("roleList",roleList);
		return "admin/roleList";
	}
	
	@RequestMapping(value ="roleAdd", method = RequestMethod.GET)
	public String roleAdd(){
		return "admin/addNewRole";
	}
	
	@RequestMapping(value="roleAdd", method = RequestMethod.POST)
	public String roleInsert(Emp_Roles role){
		logger.info("userAdd controller invocked : " + role);
		roleService.addNewRole(role);
		return "redirect:roleList";
	}
	
	
	@RequestMapping(value="modifyRole", method = RequestMethod.GET)
	public String modifyRole(Emp_Roles role, Model model){
		logger.info("modifyRole controller invoked : " + role.getRole_id());
		Emp_Roles modifyRole = roleService.getRoleByID(role.getRole_id());
		model.addAttribute("editRole",modifyRole);
		return "admin/modifyRole";
	}
	
	@RequestMapping(value="modifyRole", method = RequestMethod.POST)
	public String modifyRole(Emp_Roles role){
		logger.info("modifyRole Post invoked : " +role);
		roleService.updateRole(role);
		return "redirect:roleList";
	}
	@RequestMapping(value="removeRole", method = RequestMethod.GET)
	public String removeRole(Emp_Roles role, Model model){
		logger.info("deleteRole controller invoked : " + role.getRole_id());
		roleService.deleteRole(role);		
		return "redirect:roleList";
	}
	//---------------------------/\/\----------------------------------
	//--------------------------Person---------------------------------
	@RequestMapping(value ="personList", method = RequestMethod.GET)
	public String getPersonList(Model model){
		logger.info(" Person List");
		List<Person> personList = personService.getPersonList();
		model.addAttribute("personList",personList);
		return "admin/personList";
		//return "../views/home/modifyPerson";
	}
	@RequestMapping(value = "personAdd", method = RequestMethod.GET)
	public String personAdd(){
		return "admin/insertPerson";
	}
	
	@RequestMapping(value="personAdd", method = RequestMethod.POST)
	public String personInsert(Person person){
		logger.info("person insert controller invocked : " + person);
		personService.addNewPerson(person);
		return "redirect:personList";
	}
	
	
	@RequestMapping(value="modifyPerson", method = RequestMethod.GET)
	public String modifyPerson(Person person, Model model){
		logger.info("modifyRole controller invoked : " + person.getPerson_id());
		Person modifyPerson = personService.getPersonByID(person.getPerson_id());
		model.addAttribute("editPerson",modifyPerson);
		return "admin/editPerson";
	}
	
	@RequestMapping(value="modifyPerson", method = RequestMethod.POST)
	public String modifyPerson(Person person){
		logger.info("modifyRole Post invoked : " +person.getPerson_id());
		//roleService.updateRole(role);
		personService.updatePerson(person);
		return "redirect:personList";
	}
	@RequestMapping(value="removePerson", method = RequestMethod.GET)
	public String removePerson(Person person, Model model){
		logger.info("deleteRole controller invoked : " + person.getPerson_id());
		personService.deletePerson(person);
		return "redirect:personList";
	}
	
	@RequestMapping(value="updatePerson", method = RequestMethod.GET)
	public String updatePerson(Person person, Model model){
		logger.info("modifyRole controller invoked : " + person.getPerson_id());
		Person modifyPerson = personService.getPersonByID(person.getPerson_id());
		model.addAttribute("editPerson",modifyPerson);
		return "admin/editPerson";
	}
	
	@RequestMapping(value="updatePerson", method = RequestMethod.POST)
	public String updatePerson(Person person){
		logger.info("modifyRole Post invoked : " +person.getPerson_id());
		//roleService.updateRole(role);
		personService.updatePerson(person);
		return "redirect:customerFullList";
	}
	
	
	@RequestMapping(value="deletePerson", method = RequestMethod.GET)
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
	@RequestMapping(value ="employeeList", method = RequestMethod.GET)
	public String getEmployeeList(Model model){
		logger.info(" Employee List"+ employeeService.getEmployeeList() );
		/*ArrayList<HashMap<String, String>> employeeList = employeeService.getEmployeeList();
		model.addAttribute("employeeList",employeeList);*/
		List<Employee> employeeList = employeeService.getEmployeeList();
		model.addAttribute("employeeList",employeeList);
		return "admin/employeeList";
	}
	@RequestMapping(value ="employeeFullList", method = RequestMethod.GET)
	public String getEployeeFullList(Model model){
		logger.info(" Employee List"+ employeeService.getEmployeeList1() );
		ArrayList<HashMap<String, String>> employeeList = employeeService.getEmployeeList1();
		model.addAttribute("employeeList",employeeList);
		return "admin/employeeDetail";
	}
	
	@RequestMapping(value="deleteEmployee", method = RequestMethod.GET)
	public String deleteEmployee(Person person,Employee emp, Model model){
		logger.info("deletePerson controller invoked : " + person.getPerson_id());
		logger.info("deleteEmployee controller invoked : " + emp.getEmployee_id());
		//customerService.deleteCustomerByPersonID(person.getPerson_id());
		employeeService.deleteEmployee(emp);
		personService.deletePerson(person);
		return "redirect:employeeFullList";
	}
	
	@RequestMapping(value="updateEmployee", method = RequestMethod.GET)
	public String updateEmployee(Person person, Model model){
		logger.info("modifyRole controller invoked : " + person.getPerson_id());
		Person modifyPerson = personService.getPersonByID(person.getPerson_id());
		model.addAttribute("editPerson",modifyPerson);
		return "admin/updateEmployee";
	}
	@RequestMapping(value="updateEmployee", method = RequestMethod.POST)
	public String updateEmployee(Person person){
		logger.info("modifyRole Post invoked : " +person.getPerson_id());
		//roleService.updateRole(role);
		personService.updatePerson(person);
		return "redirect:employeeFullList";
	}
	@RequestMapping(value = "createNewEmployee", method = RequestMethod.GET)
	public String createEmployee(){
		return "admin/addNewEmployee";
	}
	
	@RequestMapping(value="createNewEmployee", method = RequestMethod.POST)
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
	@RequestMapping(value ="customerList", method = RequestMethod.GET)
	public String getCustomerList(Model model){
		logger.info(" Customer List"+ customerService.getCustomerList() );
		List<Customer> customerList = customerService.getCustomerList();
		List<Person> personList = personService.getPersonList();
		model.addAttribute("personList",personList);
		model.addAttribute("customerList",customerList);
		return "admin/customerList";
	}
	
	@RequestMapping(value ="customerFullList", method = RequestMethod.GET)
	public String getCustomerFullList(Model model){
		logger.info(" Customer List"+ customerService.getCustomerList2() );
		ArrayList<HashMap<String, String>> customerList = customerService.getCustomerList2();
		model.addAttribute("customerList",customerList);
		return "admin/customerDetailList";
	}
	
	@RequestMapping(value = "registerCustomer", method = RequestMethod.GET)
	public String customerRegister(){
		return "admin/registerCustomer";
	}
	
	@RequestMapping(value="registerCustomer", method = RequestMethod.POST)
	public String customerInsert(Person person){
		logger.info("person insert controller invocked : " + person);
		String name =person.getName();
		String emailToSend = person.getEmail();
		String subject ="test";
		String message ="send email test";
		
		/*
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(emailToSend);
		email.setSubject(subject);
		email.setText(message);
		mailsender.send(email);*/
		SendEmail sendmail = new SendEmail();
		sendmail.sendMail(emailToSend, subject, message);
	
		personService.addNewPerson(person);
		Person person1 = personService.getPersonID(name);
		System.out.println(person1.getPerson_id());
		customerService.registerCustomer(person1.getPerson_id());
		return "redirect:customerFullList";
	}
	
	//---------------------------/\/\/\--------------------------------
	//---------------------------Category------------------------------
	@RequestMapping(value ="categoryFullList", method = RequestMethod.GET)
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
	
	@RequestMapping(value ="supplierList", method = RequestMethod.GET)
	public String getSupplierList(Model model){
		logger.info(" Supplier List"+ supplierService.getListSupplier() );
		List<Supplier> supplierList = supplierService.getListSupplier();
		model.addAttribute("supplierList",supplierList);		
		return "admin/supplierList";
	}
	
	@RequestMapping(value = "supplierAdd", method = RequestMethod.GET)
	public String supllierAdd(){
		return "admin/addNewSupplier";
	}
	
	@RequestMapping(value="supplierAdd", method = RequestMethod.POST)
	public String supplierInsert(Supplier supp){
		logger.info("Supplier Add controller invocked : " + supp);
		supplierService.createNewSupplier(supp);
		return "redirect:supplierList";
	}
	
	
	@RequestMapping(value="modifySupplier", method = RequestMethod.GET)
	public String modifySupplier(Supplier supp, Model model){
		logger.info("modify supplier controller invoked : " + supp.getSupplier_id());
		Supplier supplier = supplierService.getSupplierByID(supp.getSupplier_id());
		model.addAttribute("editSupplier",supplier);
		return "admin/modifySupplier";
	}
	
	@RequestMapping(value="modifySupplier", method = RequestMethod.POST)
	public String modifySupplier(Supplier supp){
		logger.info("modify supplier Post invoked : " +supp);
		supplierService.updateSupplier(supp);
		return "redirect:supplierList";
	}
	@RequestMapping(value="deleteSupplier", method = RequestMethod.GET)
	public String removeSupplier(Supplier supp, Model model){
		logger.info("delete Supplier controller invoked : " + supp.getSupplier_id());
		supplierService.deleteSupplier(supp);
		return "redirect:supplierList";
	}
	
	
	
	
	//---------------------------.\.\.\.\-----------------------------
	
	//--------------------------FAQs----------------------------------

	@RequestMapping(value ="faqList", method = RequestMethod.GET)
	public String getFAQList(Model model){
		logger.info(" FAQ List"+ faqService.getfaqList() );
		List<FAQs> faqList = faqService.getfaqList();
	
		model.addAttribute("faqList",faqList);
	
		return "admin/faqList";
	}
	
	@RequestMapping(value = "faqAdd", method = RequestMethod.GET)
	public String faqAdd(){
		return "admin/addNewFAQ";
	}
	
	
	
	@RequestMapping(value="faqAdd", method = RequestMethod.POST)
	public String faqInsert(FAQs faq){
		logger.info("faq insert controller invocked : " + faq);
		faqService.addNewFAQ(faq);
		return "redirect:faqList";
	}
	@RequestMapping(value="getFAQ",method=RequestMethod.GET)
	public @ResponseBody String getFAQ(Model model,@RequestParam String id)
	{		
		int myid =Integer.parseInt(id);
		FAQs myFAQ = faqService.getFAQByID(myid);
		String question = myFAQ.getQuestion();
		String answer = myFAQ.getAnswer();
		String result = question +"|"+answer;
		return result;
	}
	

	
	@RequestMapping(value="modifyFAQ", method = RequestMethod.GET)
	public String modifyFAQ(FAQs faq, Model model){
		logger.info("modifyRole controller invoked : " + faq.getFaqs_id());
		FAQs modifyFAQ = faqService.getFAQByID(faq.getFaqs_id());
		model.addAttribute("editFAQ",modifyFAQ);
		return "admin/editFAQ";
	}
	
	@RequestMapping(value="modifyFAQ", method = RequestMethod.POST)
	public String modifyFAQ(FAQs faq){
		logger.info("modify FAQ Post invoked : " +faq);
		faqService.updateFAQ(faq);
		return "redirect:faqList";
	}
	
	@RequestMapping(value ="faqDetele", method = RequestMethod.GET)
	public String deleteFAQ(FAQs faq,Model model){
		logger.info("delete FAQ controller invoked : " + faq.getFaqs_id());
		faqService.deleteFAQ(faq);
		return "redirect:faqList";
	
	
	}
	
	//--------------------------json-ajax------------------------------

	@RequestMapping(value="getFAQlist",method=RequestMethod.GET)
	@ResponseBody
	public List<FAQs> getFAQlist()
	{		
		//List<FAQs> list = faqService.getfaqList();
		List<FAQs> list =new ArrayList<FAQs>();
		list = faqService.getfaqList();
		System.out.println(list);
		return list;
	}
	@RequestMapping(value="getFAQtable",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object[]> getFAQtable()
	{		
		//List<FAQs> list = faqService.getfaqList();
		
		
		Collection<FAQs> faqs = faqService.getfaqList();
		return Collections.singletonMap("aaData", getJSONForFAQ(faqs));
		
		/*List<FAQs> list =new ArrayList<FAQs>();
		list = faqService.getfaqList();
		System.out.println(list);
		System.out.println(Collections.singletonMap("list",getJSONForFAQs(list)));
		return Collections.singletonMap("list",getJSONForFAQs(list));
		*/
	}
	public Object[] getJSONForFAQ(Collection<FAQs> faqs){
	        Object[] rdArray = new Object[faqs.size()];
	        int i = 0;
	        for(FAQs u:faqs){
	            // [ name, id,arn,groups ]
	            Object[] us = new String[]{Integer.toString(i+1),Integer.toString(u.getFaqs_id()),u.getQuestion(),u.getAnswer()}; 
	            rdArray[i] = us;
	            i++;            
	        }
	        return rdArray;
	    }   

	//--------------------------/\/\/\--------------------------------
	//--------------------------Product-------------------------------
	@RequestMapping(value ="productList", method = RequestMethod.GET)
	public String getProductList(Model model){
		logger.info(" Product List"+ productService.getlistProduct() );

		List<Product> productList = productService.getlistProduct();
		ArrayList<HashMap<String, String>> productDetaiList = productService.getProductDetaiList();
		model.addAttribute("productList",productList);
		model.addAttribute("productDetailList",productDetaiList);
		
		return "admin/productList";
	}
	@RequestMapping(value="insertProduct",method =RequestMethod.GET)
	public String insertNewProduct(Product pro,Model model)
	{
		List<Category> category = categoryService.getChildList();
		List<Supplier> supplier = supplierService.getListSupplier();
		model.addAttribute("supplier",supplier);
		model.addAttribute("category",category);
		return "admin/insertProduct";
	}
	@RequestMapping(value="insertProduct", method = RequestMethod.POST)
	public String productInsert(Product pro,Model model){
		logger.info("product insert controller invocked : " + pro);
		productService.addNewProduct(pro);
		return "redirect:productList";
	}
	
	@RequestMapping(value="updateProduct", method = RequestMethod.GET)
	public String modifyProduct(Product pro, Model model){
		logger.info("update product controller invoked : " + pro.getProduct_id());
		Product product = productService.getProductByID(pro.getProduct_id());
		model.addAttribute("editProduct",product);
		return "admin/updateProduct";
	}
	
	@RequestMapping(value="updateProduct", method = RequestMethod.POST)
	public String modifyProduct(FAQs faq){
		logger.info("modify FAQ Post invoked : " +faq);
		faqService.updateFAQ(faq);
		return "redirect:productList";
	}
	@RequestMapping(value ="deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(Product product,Model model){
		logger.info("delete Product controller invoked : " + product.getProduct_id());
		productService.deleteProduct(product);
		return "redirect:productList";
	
	
	}
	@RequestMapping(value="updateProductImage", method = RequestMethod.GET)
	public String modifyProductImage(Product pro, Model model){
		logger.info("update product controller invoked : " + pro.getProduct_id());
		Product product = productService.getProductByID(pro.getProduct_id());
		model.addAttribute("product",product);
		return "admin/uploadMultiFile";
	}
	
	//-----------------------Upload file------------------------------
  	    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
	    public String uploadFileHandler(HttpServletRequest request, Model model,
	            @RequestParam("file") MultipartFile[] files) {
	 
	        // Thư mục gốc upload file.
	    	String uploadRootPath = "E:\\Spring\\workspace\\example2\\src\\main\\webapp\\resources\\uploadFile";
	        System.out.println("uploadRootPath=" + uploadRootPath);
	 
	        File uploadRootDir = new File(uploadRootPath);
	        //
	        // Tạo thư mục gốc upload nếu nó không tồn tại.
	        if (!uploadRootDir.exists()) {
	            uploadRootDir.mkdirs();
	        }
	        //
	        List<File> uploadedFiles = new ArrayList<File>();
	        for (int i = 0; i < files.length; i++) {
	            MultipartFile file = files[i];
	 
	            // Tên file gốc tại Client.
	     
	            String name = UUID.randomUUID().toString()+file.getOriginalFilename();
	            System.out.println("Client File Name = " + name);
	 
	            if (!file.isEmpty()) {
	            
	                try {
	                 	byte[] bytes = file.getBytes();
	                	if(file.getSize()>1000000)
		   	            {
		   	            	name = "thumbnail" +UUID.randomUUID().toString()+"__"+file.getOriginalFilename();
		   	            }else
		   	            {
		   	            	name = UUID.randomUUID().toString()+"__"+file.getOriginalFilename();
		   	            }
	                    ImageUpload imageUpload = new ImageUpload();
	                    imageUpload.saveImage(bytes, name, uploadRootPath);
	                   
	 
	               
	                } catch (Exception e) {
	                	e.printStackTrace();
	                }
	            }
	         
	        }
	        model.addAttribute("uploadedFiles", uploadedFiles);
	        return "redirect:productList";
	    }
	    
	
	//----------------------------------------------------------------
	
	//----------------------------------------------------------------
	
	//--------------------------Admin Page-----------------------------
	@RequestMapping(value ="index", method = RequestMethod.GET)
	public String adminpage(Model model) {
		
		return "admin/adminMainPage";
		//return "../jsp/hello";
	}
	
	@RequestMapping(value="backtoMain", method = RequestMethod.GET)
	public String backtoMain(){
		return "admin/adminMainPage";
	}
	
	@RequestMapping(value="datetimepicker", method = RequestMethod.GET)
	public String datatimepickertest(){
		return "admin/dataTimePicker";
	}
	
	
	
}
