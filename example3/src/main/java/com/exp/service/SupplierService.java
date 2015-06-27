package com.exp.service;

import java.util.List;

import com.exp.model.Supplier;

public interface SupplierService {
	public List<Supplier> getListSupplier();
	public Supplier getSupplierByID(int id);
	public void createNewSupplier(Supplier supp);
	public void updateSupplier(Supplier supp);
	public void deleteSupplier(Supplier supp);
}
