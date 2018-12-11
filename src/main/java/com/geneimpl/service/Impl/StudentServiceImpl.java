package com.geneimpl.service.Impl;

import com.geneimpl.dao.StudentMapper;
import com.geneimpl.model.Student;
import com.geneimpl.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
   @Resource(name = "StudentMapper")
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStuByName(String stuname) {
        return studentMapper.getStuByName(stuname);
    }



}
