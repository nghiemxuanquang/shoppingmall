package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.Category;


@Service
public class CategoryServiceImp implements CategoryService{

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<Category> getListCate() {
		// TODO Auto-generated method stub
		List<Category> cateList = sqlSession.selectList("CategoryControlMapper.getCateList");
		return cateList;
	}

	@Override
	public List<Category> getParentList() {
		// TODO Auto-generated method stub
		List<Category> parentList = sqlSession.selectList("CategoryControlMapper.getParentCate");
		return parentList;
	}

	@Override
	public Category getCateByID(int id) {
		// TODO Auto-generated method stub
		Category cate = sqlSession.selectOne("CategoryControlMapper.selectOneCate",id);
		return cate;
	}

	@Override
	public void updateParentCate(Category ParentCate) {
		// TODO Auto-generated method stub
		sqlSession.update("CategoryControlMapper.modifyParentCate",ParentCate);
	}

	@Override
	public void updateChildCate(Category ChildCate) {
		// TODO Auto-generated method stub
		sqlSession.update("CategoryControlMapper.modifyChildCate",ChildCate);
	}

	@Override
	public void addNewParentCate(Category cate) {
		// TODO Auto-generated method stub
		sqlSession.insert("CategoryControlMapper.insertParentCate",cate);
	}

	@Override
	public void addNewChildCate(Category cate) {
		// TODO Auto-generated method stub
		sqlSession.insert("CategoryControlMapper.insertChildCate",cate);
		
	}

	@Override
	public void deleteCate(Category cate) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("CategoryControlMapper.deleteParentCate",cate);
	}

	@Override
	public ArrayList<HashMap<String, String>> getCategoryList() {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<HashMap<String, String>> cateList =(ArrayList)sqlSession.selectList("CategoryControlMapper.getCategoryList");
		return cateList;
		
	}

	@Override
	public List<Category> getChildList() {
		// TODO Auto-generated method stub
		List<Category> childList = sqlSession.selectList("CategoryControlMapper.getChildCate");
		return childList;
	}
}
