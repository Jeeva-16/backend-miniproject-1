package com.example.Emp_manage.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Emp_manage.Dto.EmpDto;
import com.example.Emp_manage.Entity.EmpEntity;

@Component
public class EmpMapper {
	
	public static EmpDto mapToEmpDto(EmpEntity empEntity) {
		EmpDto empDto = new EmpDto();
		BeanUtils.copyProperties(empEntity, empDto);
		return empDto;
	}
	
	public static EmpEntity mapToEmpEntity(EmpDto empDto) {
		EmpEntity empEntity = new EmpEntity();
		BeanUtils.copyProperties(empDto, empEntity);
		return empEntity;
	}

}
