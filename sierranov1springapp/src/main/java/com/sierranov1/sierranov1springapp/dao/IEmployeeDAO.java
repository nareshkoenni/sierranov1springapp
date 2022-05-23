package com.sierranov1.sierranov1springapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;


//Repository/CRUDRepository <--- JpaRepository  <--- IEmployeeDAO  <== EmployeeService  <== main/action
//All CRUD opertaions are already specified and implemented in spring boot
public interface IEmployeeDAO extends JpaRepository<Employee,Integer>{
}
