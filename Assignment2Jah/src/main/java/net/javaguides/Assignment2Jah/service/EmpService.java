package net.javaguides.Assignment2Jah.service;

import net.javaguides.Assignment2Jah.entity.Emp;
import net.javaguides.Assignment2Jah.repository.EmpRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepository repository;

    public Emp saveEmp(Emp emp) {
        return repository.save(emp);
    }

    public List<Emp> saveEmps(List<Emp> emps) {
        return repository.saveAll(emps);
    }

    public List<Emp> getEmps() {
        return repository.findAll();
    }

    public Emp getEmpById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Emp getEmpByName(String name) {
        return repository.findByName(name);
    }

    public String deleteEmp(int id) {
        repository.deleteById(id);
        return "Employee has been removed. " + id;
    }

    public Emp updateEmp(Emp emp) {
        Emp existingSalary = repository.findById(emp.getId()).orElse(null);
        existingSalary.setName(emp.getName());
        existingSalary.setPosition(emp.getPosition());
        existingSalary.setSalary(emp.getSalary());
        return repository.save(existingSalary);
    }


}
