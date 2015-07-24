package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.exp.model.Category;


public interface CategoryService {
	public List<Category> getListCate();
	public List<Category> getParentList();
	public List<Category> getChildList();
	public ArrayList<HashMap<String, String>> getCategoryList();
	Category getCateByID(int id);
	public void updateParentCate(Category ParentCate);
	public void updateChildCate(Category ChildCate);
	public void addNewParentCate(Category cate);
	public void addNewChildCate(Category cate);
	public void deleteCate(Category cate);
	
}
