package com.ge.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ge.dao.DeptDaoImpl;
import com.ge.entity.Dept;

@Controller
@RequestMapping(value="/dept")
public class DeptAction {
    @Resource
    private DeptDaoImpl deptDao;

    @RequestMapping(value="/insert")
    public String insert(Dept dept){
        System.out.println("---action.dept:"+dept);
        deptDao.insertDept(dept);
        return "forward:/jsp/main.jsp";
    }
}
