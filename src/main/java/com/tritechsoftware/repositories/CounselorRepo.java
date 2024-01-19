package com.tritechsoftware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tritechsoftware.entities.Counselor;

public interface CounselorRepo extends JpaRepository<Counselor, Integer>
{
    public Counselor findByEmail(String email);
	public Counselor findByEmailAndPwd(String email,String pwd);
}
