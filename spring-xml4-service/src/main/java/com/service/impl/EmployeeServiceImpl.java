package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;
import com.service.DeptService;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DeptDao deptDao;

    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return employeeDao.getAll(pageNum, pageSize);
    }
    @Transactional
    public void deleteEmp(int id) {
        employeeDao.deleteEmp(id);
        deptDao.deleteDept(id);
    }
}
