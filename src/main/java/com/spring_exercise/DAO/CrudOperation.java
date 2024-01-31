package com.spring_exercise.DAO;

import java.util.List;

public interface CrudOperation<T> {
    List<T> findAll();
    T findById(int id);
    T save(T toSave);
    boolean deleteById(int id);
    T update(T toUpdate);
}
