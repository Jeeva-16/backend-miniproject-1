package com.example.Emp_manage.Service;

import java.util.List;

import com.example.Emp_manage.Dto.EmpDto;

public interface EmpService {

	 
	 List<EmpDto> getAllEmp();
	 
	 EmpDto updateUser(Long id, EmpDto empDto);
	 
	 EmpDto saveEmp(EmpDto empDto);
	 
	 void deleteEmp(Long id);
	 EmpDto getEmpById(Long id);

}
