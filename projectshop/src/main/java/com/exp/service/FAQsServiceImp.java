package com.exp.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.FAQs;

@Service
public class FAQsServiceImp implements FAQsService{


	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<FAQs> getfaqList() {
		// TODO Auto-generated method stub
		List<FAQs> listFAQ = sqlSession.selectList("FAQsControlMapper.getFAQList");
		return listFAQ;
	}

	@Override
	public void deleteFAQ(FAQs faq) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("FAQsControlMapper.deleteFAQ",faq);
	}

	@Override
	public void addNewFAQ(FAQs faq) {
		// TODO Auto-generated method stub
		sqlSession.insert("FAQsControlMapper.insertFAQ",faq);
		
	}

	@Override
	public FAQs getFAQByID(int id) {
		// TODO Auto-generated method stub
		FAQs modifyFAQ = sqlSession.selectOne("FAQsControlMapper.selectOneFAQ",id);
		return modifyFAQ;
	}

	@Override
	public void updateFAQ(FAQs faq) {
		// TODO Auto-generated method stub
		sqlSession.update("FAQsControlMapper.modifyFAQ",faq);
		
	}

}
