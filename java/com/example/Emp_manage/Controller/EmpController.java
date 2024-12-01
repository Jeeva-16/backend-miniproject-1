package com.example.Emp_manage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Emp_manage.Dto.EmpDto;
import com.example.Emp_manage.Service.EmpService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmpController {
	@Autowired
    private EmpService empService;
	
	@GetMapping("/employee-list")
	public String viewAllEmp(Model model) {
		List<EmpDto> empDto = empService.getAllEmp();
		model.addAttribute("empDto", empDto);
		return "employee-list";
		
	}
	
	@GetMapping("/employee-form")
	public String showCreateForm(Model model) {
		model.addAttribute("empDto", new EmpDto());
		return "employee-form";
	}
	
	@PostMapping("/employee-form/save")
	public String saveEmployee(@ModelAttribute("empDto") EmpDto empDto,Model model) {
		empService.saveEmp(empDto);
		return "redirect:/employees";
	}
	 @GetMapping("/edit/{id}")
	    public String showEditForm(@PathVariable Long id, Model model) {
	        EmpDto empDto = empService.getEmpById(id);
	        model.addAttribute("empdto", empDto);
	        return "employee-form";
	    }
	   @DeleteMapping("/delete/{id}")
	    public String deleteEmployee(@PathVariable Long id) {
	        empService.deleteEmp(id);
	        return "redirect:/employees";
	    }
}
