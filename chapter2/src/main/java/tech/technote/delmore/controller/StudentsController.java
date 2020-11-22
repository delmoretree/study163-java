package tech.technote.delmore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tech.technote.delmore.entity.Students;
import tech.technote.delmore.repositories.StudentsRepository;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentsController {

    @Resource
    private StudentsRepository studentsRepository;

    @RequestMapping(value = "students", method = RequestMethod.GET)
    public List<Students> getAll() {
        return studentsRepository.findAll();
    }

    @RequestMapping(value = "students/{id}", method = RequestMethod.GET)
    public Students find(@PathVariable int id) {
        return studentsRepository.findById(id);

    }
}
