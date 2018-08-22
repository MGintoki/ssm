package com.my.oa.biz;

import com.my.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn,String password);
    void changePassword(Employee employee);
}
