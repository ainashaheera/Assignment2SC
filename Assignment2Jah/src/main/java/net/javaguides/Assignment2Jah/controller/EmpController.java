package net.javaguides.Assignment2Jah.controller;

import net.javaguides.Assignment2Jah.entity.Emp;
import net.javaguides.Assignment2Jah.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService service;

    @PostMapping("/addEmp")
    public Emp addEmp(@RequestBody Emp emp) {
        return service.saveEmp(emp);
    }

    @PostMapping("/addEmps")
    public List<Emp> addEmps(@RequestBody List<Emp> emps) {
        return service.saveEmps(emps);
    }

    @GetMapping("/emps")
    public List<Emp> findAllEmps() {
        return service.getEmps();
    }

    @GetMapping("/empById/{id}")
    public Emp findEmpById(@PathVariable int id) {
        return service.getEmpById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id) {
        return service.deleteEmp(id);
    }
}
