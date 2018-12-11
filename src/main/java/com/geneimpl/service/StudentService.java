package com.geneimpl.service;

import com.geneimpl.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    public List<Student> getStuByName(String stuname);
}
