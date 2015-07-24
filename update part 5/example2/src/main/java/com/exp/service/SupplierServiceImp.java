package com.exp.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.Supplier;
@Service
public class SupplierServiceImp implements SupplierService {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<Supplier> getListSupplier() {
		// TODO Auto-generated method stub
		List<Supplier> listSupp = sqlSession.selectList("SupplierControlMapper.getSupplierList");
		return listSupp;
	}

	@Override
	public Supplier getSupplierByID(int id) {
		// TODO Auto-generated method stub
		Supplier supp = sqlSession.selectOne("SupplierControlMapper.selectOneSupplier",id);
		return supp;
	}

	@Override
	public void createNewSupplier(Supplier supp) {
		// TODO Auto-generated method stub\
		sqlSession.insert("SupplierControlMapper.insertSupplier",supp);
		
	}

	@Override
	public void updateSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		sqlSession.update("SupplierControlMapper.modifySupplier",supp);
		
	}

	@Override
	public void deleteSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("SupplierControlMapper.deleteSupplier",supp);
	}

}
