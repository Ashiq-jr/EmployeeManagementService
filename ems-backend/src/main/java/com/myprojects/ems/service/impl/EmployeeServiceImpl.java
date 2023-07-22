package com.myprojects.ems.service.impl;

import com.myprojects.ems.dto.EmployeeDto;
import com.myprojects.ems.entity.Employee;
import com.myprojects.ems.repository.EmployeeRepository;
import com.myprojects.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
