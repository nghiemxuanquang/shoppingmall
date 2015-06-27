package com.exp.service;

import java.util.List;


import com.exp.model.FAQs;

public interface FAQsService {
	public List<FAQs> getfaqList();
	
	FAQs getFAQByID(int id);
	public void updateFAQ(FAQs faq);
	
	public void deleteFAQ(FAQs faq);
	public void addNewFAQ(FAQs faq);
}
