package com.service.impl;

import com.dao.DeptDao;
import com.service.DeptService;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public void deleteDept(int id) {
        deptDao.deleteDept(id);
    }
}
