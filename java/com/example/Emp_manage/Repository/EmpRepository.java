package com.example.Emp_manage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Emp_manage.Dto.EmpDto;
import com.example.Emp_manage.Entity.EmpEntity;
@Repository
public interface EmpRepository extends JpaRepository<EmpEntity,Long>{

	EmpDto save(EmpDto empDto);

	
	

}
