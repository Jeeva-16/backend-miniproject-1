package com.example.Emp_manage.Dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDto {
   private Long id;
   @NotEmpty(message = "name cannot be empty")
   private String name;
   @NotEmpty(message = "email cannot be empty")

   private String email;
   @NotEmpty(message = "role cannot be empty")

   private String role;
}
