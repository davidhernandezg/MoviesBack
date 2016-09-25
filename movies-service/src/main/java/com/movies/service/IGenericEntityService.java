package com.movies.service;

import java.util.List;

public interface IGenericEntityService<T, ID> {

    public List<T> findAll();

    public void save(T entity);

    public T findOne(long id);

    public void delete(long id);

    public List<T> findByName(String name);

}
