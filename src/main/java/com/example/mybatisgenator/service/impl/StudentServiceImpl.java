package com.example.mybatisgenator.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisgenator.domain.Student;
import com.example.mybatisgenator.mapper.StudentMapper;
import com.example.mybatisgenator.service.StudentService;
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService{

}
