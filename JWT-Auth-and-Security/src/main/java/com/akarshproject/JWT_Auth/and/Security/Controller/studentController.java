package com.akarshproject.JWT_Auth.and.Security.Controller;
import com.akarshproject.JWT_Auth.and.Security.Model.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController
{
    private List<student> ls = new ArrayList<>(List.of(
            new student(1,"Akarsh Jain",99),
            new student(2,"Bob Jain",95)));

    @GetMapping("/students")
    public List<student> getStudent()
    {
        return ls;
    }

    @PostMapping("/students")
    public student addstudent(@RequestBody student stu)
    {
        ls.add(stu);
        return stu;
    }
}