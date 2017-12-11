package com.ge.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ge.entity.Dept;

@Repository("deptDao")
public class DeptDaoImpl{

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 根据部门编号查询部门信息 
     * @param deptId 部门编号
     * @return 部门信息
     */
    public Dept selectDept(Integer deptId){ 
        Dept dept=  sqlSessionTemplate.selectOne("com.ge.entity.DeptMapper.selectDept", deptId);         
        return dept;
    }
    /**
     * 添加部门信息 
     * @param dept 部门信息
     * @return 添加成功的记录数
     */
    public int insertDept(Dept dept){
            System.out.println("------dao.dept:"+dept);
            return sqlSessionTemplate.insert("com.ge.entity.DeptMapper.insertDept", dept);           
    }
}