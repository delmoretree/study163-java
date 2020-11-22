package tech.technote.delmore.repositories;

import tech.technote.delmore.entity.Students;

import java.util.List;

public interface StudentsRepository {

    List<Students> findAll();
    Students findById(int id);
}
