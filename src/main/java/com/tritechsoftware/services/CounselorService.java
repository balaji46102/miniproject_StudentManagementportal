package com.tritechsoftware.services;

import com.tritechsoftware.bindings.DashboardResponse;
import com.tritechsoftware.entities.Counselor;

public interface CounselorService
{
	public String saveCounselor(Counselor c);
	
	public Counselor logInCheck(String email,String pwd);
	
	public  boolean recoverPwd(String email);
	
	public DashboardResponse getDashboardInfo(Integer cid);

}
