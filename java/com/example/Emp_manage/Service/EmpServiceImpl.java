package com.example.Emp_manage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Emp_manage.Dto.EmpDto;
import com.example.Emp_manage.Entity.EmpEntity;
import com.example.Emp_manage.Mapper.EmpMapper;
import com.example.Emp_manage.Repository.EmpRepository;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
	private EmpRepository empRepository;
    @Autowired
    private EmpMapper empMapper;

	@Override
	public List<EmpDto> getAllEmp() {
      List<EmpEntity> empEntity = empRepository.findAll();
		return empEntity.stream().map(EmpMapper :: mapToEmpDto).toList();
	}

	@Override
	public EmpDto updateUser(Long id, EmpDto empDto) {
		
		
		return null;
	}
	  
	@Override
	public EmpDto saveEmp(EmpDto empDto) {
		EmpEntity empEntity = empMapper.mapToEmpEntity(empDto);
		EmpDto returnedDto = empRepository.save(empDto);
		return returnedDto;
	}

	@Override
	public void  deleteEmp(Long id) {
		 empRepository.deleteById(id);;
	}

	@Override
	public EmpDto getEmpById(Long id) {
		EmpEntity empEntity = empRepository.findById(id).orElse(null);
		EmpDto returnedDto = EmpMapper.mapToEmpDto(empEntity);
		return returnedDto;
	}

}
