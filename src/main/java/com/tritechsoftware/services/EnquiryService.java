package com.tritechsoftware.services;

import java.util.List;

import com.tritechsoftware.bindings.SearchCriteria;
import com.tritechsoftware.entities.Counselor;
import com.tritechsoftware.entities.StudentEnq;

public interface EnquiryService 
{
	public boolean addEnq(StudentEnq se);
	
	public List<StudentEnq> getEnquiries(Integer cid,SearchCriteria s);

}
